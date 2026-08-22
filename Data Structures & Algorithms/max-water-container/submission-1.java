class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int area=0;

        while(left<right){
            int width=right - left;
            int height=Math.min(heights[left],heights[right]);
            area=Math.max(area, width*height);//find max area
            if(heights[left]< heights[right]){
                left++;// if current bax is less than next then move to next as we need to find max area
            }else{
                right--;
            }
        }
        return area;
    }
}
