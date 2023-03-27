package com.example.mvcobserver;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;

import java.util.Observable;


public class HelloController extends Observable {
    @FXML
    Label resultLabel;


    public void generate(){
        setChanged();
        notifyObservers();

    }

    public void display(int result){
        resultLabel.textProperty().set(String.valueOf(result));
    }

    public void close(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void newFile(ActionEvent actionEvent) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        fileChooser.showOpenDialog(null);

    }
}