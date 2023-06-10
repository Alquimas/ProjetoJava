package backbone;

//import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;

//import javax.print.attribute.standard.PrinterMakeAndModel;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;

public class Main extends Application
{
    Jogador p[] = new Jogador[2];
    public static void main(String[] args) throws Exception 
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        try
        {
        //Jogador p[] = new Jogador[2];
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Tela_inicial.fxml"));
        Parent root = fxmlLoader.load();
        Scene tela = new Scene(root);
        
        String css = this.getClass().getResource("Style.css").toExternalForm();
        tela.getStylesheets().add(css);    

        primaryStage.setTitle("Jogo dos Milhões");
        primaryStage.setScene(tela);
        primaryStage.show();
        }
        catch(Exception e)
        {
            e.printStackTrace();   
        }    
    }
}


