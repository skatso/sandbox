import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestRectangleTest {

    @Test
    void largestRectangle() {
//        Assert.assertEquals(9, LargestRectangle.largestRectangle(new int[]{1, 2, 3, 4, 5}));
//        Assert.assertEquals(200, LargestRectangle.largestRectangle(new int[]{1, 1, 100, 100}));
        Assert.assertEquals(50, LargestRectangle.largestRectangle(new int[]{11, 11, 10, 10, 10}));
    }
}