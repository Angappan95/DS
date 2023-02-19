import java.util.HashMap;

public class FibonacciMemoization {
    static int fib(int num, HashMap<Integer, Integer> note) {
        if (num < 2) return num;
        if (note.containsKey(num)) return note.get(num);
        else {
            int temp = fib(num - 2, note) + fib(num - 1, note);
            note.put(num, temp);
            return temp;
        }
    }

    public static void main(String[] args) {
        HashMap<Integer, Integer> note = new HashMap<>();
        System.out.println(fib(20, note));
    }
}
