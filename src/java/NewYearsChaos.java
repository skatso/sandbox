import java.util.HashMap;

public class NewYearsChaos {
    static void minimumBribes(int[] q) {
        int bribes = 0;
        String result = "";
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean isNotSorted = true;
        int mapVal = 0;
        int temp = 0;
        //Go through and sort the list.
        //Record the number of swaps in a map to keep track of >2 bribes
        if(q.length > 2) {
            while(isNotSorted) {
                isNotSorted = false;
                for(int i = 0; i < q.length-1; i++) {
                    if(q[i] > q[i+1]) {
                        isNotSorted = true;
                        //Swap the numbers (sorting)
                        temp = q[i];
                        q[i] = q[i+1];
                        q[i+1] = temp;
                        //Update the map
                        if(map.containsKey(temp)) {
                            mapVal = map.get(temp);
                            if(mapVal == 2) {
                                System.out.println("Too chaotic");
                                return;
                            }
                            map.put(temp, mapVal+1);
                        } else {
                            map.put(temp, 1);
                        }
                        bribes++;
                    }
                }
            }
        }
        System.out.println(bribes);
    }
}
