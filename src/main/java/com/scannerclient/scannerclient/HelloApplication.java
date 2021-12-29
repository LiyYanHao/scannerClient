package com.scannerclient.scannerclient;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");


        stage.setScene(scene);
        stage.show();
    }

/*    @Override
    public void start(Stage stage) {
        VBox box = new VBox();
        final Scene scene = new Scene(box,300, 250);
        scene.setFill(null);

        Line line = new Line();
        line.setStartX(0.0f);
        line.setStartY(0.0f);
        line.setEndX(100.0f);
        line.setEndY(100.0f);

        box.getChildren().add(line);

        stage.setScene(scene);
        stage.show();
    }*/


    public static void main(String[] args) {
        launch();
    }
}