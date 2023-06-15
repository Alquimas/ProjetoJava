package entrada;
import java.util.*;

public class opcoes
{
    HashMap<String, Integer> opcoes = new HashMap<String, Integer>();
    public opcoes()
    {
        opcoes.put("s", 0);
        opcoes.put("sim", 0);
        opcoes.put("Sim", 0);          
        opcoes.put("SIM", 0);
        opcoes.put("S", 0);
        opcoes.put("n", 1);
        opcoes.put("não", 1);
        opcoes.put("nao", 1);
        opcoes.put("Nao", 1);
        opcoes.put("Não", 1);
        opcoes.put("NAO", 1);
        opcoes.put("NÃO", 1);
        opcoes.put("N", 1);
    }
    public HashMap<String, Integer> getMap()
    {
        return this.opcoes;
    }
}
