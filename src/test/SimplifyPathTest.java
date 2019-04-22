import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimplifyPathTest {

    @Test
    void simplifyPath() {
        Assert.assertEquals("/c", SimplifyPath.simplifyPath("/a/./b/../../c/"));
        Assert.assertEquals("/home/foo", SimplifyPath.simplifyPath("/home//foo/"));
    }
}