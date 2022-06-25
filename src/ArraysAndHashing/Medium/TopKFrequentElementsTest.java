package ArraysAndHashing.Medium;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TopKFrequentElementsTest {

    @Test
    public void test1() {
        int array[] = new int[]{1,1,1,2,2,3};
        int k = 2;
        int result[] = TopKFrequentElements.topKFrequent(array, k);
        assertTrue(result.length == k);
        for(int i = 0; i<result.length;++i){
            assertTrue(List.of(1,2).get(i) == result[i]);
        }

    }

    @Test
    public void test2() {
        int array[] = new int[]{1};
        int k = 1;
        int result[] = TopKFrequentElements.topKFrequent(array, k);
        assertTrue(result.length == k);
        for(int i = 0; i<result.length;++i){
            assertTrue(List.of(1).get(i) == result[i]);
        }
    }

    @Test
    public void test3() {
        int array[] = new int[]{4,1,-1,2,-1,2,3};
        int k = 2;
        int result[] = TopKFrequentElements.topKFrequent(array, k);
        assertTrue(result.length == k);
        for(int i = 0; i<result.length;++i){
            assertTrue(List.of(-1,2).get(i) == result[i]);
        }

    }
}