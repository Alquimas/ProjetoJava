package backbone;

public class ModeloQuestao {
    private String quest;
    private String[] respostas; 
    public ModeloQuestao(String nome, String[] respostas)
    {
        this.quest = nome;
        this.respostas = respostas;
    }

    public String getAlternativas (int indice)
    {
        return respostas[indice];
    }

    public String getPergunta()
    {
        return quest;
    }
}
