public class Fibonacci {
    public static int fib(int n){
        if(n < 2) return n;
        int num1=0, num2=1;
        int counter=0;
        while(counter < n-1){
            int num3 = num2+num1;
            num1 = num2;
            num2 = num3;
            counter++;
        }
        return num2;
    }
    public static void main(String[] args) {
        System.out.println(fib(0));
        System.out.println(fib(5));
        System.out.println(fib(10));
        System.out.println(fib(20));
    }
}


