package backbone;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controler {

    SceneControler trocar = new SceneControler();

    @FXML
    TextField nomeJogador;

    Jogador players = new Jogador();
    private Stage stage;
    private Scene scene;
    private Parent root;
    

    public void botaoLogin(ActionEvent event) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("Menu_nomes.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);

        String css = this.getClass().getResource("Style.css").toExternalForm();
        scene.getStylesheets().add(css);

        stage.setScene(scene);
        stage.show();

    }

    
    public void botaoComecar(ActionEvent event) throws IOException {
        
        String nomeP1 = nomeJogador.getText();
        players.setNomeJ(nomeP1);


        FXMLLoader loader = new FXMLLoader(getClass().getResource("Pergunta_1.fxml"));
        root = loader.load();

        controlerLogin c = loader.getController();
        c.display(players.getNomeJ());

        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);

        String css = getClass().getResource("Style.css").toExternalForm();
        scene.getStylesheets().add(css);

        stage.setScene(scene);
        stage.show();
    }
}