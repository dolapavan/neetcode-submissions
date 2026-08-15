class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] r=new int[nums.length];

//prefix
        r[0]=1;
        for(int i=1;i<nums.length;i++){
            r[i]=r[i-1]*nums[i-1];
        }//results-->1,1,2,8

        int suffix=1;
        for(int i=nums.length-1;i>=0;i--){
            r[i]=r[i]*suffix;// multiply the results of prefix with suffix
            suffix=suffix*nums[i];// and update the suffix by multiplying with nums[i] in every iteration
        }

        return r;
    }   
}  


//note:
//r[i]=r[i]*suffix;// multiply the results of prefix with suffix -- if you only have this in for loop then you will end up with same results like--> 1,2,2,8 because sufffix =1 .. so you have to update suffix in every iteration
//suffix=suffix*nums[i];// update the suffix by multiplying with nums[i] in every iteration
