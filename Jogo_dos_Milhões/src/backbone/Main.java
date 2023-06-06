package backbone;

//import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;

//import javax.print.attribute.standard.PrinterMakeAndModel;

import javafx.application.Application;
//import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application
{
    public static void main(String[] args) throws Exception 
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("layout.fxml"));
        Parent root = fxmlLoader.load();
        Scene tela = new Scene(root);

        primaryStage.setTitle("Funciona carai");
        primaryStage.setScene(tela);
        primaryStage.show();
    
    }
}


