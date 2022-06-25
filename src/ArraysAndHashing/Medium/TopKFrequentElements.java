package ArraysAndHashing.Medium;

import java.sql.Array;
import java.util.*;

public class TopKFrequentElements {
    public static int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n:nums){
            map.computeIfPresent(n, (x,y) -> y+1);
            map.computeIfAbsent(n, x -> 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                if(o1.getValue() == o2.getValue()) return o2.getKey() - o1.getKey();
                else return o2.getValue() - o1.getValue();
            }
        });

        for(int i = 0; i < k; i++){
            result[i]=(list.get(i).getKey());
        }
        return result;
    }
}