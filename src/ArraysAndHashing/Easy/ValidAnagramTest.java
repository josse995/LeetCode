package ArraysAndHashing.Easy;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidAnagramTest {

    @Test
    public void testTrue() {
        assertTrue(ValidAnagram.isAnagram("anagram", "nagaram"));
    }

    @Test
    public void testFalse() {
        assertFalse(ValidAnagram.isAnagram("rat", "car"));
    }
}