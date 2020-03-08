<<<<<<< Updated upstream
package Vraag1;
=======
package main.java.control;
>>>>>>> Stashed changes

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
<<<<<<< Updated upstream
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Oefening 1");
=======
        Parent root = FXMLLoader.load(getClass().getResource("GUI_Zoek.fxml"));
        primaryStage.setTitle("Planten Database");
>>>>>>> Stashed changes
        primaryStage.setScene(new Scene(root, 600, 600));
        primaryStage.show();
    }

<<<<<<< Updated upstream

=======
>>>>>>> Stashed changes
    public static void main(String[] args) {
        launch(args);
    }
}
