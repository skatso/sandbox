class CountingSort {
    static int[] sort(int[] input, int range) {
        int[] histogram = new int[range];

        //Create histogram of occurrences of each number in the input
        for(int i: input) {
            histogram[i] = histogram[i] + 1;
        }

        //Modify the histogram so it carries the sum of occurrences going forward
        int sum = 0;
        for(int i = 0; i < histogram.length; i++) {
            sum += histogram[i];
            histogram[i] = sum;
        }

        int[] output = new int[input.length];
        /*
            Work backwards from the input array such that we map the values
                in the input to their index in the histogram, decrease the value/count
                there by 1, and place the value in the input array indexed to this updated
                value/count in the output array
         */
        int inputVal;
        for(int i = input.length-1; i >= 0; i--) {
            inputVal = input[i];
            histogram[inputVal] = histogram[inputVal]-1;
            output[histogram[inputVal]] = inputVal;
        }

        return output;
    }
}
