/*
Design a registration form UI with fields : Roll_NO (numeric), Name, Age (numeric), Email and a Submit button. Requirements :  
● Validate inputs on submit :  
  o RollNo and Age must be integers.  
  o Email must contain @ and . (basic check).  
● On success show a confirmation Alert with entered data.  
● On validation failure show an error alert describing the issue.  
UI / Classes to use : GridPane, TextField, Button, Alert, FileChooser, FileWriter/BufferedWriter.
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.stage.FileChooser;

import java.io.*;

public class p34 extends Application {
    public void start(Stage stage) {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setVgap(10);
        grid.setHgap(10);

        TextField rollField = new TextField();
        TextField nameField = new TextField();
        TextField ageField = new TextField();
        TextField emailField = new TextField();

        Button submitBtn = new Button("Submit");

        grid.add(new Label("Roll No :"), 0, 0);
        grid.add(rollField, 1, 0);

        grid.add(new Label("Name :"), 0, 1);
        grid.add(nameField, 1, 1);

        grid.add(new Label("Age :"), 0, 2);
        grid.add(ageField, 1, 2);

        grid.add(new Label("Email :"), 0, 3);
        grid.add(emailField, 1, 3);

        grid.add(submitBtn, 1, 4);

        submitBtn.setOnAction(e -> {

            try {
                int roll = Integer.parseInt(rollField.getText());
                int age = Integer.parseInt(ageField.getText());
                String name = nameField.getText();
                String email = emailField.getText();

                if (!email.contains("@") || !email.contains(".")) {
                    throw new Exception("Invalid email format!");
                }

                FileChooser fileChooser = new FileChooser();
                fileChooser.setTitle("Save Registration");
                File file = fileChooser.showSaveDialog(stage);

                if (file != null) {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
                    bw.write(roll + ", " + name + ", " + age + ", " + email);
                    bw.newLine();
                    bw.close();
                }

                Alert success = new Alert(Alert.AlertType.INFORMATION);
                success.setTitle("Success");
                success.setHeaderText("Registration Successful");
                success.setContentText("Roll No: " + roll + "\nName : " + name +
                        "\nAge: " + age + "\nEmail : " + email);
                success.showAndWait();

            } 
            catch (NumberFormatException ex) {
                Alert error = new Alert(Alert.AlertType.ERROR);
                error.setTitle("Error");
                error.setHeaderText("Invalid Input");
                error.setContentText("Roll No and Age must be integers!");
                error.showAndWait();
            } 
            catch (Exception ex) {
                Alert error = new Alert(Alert.AlertType.ERROR);
                error.setTitle("Error");
                error.setHeaderText("Validation Error");
                error.setContentText(ex.getMessage());
                error.showAndWait();
            }
        });

        Scene scene = new Scene(grid, 400, 300);
        stage.setTitle("Registration Form");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
