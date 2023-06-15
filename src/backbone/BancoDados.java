package backbone;

public class BancoDados {
        private static final ModeloQuestao[][] questoes = new ModeloQuestao[3][8];

        public BancoDados() {
                // faceis
                this.questoes[0][0] = new ModeloQuestao("Fácil: Qual dos seguintes tipos NÃO é primitivo?",
                                new String[] {
                                                "String",
                                                "int",
                                                "double",
                                                "char",
                                                "boolean" });

                this.questoes[0][1] = new ModeloQuestao("Fácil: Qual dos castings abaixo NÃO é possível?",
                                new String[] { "(boolean) 0",
                                                "(int) 2.2",
                                                "(float) 2",
                                                "(char) 2",
                                                "(long) 2.2" });

                this.questoes[0][2] = new ModeloQuestao(
                                "Fácil: O método: \n\n public static void func(){\n\treturn;\n}",
                                new String[] { "Funcionará normalmente caso chamado, mas não retorna nenhum valor",
                                                "Vai jogar a exceção 'incompatibletypes' ao ser chamado",
                                                "Funcionará normalmente caso chamado, retornando NULL",
                                                "Gerará um erro, pois necessita de 'return void;' para funcionar corretamente",
                                                "O código não será compilado" });

                this.questoes[0][3] = new ModeloQuestao(
                                "Fácil: Os métodos de uma classe abstrata sempre precisam ter " +
                                                "qual(is) modificador(es)?",
                                new String[] {
                                                "Não é necessário ter nenhum modificador de acesso",
                                                "Abstract",
                                                "Public",
                                                "Public abstract",
                                                "Private abstract" });

                this.questoes[0][4] = new ModeloQuestao(
                                "Fácil: Qual dos seguintes valores entrariam no seguinte laço if?" +
                                                "\n\n if(valor > 122 || valor < 65 && valor != 32 || valor > 90 && valor < 97)\n",
                                new String[] {
                                                "91",
                                                "32",
                                                "123",
                                                "65",
                                                "97" });

                this.questoes[0][5] = new ModeloQuestao(
                                "Fácil: Qual das seguintes declarações de classe main está errada?",
                                new String[] {
                                                "Public class main",
                                                "public class main",
                                                "public class main extends Exemplo",
                                                "class main",
                                                "public class main implements Exemplo" });

                this.questoes[0][6] = new ModeloQuestao("Fácil: Sobre a palavra null, assinale a alternativa correta.",
                                new String[] {
                                                "A palavra null, quando atribuída a uma variável, dá um valor a essa variável",
                                                "Não podemos realizar a seguinte atribuição (considere que 'meuNascimento' é uma instância de\n"
                                                                +
                                                                "uma classe chamada 'Data'): \nData meuNascimento = null;",
                                                "A comparação 'null == null;' não pode ser compilada",
                                                "Quando mostrada na tela, uma variável que foi atribuída com a palavra null exibirá o \n"
                                                                +
                                                                "texto 'null'",
                                                "A palavra null é utilizada para atribuir valor default às variáveis" });

                this.questoes[0][7] = new ModeloQuestao(
                                "Fácil: Sobre a palavra static, assinale a alternativa incorreta.",
                                new String[] {
                                                "Não pode ser associado a uma classe",
                                                "Quando usado em um método torna esse método estático, permitindo que ele seja chamado \n"
                                                                +
                                                                "diretamente por outras classes",
                                                "Quando associado a uma variável, faz com que ela possua mesmo valor em todas as suas instâncias",
                                                "Quando utilizada em um método, deve ser adicionada após o modificador de acesso e antes do \n"
                                                                +
                                                                "tipo de retorno do método",
                                                "Pode ser associado a uma classe, desde que essa classe esteja dentro de outra classe" });

                // medias
                this.questoes[1][0] = new ModeloQuestao("Média: Se uma variável de uma classe é 'static', então:",
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
                                                                "instâncias dessa classe" });

                this.questoes[1][1] = new ModeloQuestao("Média: A respeito da cláusura 'Throws exception':",
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
                                                                "caso haja iminência de tal exceção ocorrer" });

                this.questoes[1][2] = new ModeloQuestao("Média: Qual a forma certa de se declarar um construtor?",
                                new String[] {
                                                "Modificador de acesso, nome da classe, argumentos",
                                                "Modificador de acesso, retorno, nome da classe, argumentos",
                                                "Modificador de acesso, nome do método, argumentos",
                                                "Nome do método, argumentos",
                                                "Nome da classe, argumentos" });

                this.questoes[1][3] = new ModeloQuestao("Média: Assinale a alternativa correta sobre os construtores:",
                                new String[] {
                                                "O construtor irá passar, por padrão, o valor 'false' para variáveis do tipo 'boolean'",
                                                "É obrigatório ter um construtor declarado na classe",
                                                "O construtor sempre precisa receber algum valor quando chamado",
                                                "É possível ter vários construtores em uma mesma classe desde que eles possuam a mesma "
                                                                +
                                                                "assinatura",
                                                "Toda classe possui um construtor defaut que nunca precisa ser declarado" });

                this.questoes[1][4] = new ModeloQuestao("Média: O seguinte código não será compilado. Por que? \n\n" +

                                " public class main \n" +
                                " {\n" +
                                "    public static void main(String[] args) " +
                                "    {\n  " +
                                "        \nScanner tc = new Scanner(System.in);\n" +
                                "        \nint b;" +
                                "        \nint a = Byte.parseByte(tc.nextLine());\n" +
                                "        if (a == 'c')\n" +
                                "            b=10;\n" +
                                "        if (a == 'c'+10)\n" +
                                "            System.exit(0);\n" +
                                "        else\n" +
                                "            System.out.Println (b);" +
                                " }",
                                new String[] {
                                                "Porque a variável b pode não ter sido inicializada",
                                                "Porque não é possível comparar int e char ou somar eles",
                                                "Porque não é possível passar uma String para um int",
                                                "Porque a variável b pode não ter sido inicializada e não é possível passar um byte para um int",
                                                "Porque a variável b pode não ter sido inicializada e não é possível comparar int e char ou "
                                                                +
                                                                "somar eles" });

                this.questoes[1][5] = new ModeloQuestao("Media: Considere o seguinte código \n\n" +
                                "        int a = 0;\n" +
                                "        int b = a++;\n" +
                                "        int c = a + ++b;\n" +
                                "\nQual o valor de 'a', 'b' e 'c' respectivamente?",
                                new String[] {
                                                "'1, 1, 2'",
                                                "'0, 0, 0'",
                                                "'1, 2, 3'",
                                                "'1, 2, 2'",
                                                "'0, 1, 2'"
                                });

                this.questoes[1][6] = new ModeloQuestao("Média: Considere o código a seguir \n\n" +
                                "public class Exemplo {\n" +
                                "    public static void main(String[] args) {\n" +
                                "        int a = 10;\n" +
                                "        int b = 5;\n" +
                                "        int c = 3;\n" +
                                "\n" +
                                "        boolean resultado = a < b ||  a + b > c && b < c;\n" +
                                "\n" +
                                "        System.out.println(resultado);\n" +
                                "    }\n" +
                                "}\n\nO que será exibido no console?",
                                new String[] {
                                                "false",
                                                "true",
                                                "null",
                                                "'15'",
                                                "Nenhuma das outras alternativas"
                                });

                this.questoes[1][7] = new ModeloQuestao("Média: Considere o seguinte código:\n\n" +
                                "public class Exemplo {\n" +
                                "    public static void main(String[] args) {\n" +
                                "        String palavra = \"abcdef\";\n" +
                                "        int comprimento = palavra.length();\n" +
                                "        int metade = comprimento / 2;\n" +
                                "        String resultado = palavra.substring(metade) + palavra.substring(0, metade);\n"
                                +
                                "        System.out.println(resultado);\n" +
                                "    }\n" +
                                "}\n\nO que será exibido no console?",
                                new String[] {
                                                "defabc",
                                                "abcdef",
                                                "fedbca",
                                                "fedabc",
                                                "defcba"
                                });

                // dificeis
                this.questoes[2][0] = new ModeloQuestao("Difícil: O que a palavra chave 'final' faz com um método?",
                                new String[] {
                                                "Impede que ele seja sobrescrito por classes filhas, salvo o caso onde a assinatura é "
                                                                +
                                                                "diferente.",
                                                "Permite que ele seja chamado mesmo sem um objeto associado.",
                                                "Impede que esse método seja sobrecarregado, mas ele ainda pode ser reescrito desde que se \n"
                                                                +
                                                                "mantenha sua assinatura.",
                                                "Impede que esse método seja chamado fora da classe ou subclasses.",
                                                "Impede que esse método seja herdado pelas subclasses, salvo o caso onde a assinatura é diferente." });

                this.questoes[2][1] = new ModeloQuestao("Difícil: Sobre a reutilização de classes por delegação (ou " +
                                "composição) assinale a alternativa correta:",
                                new String[] {
                                                "Se na nova classe a classe antiga for instanciada com o modificador 'private', os campos e \n"
                                                                +
                                                                "métodos da classe antiga poderão ser acessados apenas pela nova classe através dessa "
                                                                +
                                                                "instância, \ndesde que esses campos e métodos não sejam declarados como private na "
                                                                +
                                                                "classe antiga",
                                                "Na nova classe será instanciado um objeto da classe antiga, e através dele será possível \n"
                                                                +
                                                                "acessar todos os campos e métodos da classe antiga",
                                                "A nova classe herdará todas as classes da classe antiga, menos aquelas que possuem o \n"
                                                                +
                                                                "modificador 'private'",
                                                "A nova classe terá acesso a todos os métodos e campos da classe antiga através de um objeto \n"
                                                                +
                                                                "instanciado na classe, com exceção dos campos e métodos com modificador protected",
                                                "Se na nova classe a classe antiga for instanciada com o modificador public, os campos e \n"
                                                                +
                                                                "metodos dessa classe poderão acessados pela nova classe e por qualquer outra classe "
                                                                +
                                                                "que futuramente \ninstancie a nova classe" });

                this.questoes[2][2] = new ModeloQuestao("Difícil: Assinale a alternativa que apresenta uma diferença " +
                                "entre a interface e a classe abstrata",
                                new String[] {
                                                "Enquanto os campos de uma interface são sempre static e final, os campos de uma classe \n"
                                                                +
                                                                "abstrata podem ter qualquer modificador de acesso",
                                                "Enquanto na interface nem todos os métodos precisam ser abstratos, na classe abstrata todos \n"
                                                                +
                                                                "os métodos precisam ser abstratos",
                                                "Na classe abstrata os campos precisam ser declarados com o modificador 'abstract', enquando \n"
                                                                +
                                                                "na interface isso não é necessário",
                                                "Os campos de uma classe abstrata são sempre static e final, enquanto na interface os campos \n"
                                                                +
                                                                "podem ter qualquer modificador de acesso",
                                                "Enquanto só é possível herdar de uma interface, é possível herdar de múltiplas classes "
                                                                +
                                                                "abstratas" });

                this.questoes[2][3] = new ModeloQuestao("Difícil: Considere um sistema de vendas online que possui as "
                                +
                                "classes 'Produto',\n 'Cliente' e 'Pedido'. A classe 'Produto' possui os atributos 'nome', 'preco' "
                                +
                                "e 'quantidade'. \nA classe 'Cliente' possui os atributos 'nome', 'endereco' e 'email'. A classe "
                                +
                                "'Pedido' possui os \natributos 'cliente' (um objeto da classe 'Cliente'), 'produtos' (uma lista de "
                                +
                                "objetos da classe 'Produto') e 'data'.\n" +
                                "\n" +
                                "Agora, suponha que você precise implementar um método na classe 'Pedido' chamado 'calcularValorTotal', \n"
                                +
                                "que retorna o valor total do pedido considerando o preço dos produtos e a quantidade de cada um. Qual\n"
                                +
                                " a forma correta de implementar esse método, levando em consideração a estrutura do sistema?",
                                new String[] {
                                                "O método 'calcularValorTotal' deve percorrer a lista de produtos do pedido, somando o resultado"
                                                                +
                                                                " \nda multiplicação do preço pela quantidade de cada produto, e retornar o valor total",
                                                "O método 'calcularValorTotal' deve solicitar ao objeto 'Cliente' que forneça o preço total do \n"
                                                                +
                                                                "pedido, levando em consideração os produtos e suas quantidades",
                                                "O método 'calcularValorTotal' deve receber como parâmetro o valor total do pedido e \n"
                                                                +
                                                                "atualizar o atributo 'data' com essa informação",
                                                "O método calcularValorTotal deve solicitar ao objeto 'Produto' que calcule o valor total do \n"
                                                                +
                                                                "pedido, levando em consideração o preço e a quantidade de cada produto",
                                                "O método 'calcularValorTotal' não deve ser implementado na classe 'Pedido', pois as informações \n"
                                                                +
                                                                "necessárias para realizar esse cálculo estão espalhadas em outras classes" });

                this.questoes[2][4] = new ModeloQuestao("Difícil: Considere um sistema de gerenciamento de uma livraria"
                                +
                                " que possui as classes 'Livro' \ne 'CarrinhoDeCompras'. A classe 'Livro' possui os atributos 'titulo',"
                                +
                                " 'preco' 'quantidade'. A classe \n'CarrinhoDeCompras' possui um atributo 'livros' (uma lista de "
                                +
                                "objetos da classe 'Livro').\n\nAgora, suponha que você precise implementar um método na classe "
                                +
                                "'CarrinhoDeCompras' chamado \n'calcularValorTotal', que retorna o valor total dos livros no carrinho. "
                                +
                                "Qual a forma correta de \nimplementar esse método, levando em consideração a estrutura do sistema?",
                                new String[] {
                                                " O método 'calcularValorTotal' deve percorrer a lista de livros do carrinho, somando o \n"
                                                                +
                                                                "resultado da multiplicação do preço pela quantidade de cada livro, e retornar o valor total",
                                                "O método 'calcularValorTotal' deve solicitar ao objeto 'Livro' que forneça o preço total do \n"
                                                                +
                                                                "carrinho, levando em consideração os livros e suas quantidades",
                                                " O método 'calcularValorTotal' deve receber como parâmetro o valor total do carrinho e \n"
                                                                +
                                                                "atualizar o atributo 'livros' com essa informação",
                                                "O método 'calcularValorTotal' deve solicitar ao objeto 'CarrinhoDeCompras' que calcule o valor"
                                                                +
                                                                " \ntotal do carrinho, levando em consideração o preço e a quantidade de cada livro",
                                                "O método 'calcularValorTotal' não deve ser implementado na classe 'CarrinhoDeCompras', pois as \n"
                                                                +
                                                                "informações necessárias para realizar esse cálculo estão espalhadas em outras classes" });
        }

        public ModeloQuestao getQuestao(int dificuldade, int indice) {
                return this.questoes[dificuldade][indice];
        }
}
