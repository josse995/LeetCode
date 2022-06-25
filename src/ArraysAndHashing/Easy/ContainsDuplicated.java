package ArraysAndHashing.Easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ContainsDuplicated {
    public static boolean containsDuplicateLowSpeed(int[] nums) {
        boolean found = false;
        if (nums != null) {
            List<Integer> duplicatedItems = new ArrayList<Integer>();
            for (int i = 0; i < nums.length && !found; ++i) {
                found = duplicatedItems.contains(nums[i]);
                if (!found) duplicatedItems.add(nums[i]);
            }
        }
        return found;
    }

    public static boolean containsDuplicateBestPerformance(int[] nums) {
        Set<Integer> uniques = new HashSet<>();
        for (final int num: nums){
            if(!uniques.add(num)){
                return true;
            }
        }
        return false;
    }
}