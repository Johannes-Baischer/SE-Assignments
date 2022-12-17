package mvc.viewTest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxRobot;
import org.testfx.assertions.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import mvc.view.MainFX;

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

    /**
     * @param robot - Will be injected by the test runner.
     */
    @Test
    void should_contain_addbutton(FxRobot robot) {
        Assertions.assertThat(robot.lookup(".button").queryButton()).hasText("Add");
    }
}