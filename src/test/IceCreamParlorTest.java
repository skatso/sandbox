import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IceCreamParlorTest {

    @Test
    void icecreamParlor() {
        int[] actual = IceCreamParlor.icecreamParlor(100, new int[]{5, 75, 25});
        int[] expected = new int[]{2, 3};
        Assert.assertEquals(expected[0], actual[0]);
        Assert.assertEquals(expected[1], actual[1]);
    }
}