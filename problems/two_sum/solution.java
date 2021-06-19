class Solution {
    private Map<Integer, Integer> toMap(int[] nums) {
        Map<Integer, Integer> result = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            result.put(nums[i], i);
        }
        return result;
    }
    
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) return new int[0];
        
        Map<Integer, Integer> mapNums = toMap(nums);
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (mapNums.containsKey(complement) && mapNums.get(complement) != i) 
                return new int[]{i, mapNums.get(complement)};
        }
        
        return new int[]{0, 1};
        
    }
}