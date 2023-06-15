package pontuacao;
public class getLoss implements Pontuacao
{
    private static int[] pPontos = {-10, -20, -30}; 

    public int getPoints(int pontos, int dificuldade)
    {
		if(dificuldade > 2 || dificuldade < 0) return pontos;
		return Math.max(0, (pontos + pPontos[dificuldade]));
    }
    public int getSaldo(int dificuldade)
    {
        return -1*pPontos[dificuldade];
    }
}
