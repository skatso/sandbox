import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class FrequencyQueriesTest {

    @Test
    void freqQuery() {
        int[][] queries1 = new int[][]{
                {1, 3},
                {2, 3},
                {3, 2},
                {1, 4},
                {1, 5},
                {1, 5},
                {1, 4},
                {3, 2},
                {2, 4},
                {3, 2}
        };
        List<Integer> results1 = new ArrayList<>();
        results1.add(0);
        results1.add(1);
        results1.add(1);
        Assert.assertEquals(results1, FrequencyQueries.freqQuery(queries1));
    }
}