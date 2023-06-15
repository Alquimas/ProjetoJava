package funcoes;
import java.util.*;
public abstract class geraArray
{
    public static int[] geraRand(int k) 
    {//gera um array de 5 entradas com valores aleatorios entre 0 e k
        if(k < 4) return (new int[] {0, 1, 2, 3, 4});
        //isso é necessario pra impedir que o codigo rode infinitamente

        int[] retorno = new int[5];

        Set<Integer> mySet = new HashSet<>();

        int j = 0;
		
		while(j < 5)
		{
		    int numeroAleatorio = (int)(Math.random() * k);
		    if(!mySet.contains(numeroAleatorio))
		    {
		        retorno[j] = numeroAleatorio;		            
                mySet.add(numeroAleatorio);
		        j++;
            }
		}
        return retorno;
    }
}
