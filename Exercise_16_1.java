package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise_16_1 extends Application {
    double x = 10;
    double y = 100;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Text text = new Text(x, y, "JAVA");
        RadioButton red = new RadioButton("Red");
        RadioButton yellow = new RadioButton("Blue");
        RadioButton black = new RadioButton("Black");
        RadioButton orange = new RadioButton("Orange");
        RadioButton green = new RadioButton("Green");
        GridPane gridPane = new GridPane();
        gridPane.addRow(0,red,yellow,black,orange,green);

        ToggleGroup toggleGroup = new ToggleGroup();
        red.setToggleGroup(toggleGroup); yellow.setToggleGroup(toggleGroup);black.setToggleGroup(toggleGroup);orange.setToggleGroup(toggleGroup);green.setToggleGroup(toggleGroup);

        red.setOnAction(e->{
            text.setFill(Color.RED);
        });
        yellow.setOnAction(e->{
            text.setFill(Color.YELLOW);
        });
        black.setOnAction(e->{
            text.setFill(Color.BLACK);
        });
        orange.setOnAction(e->{
            text.setFill(Color.ORANGE);
        });
        green.setOnAction(e->{
            text.setFill(Color.GREEN);
        });


        Button right = new Button("=>");
        Button left = new Button("<=");
        right.setOnAction(e->{
            if(x <= primaryStage.getWidth()) {
                text.setX(x+=1);
            }
            else x = 0;
        });
        left.setOnAction(e->{
            if(!(text.getX() == 0)){
                text.setX(x-=1);
            }
        });

        BorderPane borderPane =new BorderPane();
        borderPane.getChildren().add(text);
        HBox hBox =new HBox();
        hBox.getChildren().addAll(left,right);
        borderPane.setBottom(new StackPane(hBox));
        borderPane.setTop(gridPane);
        primaryStage.setScene(new Scene(borderPane,500, 200));
        primaryStage.show();

    }


}
