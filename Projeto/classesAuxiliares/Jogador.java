package classesAuxiliares;

public class Jogador 
{
    private String nomeJ;
    private int pontos;
    private int wins;

    public Jogador (String nome)
    { 
        this.nomeJ = nome; 
        this.pontos = 0; 
        this.wins = 0;
    }

    public void setNomeJ(String nomeJ) 
    { 
        this.nomeJ = nomeJ; 
    }

    public void setPontos(int pontos)
    {
        this.pontos = pontos; 
    } 

    public String getNomeJ()
    { 
        return this.nomeJ; 
    }

    public int getPontos() 
    { 
        return this.pontos; 
    }

    public int getWins() 
    {
        return this.wins; 
    }

    public void venceu()
    {
        this.wins++;
    }
}
