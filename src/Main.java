
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a Button
        Button btn = new Button("Click me!");
        btn.setOnAction(e -> btn.setText("Hello, JavaFX!"));

        // Layout root node
        StackPane root = new StackPane(btn);

        // Create and set the Scene
        Scene scene = new Scene(root, 400, 300);

        // Configure the Stage (window)
        primaryStage.setTitle("My JavaFX App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
