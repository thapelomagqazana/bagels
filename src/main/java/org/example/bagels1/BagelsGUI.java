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
import org.example.bagelsgame.BagelsGame;
import org.example.numbergenerator.NumberGenerator;
import org.example.validator.Validator;
import org.example.welcome_page.HomePage;

import java.util.List;

public class BagelsGUI extends Application {
    @Override
    public void start(Stage stage){
        HomePage.welcomeScene(stage);
    }


    public static void main(String[] args) {
        launch();
    }
}