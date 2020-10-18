package com.srijan.javafx.pollution;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ResourceBundle;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) throws Exception {
        System.out.println(getClass().getResource("Main.fxml"));
        Parent rootParent = FXMLLoader.load(getClass().getResource("Main.fxml"), ResourceBundle.getBundle("com.srijan.javafx.pollution.Main"));
        stage.setScene(new Scene(rootParent));
        stage.centerOnScreen();
        stage.setMaximized(false);
        stage.show();
        System.out.println(ClassLoader.getSystemResource("Main.fxml"));
    }
}
