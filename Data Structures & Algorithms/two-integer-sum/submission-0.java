class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complementary = target-nums[i];
            if(!m.containsKey(complementary)){
                m.put(nums[i],i);
            }else{
                return new int[]{m.get(complementary),i};
            }
        }
        return new int[]{};
    }
}
