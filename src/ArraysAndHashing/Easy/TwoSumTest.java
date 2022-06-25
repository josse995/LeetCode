package ArraysAndHashing.Easy;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TwoSumTest {

    @Test
    public void test1() {
        int array[] = new int[]{2,7,11,15};
        int result[] = TwoSum.twoSum(array, 9);
        assertTrue(result[0] == 0 && result[1] == 1);
    }

    @Test
    public void test2() {
        int array[] = new int[]{3,2,4};
        int result[] = TwoSum.twoSum(array, 6);
        assertTrue(result[0] == 1 && result[1] == 2);
    }

    @Test
    public void test3() {
        int array[] = new int[]{3,3};
        int result[] = TwoSum.twoSum(array, 6);
        assertTrue(result[0] == 0 && result[1] == 1);
    }
}