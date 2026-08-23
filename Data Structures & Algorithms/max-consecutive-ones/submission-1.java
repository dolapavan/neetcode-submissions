class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i=0;
        int count=0;
        int max=0;
        while(i<nums.length){
            if(nums[i]==1){
                count++;
                max=Math.max(max,count);
            }else{
                count=0;
            }
            i++;
        }
        return max;
    }
}
// if nums[i]=1 then count++ and if it breaks then count =0;
//but to find max count we need to store and comapare current count and previous count is it so current count is stored in "count" and previous count will be in "max" so everytime we will compare and stores the max consecutive's 

// for eg1, first frequency lo count=2, max=0 so max =2
// second frequency lo count=3,max=2 so max=3..output=3