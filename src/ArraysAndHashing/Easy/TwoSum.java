package ArraysAndHashing.Easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length - 1; ++i) {
            for(int j = 1; j < nums.length; ++j) {
                if (i != j) {
                    if (nums[i] + nums[j] == target)
                        return new int[]{i, j};
                }
            }
        }
        return null;
    }
}