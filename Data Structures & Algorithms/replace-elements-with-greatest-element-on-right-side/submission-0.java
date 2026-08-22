class Solution {
    public int[] replaceElements(int[] arr) {
        int maxOnRight=-1;

        for(int i=arr.length-1;i>=0;i--){
            int currentValue= arr[i];//2,1,3,5,4,2
            arr[i]=maxOnRight;//-1,2,2,3,5,5
            maxOnRight=Math.max(currentValue,maxOnRight );//(2,-1),(1,2),(3,2),(5,3),(4,5)
        }
        return arr;
    }
}
