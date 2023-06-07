package backbone;

public class Jogador 
{
    private String nomeJ;
    private int pontos;


    public void setNomeJ(String nomeJ) { this.nomeJ = nomeJ; }

    public void atualizarPontos(int pontos) { this.pontos = pontos+1; }

    public String getNomeJ() { return nomeJ; }

    public int getPontos() { return pontos; }

    
}
