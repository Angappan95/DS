public class CheckPowerOf2Recursion {
    public static boolean isPowerOf2(int n){
        int counter = 0;
        while(counter <= 32){
            int temp = (int)Math.pow(2, counter);
            if(temp > n) return false;
            else if(temp == n) return true;
            counter++;
        }
        return false;
    }

    public static boolean isPowerOf2Division(int n){
        if (n == 0) return false;
        // idea -> any number if it is able to divide by two until we get 1 then it is a power of two
        // Iterate till n is not equal to 1
        //      if the number is not even number return false
        //      divide the number by 2 again and continue the validation
        while(n != 1){
            if(n%2 != 0) return false;
            n = n/2;
        }
        return true;
    }

    public static boolean isPowerOf2Recursion(int n){
        if (n == 0)return false;
        if (n == 1) return true;
        else if( n%2 != 0) return false;
        return isPowerOf2Recursion(n/2);
    }

    public static void main(String[] args) {
//        System.out.println(isPowerOf2Division(8));
//        System.out.println(isPowerOf2Division(12));
//        System.out.println(isPowerOf2Division(1024));
//        System.out.println(isPowerOf2Division(2));
//        System.out.println(isPowerOf2Division(1));

        System.out.println(isPowerOf2Recursion(8));
        System.out.println(isPowerOf2Recursion(12));
        System.out.println(isPowerOf2Recursion(1024));
        System.out.println(isPowerOf2Recursion(2));
        System.out.println(isPowerOf2Recursion(1));
    }
}
