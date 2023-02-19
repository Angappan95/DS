public class FibonacciRecursion {
    static int fib(int num){
        if (num < 2) return num;
        return fib(num-2) + fib(num-1);
    }

    public static void main(String[] args) {
        System.out.println(fib(20));
    }
}
