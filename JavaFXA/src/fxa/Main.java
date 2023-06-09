
package fxa;

import javafx.application.Application;
import javafx.event.ActionEvent;  
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application  {

    public static void main(String[] args){ 
        launch(args);
       
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
       
        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.setTitle("HOMEPAGE");
        primaryStage.show(); 
        
    }
    
}

