package funcoes;

import java.util.*;
import bancoDeDados.*;
import pontuacao.*;
import classesAuxiliares.*;
import entrada.*;

public abstract class quiz {
    public static void jogarQuiz(Jogador player1, Jogador player2) {
        BancoDados bancodados = new BancoDados();

        Stack<Pair> questoes = geraStack.geraRand();

        Jogador jogador = player1;

        for (int i = 0; i < 10; i++) {
            Pair atual = questoes.pop();

            ModeloQuestao q = bancodados.getQuestao(atual.getX(), atual.getY());

            System.out.println("Jogador da vez: " + jogador.getNomeJ() + " -- Pontos: " + jogador.getPontos() + " -- Vitórias: " + jogador.getWins());

            System.out.println("Pergunta: \n\n\t" + q.getPergunta() + "\n");

            int[] nums = geraArray.geraRand(5);

            for (int j = 0; j < 5; j++) {
                System.out.println((j + 1) + " " + q.getAlternativas(nums[j]));
            }

            System.out.println("\nQual sua resposta?");

            int resposta = entraNumero.entraNumero();
            if (nums[resposta - 1] == 0) {
                getWin vitoria = new getWin();

                System.out.print("\033[H\033[2J");

                jogador.setPontos(vitoria.getPoints(jogador.getPontos(), atual.getX()));

                System.out.println("Acertou!\n");

                System.out.println(jogador.getNomeJ() + " ganhou " + vitoria.getSaldo(atual.getX()) + " pontos e agora tem " + jogador.getPontos() + " pontos!");
            } else {
                getLoss derrota = new getLoss();

                System.out.print("\033[H\033[2J");

                jogador.setPontos(derrota.getPoints(jogador.getPontos(), atual.getX()));

                System.out.println("Errou :(\n");

                System.out.println(jogador.getNomeJ() + " perdeu " + derrota.getSaldo(atual.getX()) + " pontos e agora tem " + jogador.getPontos() + " pontos!");
            }

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                ;
            }

            if (jogador == player1) {
                jogador = player2;
            } else {
                jogador = player1;
            }

            System.out.print("\033[H\033[2J");
        }

        // jogo finalizado, hora de contar os pontos :)
        if (player1.getPontos() > player2.getPontos()) {
            player1.venceu();
            System.out.println(player1.getNomeJ() + ": " + player1.getPontos() + " pontos, " +
                    player1.getWins() + " vitórias!");
            System.out.println(player2.getNomeJ() + ": " + player2.getPontos() + " pontos, " +
                    player2.getWins() + " vitórias!");
            System.out.println("\n" + player1.getNomeJ() + " venceu a rodada!");
        } else if (player1.getPontos() < player2.getPontos()) {
            player2.venceu();
            System.out.println(player2.getNomeJ() + ": " + player2.getPontos() + " pontos, " +
                    player2.getWins() + " vitórias!");
            System.out.println(player1.getNomeJ() + ": " + player1.getPontos() + " pontos, " +
                    player1.getWins() + " vitórias!");
            System.out.println("\n" + player2.getNomeJ() + " venceu!");
        } else {
            System.out.println(player1.getNomeJ() + ": " + player1.getPontos() + " pontos, " +
                    player1.getWins() + " vitórias!");
            System.out.println(player2.getNomeJ() + ": " + player2.getPontos() + " pontos, " +
                    player2.getWins() + " vitórias!");
            System.out.println("\nPartida empatada!");
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            ;
        }
        System.out.print("\033[H\033[2J");
    }
}
