import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SherlockAndTheValidStringTest {

    @Test
    void isValid() {
        String yes  = "YES";
        String no   = "NO";
        String str2 = "aaaaabc";
        Assert.assertEquals(no, SherlockAndTheValidString.isValid(str2));
        Assert.assertEquals(yes, SherlockAndTheValidString.isValid("aab"));
        Assert.assertEquals(yes, SherlockAndTheValidString.isValid("baa"));
        Assert.assertEquals(yes, SherlockAndTheValidString.isValid("bbbaaaa"));
    }
}