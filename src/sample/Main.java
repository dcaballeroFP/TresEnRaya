package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Control;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/sample/TresEnRaya.fxml"));
        primaryStage.setTitle("Tres en Raya");
        Scene scene = new Scene(root,600,400);
        primaryStage.setScene(scene);
        scene.getStylesheets().add(getClass().getResource("/sample/aplication.css").toExternalForm());
        primaryStage.show();
        Controller controller = new Controller();
        controller.startName();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
//ghdsfjhdjkshfjklsd