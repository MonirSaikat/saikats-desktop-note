package com.example.javafxfirst;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private Stage stg;

    @Override
    public void start(Stage stage) throws IOException {
        try {
            stg = stage;
            stage.setResizable(false);
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            stage.setTitle("Saikat!");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void  changeScene(String fxml)  throws IOException {
        Parent pane = FXMLLoader.load(HelloApplication.class.getResource(fxml));
        this.stg.getScene().setRoot(pane);
    }

    public static void main(String[] args) {
        launch(args);
    }
}