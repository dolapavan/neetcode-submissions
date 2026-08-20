class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> l=new ArrayList<>();
        Arrays.sort(nums);//-4,-1,-1,0,1,2
        for(int i=0;i<nums.length;i++){
            if(i >0 && nums[i]==nums[i-1]){//why i,i-1 because i,i+1 gives IOBException so i,i-1 
                continue;
            }
            int target = -nums[i];// need two numbers that sum to this
            int left=i+1; 
            int right= nums.length-1;
            while(left<right){
                int sum=nums[left]+nums[right];
                if(sum<target){
                    left++;// sum too small → pick bigger left value
                }else if(sum>target){
                    right--;// sum too big → pick smaller right value
                }else{
                    l.add(Arrays.asList(nums[i],nums[left],nums[right]));

                    // skip duplicate left/right values to avoid duplicate triplets
                    while(left<right && nums[left]== nums[left+1]){
                        left++;
                    }
                    while(left<right && nums[right]== nums[right-1]){
                        right--;
                    }
                    left++;
                    right--;

                }
            }
        }
        return l;
    }
}
