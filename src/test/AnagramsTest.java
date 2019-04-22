import org.junit.Assert;
import org.junit.jupiter.api.Test;

class AnagramsTest {

    @Test
    void sherlockAndAnagrams() {
        Assert.assertEquals(5, Anagrams.sherlockAndAnagrams("abab"));
        Assert.assertEquals(4, Anagrams.sherlockAndAnagrams("abba"));
    }
}