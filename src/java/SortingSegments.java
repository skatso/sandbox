import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class SortingSegments {
    static class Pair {
        int start;
        int end;
        Pair(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    static Pair[] sortPairs(Pair[] pairs) {
        if(pairs.length == 0)
            return null;
        if(pairs.length == 1)
            return pairs;
        Map<Integer, Integer> startValsAsKeys = new HashMap<>();
        Map<Integer, Integer> endValsAsKeys = new HashMap<>();
        for(Pair pair: pairs) {
            startValsAsKeys.put(pair.start, pair.end);
            endValsAsKeys.put(pair.end, pair.start);
        }
        LinkedList<Pair> linkedList = new LinkedList<>();
        Pair pair = pairs[0];
        int start = pair.start;
        int end = pair.end;
        int temp;
        linkedList.addFirst(pair);
        boolean isNotFinished = true;
        while(isNotFinished) {
            isNotFinished = false;
            if(endValsAsKeys.containsKey(start)) {
                temp = endValsAsKeys.get(start);
                pair = new Pair(temp, start);
                start = temp;
                linkedList.addFirst(pair);
                isNotFinished = true;
            }
            if(startValsAsKeys.containsKey(end)) {
                temp = startValsAsKeys.get(end);
                pair = new Pair(end, temp);
                end = temp;
                linkedList.addLast(pair);
                isNotFinished = true;
            }
        }
        return linkedList.toArray(new Pair[0]);
    }
}
