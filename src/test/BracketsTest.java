import org.junit.Assert;
import org.junit.jupiter.api.Test;

class BracketsTest {

    @Test
    void bracket() {
        Assert.assertTrue(Brackets.bracket("{[()]}"));
        Assert.assertFalse(Brackets.bracket("{[()]"));
        Assert.assertFalse(Brackets.bracket("{[()])))"));
        Assert.assertFalse(Brackets.bracket("{[((((((({{"));
    }
}