class FradulentActivity {
    // Complete the activityNotifications function below.
    static boolean firstTime;
    static int[] histogram;

    static int activityNotifications(int[] expenditures, int d) {
        init();
        int numNotifications = 0;
        for(int i = d; i < expenditures.length; i++) {
            double dd = median(expenditures, i, d);
            if(expenditures[i] >= 2.0*dd)
                numNotifications++;
        }
        return numNotifications;
    }

    private static void init() {
        firstTime = true;
        histogram = new int[201];
    }

    private static double median(int[] expenditures, int currentIndex, int k) {
        int[] medianNums = new int[k];
        int index = 0;
        for(int i = currentIndex-k; i < currentIndex; i++) {
            medianNums[index] = expenditures[i];
            index++;
        }
        int startIndex = currentIndex-k-1 < 0 ? 0 : currentIndex-k-1;
        medianNums = sort(medianNums, expenditures[startIndex], expenditures[currentIndex-1]);
        if(k % 2 == 1)
            return medianNums[k/2];
        return (medianNums[k/2-1] + medianNums[k/2])/2.0;
    }

    private static int[] sort(int[] input, int startIndex, int endIndex) {
        if(firstTime) {
            //Create histogram of occurrences of each number in the input
            for(int i: input) {
                histogram[i] = histogram[i] + 1;
            }
            firstTime = false;
        } else {
            histogram[endIndex] = histogram[endIndex] + 1;
            histogram[startIndex] = histogram[startIndex] - 1;
        }


        //Modify the histogram so it carries the sum of occurrences going forward
        int sum = 0;
        int[] sumHistogram = new int[201];

        for(int i = 0; i < sumHistogram.length; i++) {
            sum += histogram[i];
            sumHistogram[i] = sum;
        }

        /*
            Work backwards from the input array such that we map the values
                in the input to their index in the histogram, decrease the value/count
                there by 1, and place the value in the input array indexed to this updated
                value/count in the output array
         */
        int inputVal;
        int[] output = new int[input.length];
        for(int i = input.length-1; i >= 0; i--) {
            inputVal = input[i];
            sumHistogram[inputVal] = sumHistogram[inputVal]-1;
            output[sumHistogram[inputVal]] = inputVal;
        }

        return output;
    }
}
