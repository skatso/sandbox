import java.util.HashMap;

public class CoinCounter {
    private static HashMap<Integer, Integer> cache = new HashMap<>();

    static int money(int currentDollar, int[] coinTypes) {
        if(currentDollar == 0) return 1;
        if(currentDollar < 0) return 0;
        if(coinTypes.length == 0) return 0;
        int val = 0;
        int temp;
        for(int i: coinTypes) {
            temp = currentDollar - i;
                if(!cache.containsKey(temp))
                    val += money(temp, coinTypes);
                else
                    val += cache.get(temp);
        }
        cache.put(currentDollar, val);
        return val;
    }
}
