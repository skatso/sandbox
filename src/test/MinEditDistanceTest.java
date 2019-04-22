import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinEditDistanceTest {

    @Test
    void minEditDistance() {
        Assert.assertEquals(1, MinEditDistance.minEditDistance("MY", "me"));
        Assert.assertEquals(3, MinEditDistance.minEditDistance("Saturday", "Sunday"));
        Assert.assertEquals(5, MinEditDistance.minEditDistance("Hello", "Madme"));
    }
}