import java.util.HashMap;
import java.util.Map;

public class Power {
    public static int pow(int base, int exp) {
        if (exp == 0) return 1;
        return base * pow(base, exp - 1);
    }

    public static int pow1(int base, int exp) {
        if (exp == 0) return 1;
        if (exp % 2 == 0) {
            return pow1(base, exp / 2) * pow1(base, exp / 2);
        } else return base * pow1(base, exp / 2) * pow1(base, exp / 2);
    }

    public static int pow2(int base, int exp, Map<Integer, Integer> map) {
        if (exp == 0) return 1;
        if (map.containsKey(exp)) {
            return map.get(exp);
        } else {
            int temp = base * pow2(base, exp - 1, map);
            map.put(exp, temp);
        }
        return map.get(exp);
    }

    public static void main(String[] args) {
        System.out.println(pow(5, 3));
        System.out.println(pow1(5, 3));
        System.out.println(pow2(5, 4, new HashMap<>()));
    }
}
