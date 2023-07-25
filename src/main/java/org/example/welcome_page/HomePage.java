package org.example.welcome_page;

import javafx.animation.TranslateTransition;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
import org.example.Main;
import org.example.PlayGame;
import org.example.bagelsgame.BagelsGame;
import org.example.numbergenerator.NumberGenerator;
import org.example.validator.Validator;

import java.util.List;

public class HomePage {
    private static Image icon = new Image("C:\\Users\\hifi\\OneDrive\\Desktop\\Java work\\bagels\\src\\main\\resources\\org\\example\\bagels1\\mystery.png");
    private static String difficulty;

    public static void welcomeScene(Stage stage){
        // Set the game icon
//        Image icon =
        stage.getIcons().add(icon);

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

        // Create buttons for starting the game and to have access to the settings.
        Button startButton = new Button("Start");
        Button settingsButton = new Button("Setting");

        // Apply CSS to make the buttons black and white text
        String buttonStyle = "-fx-background-color: black; -fx-text-fill: white;";
        startButton.setStyle(buttonStyle);
        settingsButton.setStyle(buttonStyle);


        // Add the title label to the main layout
        root.getChildren().addAll(titleLabel, startButton, settingsButton);

        // Event handling for the "Start" button
        startButton.setOnAction(e -> {
            PlayGame.playGame(stage);
//            aboutTextScene(stage);
        });

        settingsButton.setOnAction(e -> {
            settingScene(stage);
        });

        // Create the scene with the main layout and set it to the primary stage
        Scene scene = new Scene(root, 400, 400);
        stage.setTitle("Bagels MasterMind");
        stage.setScene(scene);

        // Show the primary stage
        stage.show();

    }

    private static void settingScene(Stage stage){

        stage.getIcons().add(icon);

        VBox root = new VBox();
        root.setAlignment(Pos.TOP_CENTER);
        root.setSpacing(20);
        root.setPadding(new Insets(20));

        BackgroundFill backgroundFill = new BackgroundFill(Color.LIGHTGRAY, CornerRadii.EMPTY, Insets.EMPTY);
        Background background = new Background(backgroundFill);
        root.setBackground(background);

        Label titleLabel = new Label("Bagels Mastermind");
        titleLabel.setFont(Font.font("Arial", 36));

        // Create an HBox for the difficulty selection
        HBox difficultyBox = new HBox();
        difficultyBox.setAlignment(Pos.CENTER);
        difficultyBox.setSpacing(10);



        // Create a Label for the difficulty selection
        Label difficultyLabel = new Label("Difficulty:");
        difficultyLabel.setFont(Font.font("Arial", 16));

        // Create a ComboBox for selecting difficulty levels
        ComboBox<String> difficultyComboBox = new ComboBox<>();
        difficultyComboBox.getItems().addAll("Easy", "Medium", "Hard");
        difficultyComboBox.setValue("Easy");

//        difficulty = difficultyComboBox.getValue();
//        System.out.println(difficulty);

        difficultyBox.getChildren().addAll(difficultyLabel, difficultyComboBox);

        // Create an HBox for the sound selection
        HBox soundBox = new HBox();
        soundBox.setAlignment(Pos.CENTER);
        soundBox.setSpacing(10);

        Label soundLabel = new Label("Sound:");
        soundLabel.setFont(Font.font("Arial", 16));


        // Create a ToggleGroup for RadioButtons representing sound selection
        ToggleGroup soundGroup = new ToggleGroup();

        // Create RadioButtons for each difficulty level
        RadioButton onRadioButton = new RadioButton("On");
        onRadioButton.setToggleGroup(soundGroup);
        onRadioButton.setSelected(true); // Set the default selection to Easy

        RadioButton offRadioButton = new RadioButton("Off");
        offRadioButton.setToggleGroup(soundGroup);


        soundBox.getChildren().addAll(soundLabel, onRadioButton, offRadioButton);

        Button homeButton = new Button("Home");

        // Apply CSS to make the buttons black and white text
        String buttonStyle = "-fx-background-color: black; -fx-text-fill: white;";
        homeButton.setStyle(buttonStyle);

        homeButton.setOnAction(e -> {
            welcomeScene(stage);
        });

        root.getChildren().addAll(titleLabel, difficultyBox, soundBox, homeButton);

        Scene scene = new Scene(root, 400, 400);
        stage.setScene(scene);

        stage.show();
    }

    private static void aboutTextScene(Stage stage){

        stage.getIcons().add(icon);

        stage.setTitle("About");

        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);

        BackgroundFill backgroundFill = new BackgroundFill(Color.LIGHTGRAY, CornerRadii.EMPTY, Insets.EMPTY);
        Background background = new Background(backgroundFill);
        root.setBackground(background);

        // Create the rolling text
        Text rollingText = new Text(Main.welcomeMessage());
        rollingText.setFont(Font.font("Arial", 24));
        rollingText.setFill(Color.BLACK);

        root.getChildren().add(rollingText);

//        // Create a TranslateTransition to animate the text from top to bottom
//        TranslateTransition translateTransition = new TranslateTransition(Duration.seconds(5), rollingText);
//        translateTransition.setFromY(-100); // Start the text off the screen above
//        translateTransition.setToY(500); // End the text off the screen below
//        translateTransition.setCycleCount(1); // Set the animation to play once
//        translateTransition.setAutoReverse(false); // Don't reverse the animation

        Scene scene = new Scene(root, 400, 300);
        stage.setScene(scene);
        stage.show();

        // Start the rolling text animation
//        translateTransition.play();


    }
}
