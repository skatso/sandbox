import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumToKTest {

    @Test
    void sumToK() {
        int[] arr1 = new int[]{1, 5, 7, -1};
        int[] arr2 = new int[]{1, 5, 7, -1, 5};
        Assert.assertEquals(2, SumToK.sumToK(arr1, 6));
        Assert.assertEquals(3, SumToK.sumToK(arr2, 6));
    }
}