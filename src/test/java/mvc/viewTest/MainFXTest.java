package mvc.viewTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Map;

import javax.swing.JPanel;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import mvc.view.*;
import mvc.model.*;
import mvc.controller.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MainFXTest {
    private MainFX main;


    @BeforeEach
    void setUp() throws InterruptedException {
        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                new JPanel(); // Initializes the JavaFx Platform
                Platform.runLater(new Runnable() {

                    @Override
                    public void run() {
                        try { //initialize app
                            main = new MainFX();
                            main.start(new Stage());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        });
        thread.start();// Initialize the thread
        Thread.sleep(10000); // Time to use the app, with out this, the thread
    }

    @Test
    void test() {
        
    }
}
