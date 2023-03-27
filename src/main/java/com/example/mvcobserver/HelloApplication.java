package com.example.mvcobserver;

import Controller.Controller;
import Model.Model;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxl = new FXMLLoader();
        BorderPane root = fxl.load(getClass().getResource("hello-view.fxml").openStream());
        HelloController helloController = fxl.getController();
        Model model = new Model();
        Controller controller = new Controller(model, helloController);
        Scene scene = new Scene(root, 400, 400);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}