package backbone;


import java.io.IOException;
import javafx.scene.Node;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SceneControler {

    /*Jogador P = new Jogador();
    
    @FXML
    TextField nomeJogador;

    private Stage stage;
    private Scene scene;

    public void botaoPlayer1(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Menu_nomes.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);

        String css = this.getClass().getResource("Style.css").toExternalForm();
        scene.getStylesheets().add(css);

        stage.setScene(scene);
        stage.show();


    }

    public void login(ActionEvent event) throws IOException{


        Parent root = FXMLLoader.load(getClass().getResource("Menu_nomes.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);

        String css = this.getClass().getResource("Style.css").toExternalForm();
        scene.getStylesheets().add(css);

        stage.setScene(scene);
        stage.show();


    }
    
/*     public void comecarJogo(ActionEvent event) throws IOException{

        String nomeP1 = nomeJogador.getText();



        FXMLLoader loader = new FXMLLoader(getClass().getResource("Pergunta_1.fxml"));
        root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);

        controlerLogin controlerLogin = loader.getController();
        controlerLogin.display(nomeP1);



        String css = this.getClass().getResource("Style.css").toExternalForm();
        scene.getStylesheets().add(css);

        stage.setScene(scene);
        stage.show();


    }*/

}
