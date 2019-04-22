import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FradulentActivityTest {

    @Test
    void activityNotifications() {
        Assert.assertEquals(1, FradulentActivity.activityNotifications(new int[]{10, 20, 30, 40, 50}, 3));
        Assert.assertEquals(0, FradulentActivity.activityNotifications(new int[]{1, 2, 3, 4, 4}, 4));
        Assert.assertEquals(2, FradulentActivity.activityNotifications(new int[]{2, 3, 4, 2, 3, 6, 8, 4, 5}, 5));
    }
}