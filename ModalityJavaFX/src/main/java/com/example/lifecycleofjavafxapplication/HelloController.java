package com.example.lifecycleofjavafxapplication;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {

        //For opening new window
        /*
        Stage stage=new Stage();
        stage.show();
         */

        //  Modality.NONE
        /*
        Stage stage =new Stage();
        stage.initModality(Modality.NONE);
        stage.setTitle("New Window using Modality.None");
        stage.show();
        */

        //Modality.APPLICATION_MODAL
        /*Stage stage =new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("New Window using APPLICATION_MODAL");
        stage.show();*/

        //WINDOW_MODAL
        /*Stage stage =new Stage();
        stage.initModality(Modality.WINDOW_MODAL);
        stage.setTitle("New Window using WINDOW_MODAL");
        stage.show();*/

//Undecorated
        /*Stage stage =new Stage(StageStyle.UNDECORATED);
        stage.initModality(Modality.WINDOW_MODAL);
        stage.setTitle("New Window using Undecorated Style");
        Pane pane=new Pane(); //ye parent component hai jiske andar hum apne components i.e scene load kar rahe parent component kuch bhi ho sakta hai jaise vbox etc.
        Scene scene=new Scene(pane);
        scene.setFill(Paint.valueOf("red"));
        stage.setScene(scene);
        stage.show();*/


    }
}