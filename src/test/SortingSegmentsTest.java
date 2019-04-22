import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortingSegmentsTest {

    @Test
    void sortPairsTest1() {
        SortingSegments.Pair pair1      = new SortingSegments.Pair(1, 0);
        SortingSegments.Pair pair2      = new SortingSegments.Pair(0, 2);
        SortingSegments.Pair pair3      = new SortingSegments.Pair(2, 3);
        SortingSegments.Pair[] input    = new SortingSegments.Pair[]{pair3, pair1, pair2};
        SortingSegments.Pair[] actual   = new SortingSegments.Pair[]{pair1, pair2, pair3};
        SortingSegments.Pair[] expected = SortingSegments.sortPairs(input);
        for(int i = 0; i < actual.length; i++) {
            Assert.assertEquals(expected[i].start, actual[i].start);
            Assert.assertEquals(expected[i].end, actual[i].end);
        }
    }
}