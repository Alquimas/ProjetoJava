package bancoDeDados;
import java.util.*;

public class questoesDificeis
{
    ArrayList<ModeloQuestao> dificeis = new ArrayList<>();

    questoesDificeis()
    {
        dificeis.add(new ModeloQuestao("Difícil: O que a palavra chave 'final' faz com um método?",
                        new String[] {
                                        "Impede que ele seja sobrescrito por classes filhas, salvo o caso onde a assinatura é "
                                                        +
                                                        "diferente.",
                                        "Permite que ele seja chamado mesmo sem um objeto associado.",
                                        "Impede que esse método seja sobrecarregado, mas ele ainda pode ser reescrito desde que se \n"
                                                        +
                                                        "mantenha sua assinatura.",
                                        "Impede que esse método seja chamado fora da classe ou subclasses.",
                                        "Impede que esse método seja herdado pelas subclasses, salvo o caso onde a assinatura é diferente." }));

        dificeis.add(new ModeloQuestao("Difícil: Sobre a reutilização de classes por delegação (ou " +
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
                                                        "que futuramente \ninstancie a nova classe" }));

        dificeis.add(new ModeloQuestao("Difícil: Assinale a alternativa que apresenta uma diferença " +
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
                                                        "abstratas" }));

        dificeis.add(new ModeloQuestao("Difícil: Considere um sistema de vendas online que possui as "
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
                                                        "necessárias para realizar esse cálculo estão espalhadas em outras classes" }));

        dificeis.add(new ModeloQuestao("Difícil: Considere um sistema de gerenciamento de uma livraria"
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
                                                        "informações necessárias para realizar esse cálculo estão espalhadas em outras classes" }));
    }
    ArrayList<ModeloQuestao> getDificeis()
    {
        return this.dificeis;
    }
}
