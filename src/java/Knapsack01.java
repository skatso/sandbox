class Knapsack01 {
    static int knapsack(int capacity, int[] values, int[] weights, int n) {
        //We have no more room or no more items to go through
        if(capacity == 0 || n == 0)
            return 0;
        //We can't include the item in our bag
        //Remember, we use n-1 for proper indexing
        if(capacity < weights[n-1])
            return knapsack(capacity, values, weights,n-1);
        /*
        We either:
            1. Include the item
            2. Do not include the item
         */
        return Math.max(values[n-1] + knapsack(capacity-weights[n-1], values, weights, n-1),
                        knapsack(capacity, values, weights,n-1));
    }

    static int knapsack01DP(int capacity, int[] values, int[] weights, int n) {
        int[][] table = new int[n][capacity];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < capacity; j++) {
                //Initialize top and left rows to 0
                if(i == 0 || j == 0)
                    table[i][j] = 0;
                else if(weights[n] < capacity)
                    table[i][j] = Math.max( values[i] + table[i-1][capacity-weights[j-1]],
                                            table[i-1][j]);
                else
                    table[i][j] = table[i-1][j];

            }
        }
        return table[n-1][capacity-1];
    }
}