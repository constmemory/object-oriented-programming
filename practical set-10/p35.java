/*
Write a JavaFX program that displays a bar chart to represent the percentage distribution of overall grades using Rectangle shapes.  
● Projects : 20%, displayed in Red  
● Quizzes : 10%, displayed in Blue  
● Midterm Exams : 30%, displayed in Green  
● Final Exam : 40%, displayed in Orange  
Requirements :  
1. Each category should be displayed with a labeled bar.  
2. Bars should be proportional in height to the percentage.  
3. Use the Rectangle class to create the bars.  
4. Display the labels (e.g., "Projects — 20%") under each bar.  
5. Arrange the bars horizontally in the scene using an HBox or Pane. 
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.Label;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class p35 extends Application {
    public void start(Stage stage) {
        HBox root = new HBox(20);
        root.setAlignment(Pos.CENTER);

        root.getChildren().add(createBar("Projects — 20%", 20, Color.RED));
        root.getChildren().add(createBar("Quizzes — 10%", 10, Color.BLUE));
        root.getChildren().add(createBar("Midterm — 30%", 30, Color.GREEN));
        root.getChildren().add(createBar("Final — 40%", 40, Color.ORANGE));

        Scene scene = new Scene(root, 500, 400);

        stage.setTitle("Grade Distribution Chart");
        stage.setScene(scene);
        stage.show();
    }

    private VBox createBar(String text, int percentage, Color color) {
        double height = percentage * 5;

        Rectangle rect = new Rectangle(50, height);
        rect.setFill(color);

        Label label = new Label(text);

        VBox box = new VBox(10);
        box.setAlignment(Pos.BOTTOM_CENTER);

        box.getChildren().addAll(rect, label);

        return box;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
