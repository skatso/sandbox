import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void fibonacci() {
        Fibonacci.init();
        Assert.assertEquals(144, Fibonacci.fibonacci(12));
    }
}