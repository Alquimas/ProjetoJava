package backbone;
public class Questao
{
    String quest; // = "Pergunta";
    String[] respostas; // = {"Resposta correta", "Resposta incorreta", "Resposta incorreta", "Resposta incorreta",
            //"Resposta incorreta", "Resposta incorreta"};

    public Questao(String nome, String[] respostas)
    {
        this.quest = nome;
        this.respostas = respostas;
    }
    public Questao(String string, String string2, String string3) {
    }
    public Questao getQuestao()
    {
        return (new Questao(this.quest, respostas));
        //sim, eu passo um objeto questão onde a resposta tá sempre na primeira posição
        //porquê? isso simplifica a verificação se a resposta escolhida foi a certa ou a errada
        //acho que fica melhor de embaralhar quando for mostrar, usando um array auxiliar
    }
}
