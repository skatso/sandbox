class MinArraySwap {
    static int minimumSwaps(int[] arr) {
        int swap = 0;
        int temp;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != i+1) {
                for(int j = i; j < arr.length; j++) {
                    if(arr[j] == i+1) {
                        temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                        swap++;
                    }
                }
            }
        }
        return swap;
    }
}
