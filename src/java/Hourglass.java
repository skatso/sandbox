class Hourglass {
    static int hourglassSum(int[][] arr) {
        int max = Integer.MIN_VALUE;
        int temp;
        for(int i = 1; i < arr.length-1; i++) {
            for(int j = 1; j < arr.length-1; j++) {
                temp = helper(arr, i, j);
                if(temp > max)
                    max = temp;
            }
        }
        return max;
    }

    private static int helper(int[][] arr, int rowMid, int colMid) {
        return arr[rowMid-1][colMid-1] + arr[rowMid-1][colMid] +
                arr[rowMid-1][colMid+1] + arr[rowMid][colMid] +
                arr[rowMid+1][colMid-1] + arr[rowMid+1][colMid] +
                arr[rowMid+1][colMid+1];
    }

}
