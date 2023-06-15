package funcoes;

import classesAuxiliares.*;
import bancoDeDados.*;
import java.util.*;

public abstract class geraStack {
    final static int[] ordem = { 2, 2, 1, 1, 1, 1, 0, 0, 0, 0 };
    static BancoDados questoes = new BancoDados();

    public static Stack<Pair> geraRand() {

        int[] quantidade = {questoes.getSize(0), questoes.getSize(1), questoes.getSize(2)};

        Set<Pair> jaFoi = new HashSet<>();

        Stack<Pair> urnaQuestoes = new Stack<>();

        int k = 0;

        while (urnaQuestoes.size() < 10) {
            int numeroAleatorio = (int) (Math.random() * quantidade[ordem[k]]);
            Pair par = new Pair(ordem[k], numeroAleatorio);
            if (!jaFoi.contains(par)) 
            {
                urnaQuestoes.push(par);
                jaFoi.add(par);
                k++;
            }
        } // saimos daqui com um stack com 10 questoes

        return urnaQuestoes;
    }
}
