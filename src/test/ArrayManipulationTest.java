import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayManipulationTest {

    @Test
    void arrayManipulation() {
        int[][] arr1 = new int[][]{
                {2, 6, 8},
                {3, 5, 7},
                {1, 8, 1},
                {5, 9, 15},
        };
        Assert.assertEquals(31, ArrayManipulation.arrayManipulation(10, arr1));
    }
}