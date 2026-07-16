class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> twosum = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            twosum.put(nums[i],i);
        }

        for (int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(twosum.containsKey(diff) && twosum.get(diff)!= i){
                return new int [] {i , twosum.get(diff)};
            }
        }


        

        return new int [0];

        
    }
}
