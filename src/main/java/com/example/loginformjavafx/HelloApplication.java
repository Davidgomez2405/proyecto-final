package com.example.loginformjavafx;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
// creating login form using JavaFX
public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        // Creating label email
    Text lbl1= new Text("Email");

    // creating label password
    Text lbl2=new Text("Password");

    //Creating text field for email

        TextField text1=new TextField();

    //Creating text field for password

    PasswordField text2=new PasswordField();

    //Creating buttons

        Button button1=new Button("Submit");
        Button button2=new Button("Clear");

    //creating a Grid Pane

        GridPane gridPane= new GridPane();

    // Setting the size for pane
        gridPane.setMinSize(400,200);

    //Setting the padding

    gridPane.setPadding(new Insets(20,20,20,20));

    //Setting the vertical and horizontal gaps between the columns
        gridPane.setVgap(10);
        gridPane.setHgap(10);

    //Setting the Grid alignment
    gridPane.setAlignment(Pos.CENTER);

    //Arranging all the nodes in the grid
    gridPane.add(lbl1,1,0);
    gridPane.add(text1,2,0);
    gridPane.add(lbl2,1,1);
    gridPane.add(text2,2,1);
    gridPane.add(button1,1,2);
    gridPane.add(button2,2,2);

    //Styling nodes
        button1.setStyle("-fx-background-color: blue; -fx-text-fill: white");
        button2.setStyle("-fx-background-color: blue; -fx-text-fill: white");


    //add image to the form

        Image image = new Image("https://t3.ftcdn.net/jpg/05/23/04/00/360_F_523040057_JYMTxoQGquklUthNLLjspI7ldR1hrFlH.jpg");
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(246);
        imageView.setFitHeight(90);
        gridPane.add(imageView, 0, 0, 1, 2);

    //Creating a scene object
        Scene scene=new Scene (gridPane);

    // Setting title to the stage

    stage.setTitle("Login page");

    //adding scene to the stage

     stage.setScene(scene);

     //displaying the contents of the stage
        stage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }
}