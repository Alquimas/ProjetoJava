package entrada;
import java.util.*;
public abstract class entraNome extends scan
{

    public static String entraNome()
    {
        String retorna;
        do
        {
            retorna = sc.nextLine();
            if (verificaNome(retorna)) return retorna;
            //chamada da função tipo boolean que verifica se o numero inserido eh valido
        } while (true);
    }
    private static boolean verificaNome(String s)
    {
        int j = 0;

        if (s.length() > 10)
        {
            System.out.print("Insira menos que 10 caracteres!"); 
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
        for (int i = 0; i < s.length(); i++)
        {
            int verifica = s.charAt(i);

            if (verifica > 122 || (verifica < 65 && verifica != 32) || (verifica > 90 && verifica < 97))
            {
                //verificação de todos os caracteres especiais da tabela ASCCI
                System.out.print("Nome inválido!");
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

            if (verifica != 32) //verificação para que o nome do usuário não seja apenas espaços
            {
                j++;
            }
        }
        if (j > 0)
            return true;
        else {
            System.out.print("Nome inválido!");
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
