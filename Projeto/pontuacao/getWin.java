package pontuacao;
public class getWin implements Pontuacao 
{
    private static int[] pPontos = {40, 60, 100};
     
    public int getPoints(int pontos, int dificuldade)
    {
		if(dificuldade > 2 || dificuldade < 0) return pontos;

        return (pontos + pPontos[dificuldade]);
    }
    public int getSaldo(int dificuldade)
    {
        return pPontos[dificuldade];
    }
}
