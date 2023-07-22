package org.example.bagels1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class BagelsGUI extends Application {
    @Override
    public void start(Stage stage){
        // Create the main layout (VBox)
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setSpacing(20);
        root.setPadding(new Insets(20));

        // Set the background color to a soft, non-distracting color
        BackgroundFill backgroundFill = new BackgroundFill(Color.LIGHTGRAY, CornerRadii.EMPTY, Insets.EMPTY);
        Background background = new Background(backgroundFill);
        root.setBackground(background);

        // Create the game title label with a large font size
        Label titleLabel = new Label("Bagels MasterMind");
        titleLabel.setFont(Font.font("Arial", 36));

        // Add the title label to the main layout
        root.getChildren().add(titleLabel);

        // Create and set up other components for the game, such as labels, input fields, and buttons.

        // Create the scene with the main layout and set it to the primary stage
        Scene scene = new Scene(root, 400, 400);
        stage.setTitle("Bagels MasterMind");
        stage.setScene(scene);

        // Show the primary stage
        stage.show();

//        FXMLLoader fxmlLoader = new FXMLLoader(BagelsGUI.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//        stage.setTitle("Hello!");
//        stage.setScene(scene);
//        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}