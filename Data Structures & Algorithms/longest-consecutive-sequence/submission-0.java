class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> s=new HashSet<>();
        for(int n:nums){
            s.add(n);
        }

        int maxLength=0;
        for(int n: nums){
            if(!s.contains(n-1)){
                int count=0;
                int cur=n;
                while(s.contains(cur)){
                    count++;
                    cur++;
                }
                maxLength=Math.max(maxLength,count);
            }
        }
        return maxLength;
    }
}

//here what happens is from array we will pick an element using for loop:
//1. if there is no previous value for that element in set then we consider it can start a sequence
//2. then considering it as current value if it is in set then we do count++ and current value++ such that for that particular element we will get the length of sequence (like wise we do for other elements using for loop)
//3. maxLength=Math.max(maxLength,count); --> lets says in ex1 consider element 2 where 2,3,4,5 are in sequence so sequence length is 4 then Math.max(0,4) results maxLength=4 and next when loop moves to next element like 20 it doesnt have sequence so length is 1 them Manth.max(4,1) results 4 ...like wise it does max count inside for loop for all elements in set
//4. finally results maxLength of the sequence