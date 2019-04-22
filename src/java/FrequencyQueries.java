import java.util.*;

class FrequencyQueries {
    static List<Integer> freqQuery(int[][] queries) {
        Map<Integer, Integer> numToFreq = new HashMap<>();
        Map<Integer, Set<Integer>> freqsToSet = new HashMap<>();
        List<Integer> results = new ArrayList<>();
        int command;
        int val;
        int freq;
        Set<Integer> set;
        for(int[] query: queries) {
            command = query[0];
            val     = query[1];
            if(command == 1) {
                numToFreq.put(val, numToFreq.getOrDefault(val, 0) + 1);
                freq = numToFreq.get(val);

                if(!freqsToSet.containsKey(freq)) {
                    set = new HashSet<>();
                } else {
                    set = freqsToSet.get(freq);
                }
                set.add(val);
                freqsToSet.put(freq, set);

                if(freqsToSet.containsKey(freq-1)) {
                    set = freqsToSet.get(freq-1);
                    set.remove(val);
                    freqsToSet.put(freq-1, set);
                }

            } else if(command == 2) {
                if(numToFreq.containsKey(val)) {
                    if(numToFreq.get(val)-1 == 0) {
                        numToFreq.remove(val);
                        freq = 0;
                    } else {
                        numToFreq.put(val, numToFreq.get(val) - 1);
                        freq = numToFreq.get(val);
                    }

                    set = freqsToSet.get(freq+1);
                    set.remove(val);
                    freqsToSet.put(freq+1, set);

                    if (freq > 0 && freqsToSet.containsKey(freq)) {
                        set = freqsToSet.get(freq);
                        set.add(val);
                        freqsToSet.put(freq, set);
                    }
                }
            } else {
                if(freqsToSet.containsKey(val) &&
                    freqsToSet.get(val).size() > 0)
                    results.add(1);
                else
                    results.add(0);
            }
        }
        return results;
    }
}
