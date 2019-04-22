class ArrayManipulation {
    static long arrayManipulation(int n, int[][] queries) {
        long[] arr = new long[n];
        int start;
        int end;
        int val;
        for(int[] query: queries) {
            start       = query[0]-1;
            end         = query[1];
            val         = query[2];
            arr[start]  += val;
            if(end < n)
                arr[end] -= val;
        }
        long max = Long.MIN_VALUE;
        long temp = 0;
        for(long l: arr) {
            temp+=l;
            if(temp > max)
                max = temp;
        }
        return max;
    }
}
