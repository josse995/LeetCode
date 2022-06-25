package ArraysAndHashing.Easy;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

public class ContainsDuplicatedTest {

    private static int[][] dataTrue() {
        return new int[][] {{1,2,3,1},{1,1,1,3,3,4,3,2,4,2}};
    }
    private static int[][] dataFalse() {
        return new int[][] {{1,2,3,4}};
    }

    @Test
    @ParameterizedTest
    @MethodSource(value = "dataTrue")
    public void testTrue(int[] data) {
        assertTrue(ContainsDuplicated.containsDuplicateLowSpeed(data));
    }

    @Test
    @ParameterizedTest
    @MethodSource(value = "dataFalse")
    public void testFalse(int[] data) {
        assertFalse(ContainsDuplicated.containsDuplicateLowSpeed(data));
    }
}