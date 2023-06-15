package funcoes;

import aux_class.*;
import java.util.*;

public abstract class geraStack {
    final static int[] ordem = { 2, 2, 1, 1, 1, 1, 0, 0, 0, 0 };

    public static Stack<Pair> geraRand() {
        Set<Pair> jaFoi = new HashSet<>();

        Stack<Pair> questoes = new Stack<>();

        int k = 0;

        while (questoes.size() < 10) {
            int m = 0;
            if (ordem[k] == 0 || ordem[k] == 1) {
                m = 8;
            } else {
                m = 5;
            }
            int numeroAleatorio = (int) (Math.random() * m);
            Pair par = new Pair(ordem[k], numeroAleatorio);
            if (!jaFoi.contains(par)) {
                questoes.push(par);
                jaFoi.add(par);
                k++;
            }
        } // saimos daqui com um stack com 10 questoes

        return questoes;
    }
}
