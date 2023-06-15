package entrada;
import java.util.*;

public abstract class entraOpcao extends scan
{
    
    public static int entraOpcao()
    {
        String retorna;
        do 
        {
            retorna = sc.nextLine();
            int teste = verificaOpcao(retorna);
            if(teste == 0 || teste == 1) 
                return teste;
        } while (true);
    }

    private static int verificaOpcao(String s)
    {
        opcoes op = new opcoes();
        HashMap<String, Integer> opcoes = op.getMap();
        if(opcoes.containsKey(s))
        {
            return opcoes.get(s);
        }
        else
        {
            System.out.println("Opção inválida!");
            try
            {
                Thread.sleep(1000);
            } catch (InterruptedException error)
            {
                ;
            }
            System.out.print("\033[2K\033[F\033[2K");
            return 2;
        }
    }
}
