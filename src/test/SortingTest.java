import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.*;

class CountingSortTest {

    @Test
    void countingSort() {
        int range       = 256;
        int size        = 512;
        int[] input     = new int[size];
        int[] expected  = new int[size];
        int val;
        for(int i = 0; i < size; i++) {
            val         = ThreadLocalRandom.current().nextInt(0, range);
            input[i]    = val;
            expected[i] = val;
        }
        input = CountingSort.sort(input, range);
        Arrays.sort(expected);
        for(int i = 0; i < size; i++)
            Assert.assertEquals(expected[i], input[i]);
    }
}