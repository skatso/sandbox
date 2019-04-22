import java.util.HashMap;
import java.util.Map;

class Fibonacci {
    static Map<Integer, Integer> map;

    static void init() {
        map = new HashMap<>();
        map.put(0, 0);
        map.put(1, 1);
    }

    static int fibonacci(int n) {
        // Complete the function.
        if(map.containsKey(n))
            return map.get(n);
        int val = fibonacci(n-1) + fibonacci(n-2);
        map.put(n, val);
        return val;
    }
}
