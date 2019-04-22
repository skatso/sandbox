import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursiveDigitSumTest {

    @Test
    void superDigit() {
        Assert.assertEquals(8, RecursiveDigitSum.superDigit("593", 10));
        Assert.assertEquals(3, RecursiveDigitSum.superDigit("148", 3));
    }
}