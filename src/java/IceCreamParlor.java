import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IceCreamParlor {
    static int[] icecreamParlor(int m, int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: arr) {
            if(!map.containsKey(i))
                map.put(i, 1);
            else
                map.put(i, map.get(i)+1);
        }
        int[] solution = new int[2];
        int val1 = -1;
        int val2 = -1;
        for(int i: map.keySet()) {
            if(map.containsKey(m-i)) {
                if(m - i != i || map.get(i) > 1) {
                    val1 = i;
                    val2 = m-i;
                    break;
                }
            }
        }
        for(int i = 0; i < arr.length; i++) {
            if(val1 != val2) {
                if(arr[i] == val1)
                    solution[0] = i+1;
                if(arr[i] == val2)
                    solution[1] = i+1;
            } else {
                if(arr[i] == val1 && solution[0] == 0)
                    solution[0] = i+1;
                else if(arr[i] == val2 && solution[0] > 0)
                    solution[1] = i+1;
            }
        }
        Arrays.sort(solution);
        return solution;
    }
}
