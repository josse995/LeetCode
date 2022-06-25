package ArraysAndHashing.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Boolean[] checked = new Boolean[strs.length];
        Arrays.fill(checked, false);
        List<List<String>> result = new ArrayList<>();
        for(int i = 0; i < strs.length; ++i){
            if (!checked[i]) {
                String word1 = strs[i];
                List<String> subResult = new ArrayList();
                subResult.add(word1);
                for (int j = i+1; j < strs.length; ++j) {
                    if (!checked[j]) {
                        String word2 = strs[j];
                        if (word1.length() == word2.length()) {

                            int[] store = new int[26];

                            for (int k = 0; k < word1.length(); ++k) {
                                store[word1.charAt(k) - 'a']++;
                                store[word2.charAt(k) - 'a']--;
                            }

                            Boolean valid = true;
                            for (int n : store) {
                                if (n != 0) {
                                    valid = false;
                                    break;
                                }
                            }
                            if(valid){
                                checked[j] = true;
                                subResult.add(word2);
                            }
                        }
                    }
                }
                checked[i] = true;
                result.add(subResult);
            }
        }
        return result;
    }
}