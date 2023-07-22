package org.example.welcome_page;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import org.example.PlayGame;
import org.example.bagelsgame.BagelsGame;
import org.example.numbergenerator.NumberGenerator;
import org.example.validator.Validator;

import java.util.List;

public class HomePage {
    private static Image icon = new Image("C:\\Users\\hifi\\OneDrive\\Desktop\\Java work\\bagels\\src\\main\\resources\\org\\example\\bagels1\\mystery.png");

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

        // Create labels, input fields, and buttons for the game.
//        Label instructionLabel = new Label("Enter your guess (3-digit number):");
//        TextField inputField = new TextField();
        Button startButton = new Button("Start");
        Button settingsButton = new Button("Setting");

        // Apply CSS to make the buttons black and white text
        String buttonStyle = "-fx-background-color: black; -fx-text-fill: white;";
        startButton.setStyle(buttonStyle);
        settingsButton.setStyle(buttonStyle);


        // Add the title label to the main layout
        root.getChildren().addAll(titleLabel, startButton, settingsButton);

//        final int NUM_DIGITS = 3;
//
//        // The number of guesses remaining for the player.
//        List<Integer> secretCode = NumberGenerator.generateSecretCode(NUM_DIGITS);
//
//        // Convert the secret code to a string for easier comparison with user input.
//        String stringCode = NumberGenerator.listToString(secretCode);
//        System.out.println(stringCode);


        // Event handling for the "Guess" button
        startButton.setOnAction(e -> {
            PlayGame.playGame(stage);
//            String userInput = inputField.getText();
//            if (Validator.isUserInputValid(userInput,NUM_DIGITS)){
//                String feedback = BagelsGame.countOutcome(userInput,stringCode);
//                System.out.println(feedback);
//            }
//            else{
//                System.out.println("Invalid input");
//            }
//            inputField.clear();
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

//        // Create a ToggleGroup for RadioButtons representing difficulty levels
//        ToggleGroup difficultyGroup = new ToggleGroup();
//
//        // Create RadioButtons for each difficulty level
//        RadioButton easyRadioButton = new RadioButton("Easy");
//        easyRadioButton.setToggleGroup(difficultyGroup);
//        easyRadioButton.setSelected(true); // Set the default selection to Easy
//
//        RadioButton mediumRadioButton = new RadioButton("Medium");
//        mediumRadioButton.setToggleGroup(difficultyGroup);
//
//        RadioButton hardRadioButton = new RadioButton("Hard");
//        hardRadioButton.setToggleGroup(difficultyGroup);

        // Create a ComboBox for selecting difficulty levels
        ComboBox<String> difficultyComboBox = new ComboBox<>();
        difficultyComboBox.getItems().addAll("Easy", "Medium", "Hard");
        difficultyComboBox.setValue("Easy");

        root.getChildren().addAll(titleLabel, difficultyComboBox);

        Scene scene = new Scene(root, 400, 400);
        stage.setScene(scene);

        stage.show();
    }
}