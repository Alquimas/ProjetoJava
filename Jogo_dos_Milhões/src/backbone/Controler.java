package backbone;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;


public class Controler {

    SceneControler trocar = new SceneControler();

    @FXML
    
    public void botaoVerdade(ActionEvent t) throws IOException{
        System.out.println("Funciona e é verdade");
        trocar.switchToScene1(t);
    }

    public void botaoMentira(ActionEvent f){
        System.out.println("Funciona e é mentira");
    }
}
