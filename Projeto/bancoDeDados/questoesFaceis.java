package bancoDeDados;
import java.util.*;

public class questoesFaceis
{
	ArrayList<ModeloQuestao> faceis = new ArrayList<>();

	questoesFaceis()
	{
        faceis.add(new ModeloQuestao("Fácil: Qual dos seguintes tipos NÃO é primitivo?",
                        new String[] {
                                        "String",
                                        "int",
                                        "double",
                                        "char",
                                        "boolean" }));

        faceis.add(new ModeloQuestao("Fácil: Qual dos castings abaixo NÃO é possível?",
                        new String[] { "(boolean) 0",
                                        "(int) 2.2",
                                        "(float) 2",
                                        "(char) 2",
                                        "(long) 2.2" }));

        faceis.add(new ModeloQuestao(
                        "Fácil: O método: \n\n public static void func(){\n\treturn;\n}",
                        new String[] { "Funcionará normalmente caso chamado, mas não retorna nenhum valor",
                                        "Vai jogar a exceção 'incompatibletypes' ao ser chamado",
                                        "Funcionará normalmente caso chamado, retornando NULL",
                                        "Gerará um erro, pois necessita de 'return void;' para funcionar corretamente",
                                        "O código não será compilado" }));

        faceis.add(new ModeloQuestao(
                        "Fácil: Os métodos de uma classe abstrata sempre precisam ter " +
                                        "qual(is) modificador(es)?",
                        new String[] {
                                        "Não é necessário ter nenhum modificador de acesso",
                                        "Abstract",
                                        "Public",
                                        "Public abstract",
                                        "Private abstract" }));

        faceis.add(new ModeloQuestao(
                        "Fácil: Qual dos seguintes valores entrariam no seguinte laço if?" +
                                        "\n\n if(valor > 122 || valor < 65 && valor != 32 || valor > 90 && valor < 97)\n",
                        new String[] {
                                        "91",
                                        "32",
                                        "123",
                                        "65",
                                        "97" }));

        faceis.add(new ModeloQuestao(
                        "Fácil: Qual das seguintes declarações de classe main está errada?",
                        new String[] {
                                        "Public class main",
                                        "public class main",
                                        "public class main extends Exemplo",
                                        "class main",
                                        "public class main implements Exemplo" }));

        faceis.add(new ModeloQuestao("Fácil: Sobre a palavra null, assinale a alternativa correta.",
                        new String[] {
                                        "A palavra null, quando atribuída a uma variável, dá um valor a essa variável",
                                        "Não podemos realizar a seguinte atribuição (considere que 'meuNascimento' é uma instância de\n"
                                                        +
                                                        "uma classe chamada 'Data'): \nData meuNascimento = null;",
                                        "A comparação 'null == null;' não pode ser compilada",
                                        "Quando mostrada na tela, uma variável que foi atribuída com a palavra null exibirá o \n"
                                                        +
                                                        "texto 'null'",
                                        "A palavra null é utilizada para atribuir valor default às variáveis" }));

        faceis.add(new ModeloQuestao(
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
                                        "Pode ser associado a uma classe, desde que essa classe esteja dentro de outra classe" }));
	}

	ArrayList<ModeloQuestao> getFaceis()
	{
		return this.faceis;
	}
}
