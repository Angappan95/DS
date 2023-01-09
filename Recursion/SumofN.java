//public class SumofN {
//
//}
import java.util.*;
import java.lang.*;

class Main_29batch
{

    public static int recurSum(int n)
    {
        if (n <= 1)
            return n;
        return n + recurSum(n - 1);
    }

    // Driver code
    public static void main(String args[])
    {
        int n = 5;
        System.out.println(recurSum(n));
    }
}