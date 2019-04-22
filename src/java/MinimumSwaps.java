public class MinimumSwaps {
    static int minimumSwaps(int[] arr) {
        /*
        Create cycle going from a number's value in the array
            compared to where it shoulud be in the array
            (actual position v desired position)
        The size of the cycle-1 shows how many swaps are needed
        Keep track of visited elements to determine cycles
        */
        boolean[] visited = new boolean[arr.length];
        int j;
        int cycleSize;
        int numSwaps = 0;
        for(int i = 0; i < arr.length; i++) {
            j = i;
            cycleSize = 0;
            while(!visited[j]) {
                visited[j] = true;
                j = arr[j]-1;
                cycleSize++;
            }

            if(cycleSize != 0) {
                numSwaps += cycleSize-1;
            }
        }
        return numSwaps;
    }
}
