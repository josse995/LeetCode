package ArraysAndHashing.Medium;

import ArraysAndHashing.Easy.ValidAnagram;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GroupAnagramsTest {

    @Test
    public void test1() {
        List<List<String>> result = GroupAnagrams.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
        assertTrue(List.of(List.of("bat"),List.of("nat","tan"),List.of("ate","eat","tea")).containsAll(result));
    }

    @Test
    public void test2() {
        List<List<String>> result = GroupAnagrams.groupAnagrams(new String[]{""});
        assertTrue(List.of(List.of("")).containsAll(result));
    }

    @Test
    public void test3() {
        List<List<String>> result = GroupAnagrams.groupAnagrams(new String[]{"a"});
        assertTrue(List.of(List.of("a")).containsAll(result));
    }
}