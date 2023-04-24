package main;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends  Application{
    public static void main(String[] args) {
        launch();
        }

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../view/MainForm.fxml"));
        stage.setTitle("Inventory Management System");
        stage.setScene(new Scene(root));
        stage.show();
    }
}
