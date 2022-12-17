package mvc.viewTest;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.testfx.api.FxRobot;
import org.testfx.assertions.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;

import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import mvc.view.*;
import mvc.controller.*;

@ExtendWith(ApplicationExtension.class)
class MainFXTest {
    private MainFX main;

    /**
     * Will be called with {@code @Before} semantics, i. e. before each test method.
     *
     * @param stage - Will be injected by the test runner.
     */
    @Start
    private void start(Stage stage) {
        main = new MainFX();
        
        assertDoesNotThrow(() -> main.start(stage));
    }

    /** @param robot - Will be injected by the test runner.*/
    @Test
    @Order(1)
    void should_contain_Buttons(FxRobot robot) {
        Set<Button> buttons = robot.lookup(".button").queryAllAs(Button.class);

        Assertions.assertThat(buttons).hasSize(3);
        Assertions.assertThat(buttons).extracting(Button::getText).contains("Add", "Delete", "Edit");
    }

    /** @param robot - Will be injected by the test runner.*/
    @Test
    @Order(2)
    void should_contain_ListView(FxRobot robot) {
        ListView<Book> listView = robot.lookup("#lst_books").queryAs(ListView.class);

        Assertions.assertThat(listView).isNotNull();
    }

    /** @param robot - Will be injected by the test runner.*/
    @ParameterizedTest
    @Order(3)
    void test_addBook(FxRobot robot) {
        createBook(robot, "Title", "Author", "2020", "1234567890");

        ListView<Book> listView = robot.lookup("#lst_books").queryAs(ListView.class);
        Assertions.assertThat(listView.getItems()).hasSize(1);
    }

    /** @param robot - Will be injected by the test runner.*/
    @Test
    @Order(4)
    void test_deleteBook(FxRobot robot) {
        createBook(robot, "TitleToDelete", "AuthorToDelete", "2020", "1-123-23462-1");
        ListView<Book> listView = robot.lookup("#lst_books").queryAs(ListView.class);
        Assertions.assertThat(listView.getItems()).hasSize(1);

        robot.clickOn(
            listView.localToScene(listView.getBoundsInLocal()).getMinX() + 5, 
            listView.localToScene(listView.getBoundsInLocal()).getMinY() + 5
            );
        robot.clickOn("#btn_delete");

        Assertions.assertThat(listView.getItems()).hasSize(0);
    }


    //---------------------------------- HELPER METHODS ----------------------------------//
    private void createBook(FxRobot robot, String title, String author, String year, String isbn) {
        robot.clickOn("#btn_add");
        robot.clickOn("#txt_title").write(title);
        robot.clickOn("#txt_author").write(author);
        robot.clickOn("#txt_year").write(year);
        robot.clickOn("#txt_isbn").write(isbn);

        //click on the "OK" button
        //query ok button
        Button okButton = robot.lookup(".button").queryAllAs(Button.class).stream()
                .filter(button -> button.getText().equals("OK"))
                .findFirst().get();

        robot.clickOn(okButton);
    }
}