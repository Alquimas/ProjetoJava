package backbone;

public class BancoDados
{
    private static final ModeloQuestao[][] questoes = new ModeloQuestao[3][5];

    public BancoDados()
    {
        //faceis
        this.questoes[0][0] = new ModeloQuestao("Fácil: Qual dos seguintes tipos NÃO é primitivo?",             new String[] {"String",
            "int", 
            "double", 
            "char", 
            "boolean"});

        this.questoes[0][1] = new ModeloQuestao("Fácil: Qual dos castings abaixo NÃO é possível?", 
            new String[] {"(boolean) 0", 
                "(int) 2.2", 
                "(float) 2", 
                "(char) 2", 
                "(long) 2.2"});

        this.questoes[0][2] = new ModeloQuestao("Fácil: O método: \n public static void func(){\n\treturn;\n}", 
            new String[] {"Funcionará normalmente caso chamado, mas não retorna nenhum valor", 
                "Vai jogar a exceção 'incompatibletypes' ao ser chamado", 
                "Funcionará normalmente caso chamado, retornando NULL",
                "Gerará um erro, pois necessita de 'return void;' para funcionar corretamente",
                "O código não será compilado"});

        this.questoes[0][3] = new ModeloQuestao("Fácil: Pergunta4", new String[] {"Resposta 0", "Resposta 1", "Resposta 2",
            "Resposta 3", "Resposta 4"});

        this.questoes[0][4] = new ModeloQuestao("Fácil: Pergunta5", new String[] {"Resposta 0", "Resposta 1", "Resposta 2",
            "Resposta 3", "Resposta 4"});

        //medias
        this.questoes[1][0] = new ModeloQuestao("Média: Se uma variável de uma classe é 'static', então:", new String[] {"Ela pertence a classe, isto é, todas as instâncias de objeto dessa classe tem esse mesmo valor de variável", 
            "Ela não pode ser alterada depois de instanciada", 
            "Toda instância de objeto criada a partir do '=' terá o valor dessa variável compartilhado, porém instâncias criada a partir do 'new' são independentes",
            "Ela é inacessível a metódos não estáticos", 
            "Ela é global e sempre terá escopo public, além de ter seu valor compartilhado entre todas as instâncias dessa classe"});

        this.questoes[1][1] = new ModeloQuestao("Média: A respeito da cláusura 'Throws exception':", 
            new String[] {"Permite que um método 'pule' o tratamento da 'exception', deixando este para outro método que o chame", 
                "Descarta a exceção completamente caso ela ocorra, permitindo que o código continue executando mesmo sob o risco de erros", 
                "Faz o método jogar essa exceção toda vez que sua execução falhar",
                "Faz o método ser executado sempre que a sua classe jogar a exceção especificada",
                "Faz o método lidar com a exceção em tempo de compilação, impedindo que o código seja compilado caso haja iminência de tal exceção ocorrer"});

        this.questoes[1][2] = new ModeloQuestao("Média: Pergunta3", new String[] {"Resposta 0", "Resposta 1", "Resposta 2",
            "Resposta 3", "Resposta 4"});

        this.questoes[1][3] = new ModeloQuestao("Média: Pergunta4", new String[] {"Resposta 0", "Resposta 1", "Resposta 2",
            "Resposta 3", "Resposta 4"});

        this.questoes[1][4] = new ModeloQuestao("Média: Pergunta5", new String[] {"Resposta 0", "Resposta 1", "Resposta 2",
            "Resposta 3", "Resposta 4"});

        //dificeis
        this.questoes[2][0] = new ModeloQuestao("Difícil: O que a palavra chave 'final' faz com um método?", 
            new String[] {"Impede que ele seja sobrescrito por classes filhas, salvo o caso onde a assinatura é diferente.", 
                "Permite que ele seja chamado mesmo sem um objeto associado.", 
                "Impede que esse método seja sobrecarregado, mas ele ainda pode ser reescrito desde que se mantenha sua assinatura.",
                "Impede que esse método seja chamado fora da classe ou subclasses.", 
                "Impede que esse método seja herdado pelas subclasses, salvo o caso onde a assinatura é diferente."});

        this.questoes[2][1] = new ModeloQuestao("Difícil: Pergunta2", new String[] {"Resposta 0", "Resposta 1", "Resposta 2",
            "Resposta 3", "Resposta 4"});

        this.questoes[2][2] = new ModeloQuestao("Difícil: Pergunta3", new String[] {"Resposta 0", "Resposta 1", "Resposta 2",
            "Resposta 3", "Resposta 4"});

        this.questoes[2][3] = new ModeloQuestao("Difícil: Pergunta4", new String[] {"Resposta 0", "Resposta 1", "Resposta 2",
            "Resposta 3", "Resposta 4"});

        this.questoes[2][4] = new ModeloQuestao("Difícil: Pergunta5", new String[] {"Resposta 0", "Resposta 1", "Resposta 2",
            "Resposta 3", "Resposta 4"}); 
    }

    public ModeloQuestao getQuestao(int dificuldade, int indice)
    {
        return this.questoes[dificuldade][indice];
    }
}
