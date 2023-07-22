package org.example.bagels1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class BagelsGUI extends Application {
    @Override
    public void start(Stage stage){
        // Set the game icon
        Image icon = new Image("C:\\Users\\hifi\\OneDrive\\Desktop\\Java work\\bagels\\src\\main\\resources\\org\\example\\bagels1\\mystery.png");
        stage.getIcons().add(icon);

        // Create the main layout (VBox)
        VBox root = new VBox();
        root.setAlignment(Pos.TOP_CENTER);
        root.setSpacing(20);
        root.setPadding(new Insets(20));

        // Set the background color to a soft, non-distracting color
        BackgroundFill backgroundFill = new BackgroundFill(Color.LIGHTGRAY, CornerRadii.EMPTY, Insets.EMPTY);
        Background background = new Background(backgroundFill);
        root.setBackground(background);

        // Create the game title label with a large font size
        Label titleLabel = new Label("Bagels MasterMind");
        titleLabel.setFont(Font.font("Arial", 36));

        // Create labels, input fields, and buttons for the game.
        Label instructionLabel = new Label("Enter your guess (3-digit number):");
        TextField inputField = new TextField();
        Button guessButton = new Button("Guess");
        Button newGameButton = new Button("New Game");


        // Add the title label to the main layout
        root.getChildren().addAll(titleLabel, instructionLabel, inputField, guessButton, newGameButton);


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