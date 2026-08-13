class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> s=new HashSet<>();
        for(int n:nums){
            s.add(n);
        }


        int maxLength=0;
        for(int n:nums){
            if(!s.contains(n-1)){
                int length=1;
                while(s.contains(n+length)){
                    length++;
                }
                maxLength=Math.max(maxLength,length);
            }
        }
        return maxLength;
    }
}

//here what happens is from array we will look all elements into set to avoid duplicates and start picking each element using one more loop to check the max sequence length:
//1. if there is no previous value for that particular element in set then we consider that the element starts a sequence then we create length=1 and we check with while loop by incrementing the length and checking weather next elements are there in set or not and then we find the length of the sequence
//2. maxLength=Math.max(maxLength,length); --> lets says in ex1 consider element 2 where 2,3,4,5 are in sequence so sequence length is 4 then Math.max(0,4) results maxLength=4 and next when loop moves to next element like 20 it doesnt have sequence so length is 1 them Math.max(4,1) results 4 ...like wise it does max count inside for loop for all elements in set
//4. finally results maxLength of the sequence