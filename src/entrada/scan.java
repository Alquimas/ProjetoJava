package entrada;
import java.util.*;
public abstract class scan 
{
    protected static Scanner sc = new Scanner(System.in);

    public static void closeScan()
    {
        sc.close();
    }
}
