import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KnapsackTest {
    private int[] values;
    private int[] weights;
    private int capacity;
    private int n;

    @Test
    void knapsack() {
        init();
        Assert.assertEquals(220, Knapsack01.knapsack(capacity, values, weights, n));
    }

    @Test
    void knapsackDP() {
        init();
        Assert.assertEquals(220, Knapsack01.knapsack(capacity, values, weights, n));
    }

    private void init() {
        values = new int[]{60, 100, 120};
        weights = new int[]{10, 20, 30};
        capacity = 50;
        n = values.length;
    }
}