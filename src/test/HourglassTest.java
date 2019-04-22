import org.junit.Assert;
import org.junit.jupiter.api.Test;

class HourglassTest {

    @Test
    void hourglassSum() {
        int[][] arr = new int[][]{
                {-9, -9, -9, 1, 1, 1},
                {0, -9, 0, 4, 3, 2},
                {-9, -9, -9, 1, 2, 3},
                {0, 0, 8, 6, 6, 0},
                {0, 0, 0, -2, 0, 0},
                {0, 0, 1,  2, 4, 0}
        };
        Assert.assertEquals(28, Hourglass.hourglassSum(arr));
    }
}