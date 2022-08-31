import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testMemoryConsumption_FlyweightShouldBeLessThanClone() {
        long memoryUsageForCloned = -1;
        long memoryUsageForFlyweight = -1;
        final int BOOK_COUNTS = 1_000_000;

        try {
            memoryUsageForCloned = Main.runWithClone(BOOK_COUNTS);
        }
        catch(OutOfMemoryError e) {
            e.printStackTrace();
        }

        try {
            memoryUsageForFlyweight = Main.runWithFlyweight(BOOK_COUNTS);
        }
        catch(OutOfMemoryError e) {
            e.printStackTrace();
        }

        if (memoryUsageForCloned == -1 && memoryUsageForFlyweight == -1) {
            fail("Both failed with out of memory error. Please try again with lower BOOK_COUNTS to accommodate your system requirement.");
        }
        else if (memoryUsageForCloned == -1 && memoryUsageForFlyweight > -1) {
            // pass
        }
        else if (memoryUsageForCloned > -1 && memoryUsageForFlyweight == -1) {
            fail("Somehow Clone completed but Flyweight is out of memory. Please check the code as this should not happen.");
        }
        else {
            assertTrue(String.format("Clone usage is %d which is less than %d of flyweight", memoryUsageForCloned, memoryUsageForFlyweight), memoryUsageForCloned >= memoryUsageForFlyweight);
        }
    }
}