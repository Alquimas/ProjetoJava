package bancoDeDados;
import java.util.*;

public class questoesMedias
{
	ArrayList<ModeloQuestao> medias = new ArrayList<>();

	questoesMedias()
	{
        medias.add(new ModeloQuestao("Média: Se uma variável de uma classe é 'static', então:",
                        new String[] {
                                        "Ela pertence a classe, isto é, todas as instâncias de objeto dessa classe tem esse \n"
                                                        +
                                                        "mesmo valor de variável",
                                        "Ela não pode ser alterada depois de instanciada",
                                        "Toda instância de objeto criada a partir do '=' terá o valor dessa variável compartilhado, \nporém "
                                                        +
                                                        "instâncias criada a partir do 'new' são independentes",
                                        "Ela é inacessível a metódos não estáticos",
                                        "Ela é global e sempre terá escopo public, além de ter seu valor compartilhado entre todas as \n"
                                                        +
                                                        "instâncias dessa classe" }));

        medias.add(new ModeloQuestao("Média: A respeito da cláusura 'Throws exception':",
                        new String[] {
                                        "Permite que um método 'pule' o tratamento da 'exception', deixando este para outro método \n"
                                                        +
                                                        "que o chame",
                                        "Descarta a exceção completamente caso ela ocorra, permitindo que o código continue executando \n"
                                                        +
                                                        "mesmo sob o risco de erros",
                                        "Faz o método jogar essa exceção toda vez que sua execução falhar",
                                        "Faz o método ser executado sempre que a sua classe jogar a exceção especificada",
                                        "Faz o método lidar com a exceção em tempo de compilação, impedindo que o código seja compilado \n"
                                                        +
                                                        "caso haja iminência de tal exceção ocorrer" }));

        medias.add(new ModeloQuestao("Média: Qual a forma certa de se declarar um construtor?",
                        new String[] {
                                        "Modificador de acesso, nome da classe, argumentos",
                                        "Modificador de acesso, retorno, nome da classe, argumentos",
                                        "Modificador de acesso, nome do método, argumentos",
                                        "Nome do método, argumentos",
                                        "Nome da classe, argumentos" }));

        medias.add(new ModeloQuestao("Média: Assinale a alternativa correta sobre os construtores:",
                        new String[] {
                                        "O construtor irá passar, por padrão, o valor 'false' para variáveis do tipo 'boolean'",
                                        "É obrigatório ter um construtor declarado na classe",
                                        "O construtor sempre precisa receber algum valor quando chamado",
                                        "É possível ter vários construtores em uma mesma classe desde que eles possuam a mesma "
                                                        +
                                                        "assinatura",
                                        "Toda classe possui um construtor defaut que nunca precisa ser declarado" }));

        medias.add(new ModeloQuestao("Média: O seguinte código não será compilado. Por que? \n\n" +
                        "public class main \n" +
                        "{\n" +
                        "\tpublic static void main(String[] args) " +
                        "\t{\n  " +
                        "\t\tScanner tc = new Scanner(System.in);\n" +
                        "\n\t\tint b;" +
                        "\n\t\tint a = Byte.parseByte(tc.nextLine());\n" +
                        "\t\tif (a == 'c')\n" +
                        "\t\t\tb=10;\n" +
                        "\t\tif (a == 'c'+10)\n" +
                        "\t\t\tSystem.exit(0);\n" +
                        "\t\telse\n" +
                        "\t\t\tSystem.out.Println (b);" +
                        "\n}",
                        new String[] {
                                        "Porque a variável b pode não ter sido inicializada",
                                        "Porque não é possível comparar int e char ou somar eles",
                                        "Porque não é possível passar uma String para um int",
                                        "Porque a variável b pode não ter sido inicializada e não é possível passar um byte para um int",
                                        "Porque a variável b pode não ter sido inicializada e não é possível comparar int e char ou "
                                                        +
                                                        "somar eles" }));

        medias.add(new ModeloQuestao("Media: Considere o seguinte código \n\n" +
                        "\tint a = 0;\n" +
                        "\tint b = a++;\n" +
                        "\tint c = a + ++b;\n" +
                        "\nQual o valor de 'a', 'b' e 'c' respectivamente?",
                        new String[] {
                                        "'1, 1, 2'",
                                        "'0, 0, 0'",
                                        "'1, 2, 3'",
                                        "'1, 2, 2'",
                                        "'0, 1, 2'"
                        }));

        medias.add(new ModeloQuestao("Média: Considere o código a seguir \n\n" +
                        "public class Exemplo {\n" +
                        "\tpublic static void main(String[] args) {\n" +
                        "\t\tint a = 10;\n" +
                        "\t\tint b = 5;\n" +
                        "\t\tint c = 3;\n" +
                        "\n" +
                        "\t\tboolean resultado = a < b ||  a + b > c && b < c;\n" +
                        "\n" +
                        "\t\tSystem.out.println(resultado);\n" +
                        "\t}\n" +
                        "}\n\nO que será exibido no console?",
                        new String[] {
                                        "false",
                                        "true",
                                        "null",
                                        "'15'",
                                        "Nenhuma das outras alternativas"
                        }));

        medias.add(new ModeloQuestao("Média: Considere o seguinte código:\n\n" +
                        "public class Exemplo {\n" +
                        "\tpublic static void main(String[] args) {\n" +
                        "\t\tString palavra = \"abcdef\";\n" +
                        "\t\tint comprimento = palavra.length();\n" +
                        "\t\tint metade = comprimento / 2;\n" +
                        "\t\tString resultado = palavra.substring(metade) + palavra.substring(0, metade);\n"
                        +
                        "\t\tSystem.out.println(resultado);\n" +
                        "\t}\n" +
                        "}\n\nO que será exibido no console?",
                        new String[] {
                                        "defabc",
                                        "abcdef",
                                        "fedbca",
                                        "fedabc",
                                        "defcba"
                        }));
	}

	ArrayList<ModeloQuestao> getMedias()
	{
		return this.medias;
	}
}

