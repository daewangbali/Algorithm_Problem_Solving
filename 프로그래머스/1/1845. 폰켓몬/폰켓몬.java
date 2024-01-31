import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            hm.put(nums[i] , hm.getOrDefault(nums[i], 0) + 1); 
        }
        
        return hm.size() < nums.length / 2 ? hm.size() : nums.length / 2;
    }
}