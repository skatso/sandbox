import org.junit.Assert;
import org.junit.jupiter.api.Test;

class CoinCounterTest {

    @Test
    void money() {
        int[] arr = new int[]{1, 2, 3};
        Assert.assertEquals(4, CoinCounter.money(3, arr));
    }
}