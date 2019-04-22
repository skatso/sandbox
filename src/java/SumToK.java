import java.util.HashMap;
import java.util.Map;

class SumToK {
    static int sumToK(int[] arr, int sum) {
        int pairs = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int num: arr) {
            if(map.containsKey(sum-num))
                pairs += map.get(sum-num);
            if(sum-num == num)
                pairs--;
        }
        return pairs/2;
    }
}
