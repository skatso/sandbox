import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TimeConversionTest {

    @Test
    void timeConversion() {
        Assert.assertEquals("19:05:45", TimeConversion.timeConversion("07:05:45PM"));
        Assert.assertEquals("12:05:45", TimeConversion.timeConversion("12:05:45PM"));
        Assert.assertEquals("00:05:45", TimeConversion.timeConversion("12:05:45AM"));
        Assert.assertEquals("07:05:45", TimeConversion.timeConversion("07:05:45AM"));
    }
}