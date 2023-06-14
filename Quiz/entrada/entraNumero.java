package entrada;
import java.util.*;
public abstract class entraNumero extends scan
{ 

    public static int entraNumero()
    {
        String retorna;
        do 
        {
            retorna = sc.nextLine();
            if(verificaInt(retorna)) return Integer.valueOf(retorna);
        } while (true);
    }
    
    private static boolean verificaInt(String s)
    {
        try {
            int k = Integer.valueOf(s);
            if(k > 0 && k < 6)
            {
                return true;
    }
            else
            {
                System.out.print("Opção inválida!");
                try
                {
                    Thread.sleep(1000);
                } catch (InterruptedException error)
                {
                    ;
                }
                System.out.print("\033[2K\033[F\033[2K");
                return false;
            }
        } catch (NumberFormatException e) {
            System.out.print("Opção inválida!");
            try
            {
                Thread.sleep(1000);
            } catch (InterruptedException error)
            {
                ;
            }
            System.out.print("\033[2K\033[F\033[2K");
            return false;
        }
    }
}
