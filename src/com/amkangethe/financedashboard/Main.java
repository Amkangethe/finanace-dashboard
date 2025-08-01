package com.amkangethe.financedashboard;

import javafx.application.Application;
import javafx.stage.Stage;
import com.amkangethe.financedashboard.ui.Dashboard;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Dashboard dashboard = new Dashboard();
        dashboard.start(primaryStage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
