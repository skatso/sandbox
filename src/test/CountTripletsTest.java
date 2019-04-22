import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

class CountTripletsTest {

    @Test
    void countTriplets() {
        ArrayList<Long> arr = new ArrayList<>(Arrays.asList(1L, 2L, 1L, 2L, 4L));
        Assert.assertEquals(3, CountTriplets.countTriplets(arr, 2));
        ArrayList<Long> arr2 = new ArrayList<>(Arrays.asList(1L, 3L, 9L, 9L, 27L, 81L));
        Assert.assertEquals(6, CountTriplets.countTriplets(arr2, 3));
    }
}