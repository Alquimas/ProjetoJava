import java.util.*;
import pontuacao.*;
import funcoes.*;
import aux_class.*;
import entrada.*;
public class main
{
    final static int[] ordem = {2, 2, 1, 1, 1, 1, 0, 0, 0, 0};
    public static void main(String[] args) {
        System.out.println("Insira o nome do jogador 1");
        Jogador j1 = new Jogador(entraNome.entraNome().trim());
        System.out.println("Insira o nome do jogador 2");
        Jogador j2 = new Jogador(entraNome.entraNome().trim());

        System.out.print("\033[H\033[2J");
        while(true)
        {
            j1.setPontos(0);
            j2.setPontos(0);
            quiz.jogarQuiz(j1, j2);
            System.out.println("Deseja jogar novamente? \nInsira 's' para sim e 'n' para não.");
            int a = entraOpcao.entraOpcao();
            if(a == 0)
            {
                System.out.print("\033[H\033[2J");
                continue;
            }
            else
            {
                System.out.print("\033[H\033[2J");
                scan.closeScan();
                return;
            }
        }
    }
}
