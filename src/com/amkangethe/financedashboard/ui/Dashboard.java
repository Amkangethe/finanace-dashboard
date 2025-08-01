package com.amkangethe.financedashboard.ui;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Dashboard {
    public void start(Stage stage) {
        BorderPane root = new BorderPane();
        // TODO: add chart nodes to root.setCenter(...)

        Scene scene = new Scene(root, 800, 600);
        stage.setTitle("Finance Insights Dashboard");
        stage.setScene(scene);
        stage.show();
    }
}