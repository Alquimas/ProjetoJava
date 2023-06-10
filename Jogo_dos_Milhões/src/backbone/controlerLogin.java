package backbone;



import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class controlerLogin {
    
    @FXML 
    Label pergunta;

    
    public void display(String user){

        pergunta.setText("Jogador 1: " + user);
    }

}
