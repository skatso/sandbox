import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MinArraySwapTest {

    @Test
    void minimumSwaps() {
        int[] arr = new int[]{7, 1, 3, 2, 4, 5, 6};
        Assert.assertEquals(5, MinArraySwap.minimumSwaps(arr));
    }
}