package lukas.week1.day1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SampleJUnitTest {
    @Test
    public void basicTestExample() {
        int a = 2 + 2;
        Assertions.assertEquals(4, a);
    }
}
