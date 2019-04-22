import java.util.*;

class CountTriplets {
    static long countTriplets(List<Long> arr, long r) {
        Map<Long, Long> middle  = new HashMap<>();
        Map<Long, Long> end     = new HashMap<>();
        long count = 0L;
        for(Long l: arr) {
            count += end.getOrDefault(l, 0L);
            if(middle.containsKey(l)) {
                end.put(l*r, end.getOrDefault(l*r, 0L) + middle.get(l));
            }
            middle.put(l*r, 1 + middle.getOrDefault(l*r, 0L));
        }
        return count;
    }
}
