class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int r=0;
        while(left<right){
            int re=Math.min(heights[left],heights[right])*(right-left);
            r=Math.max(r,re);
            if(heights[left]<heights[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return r;
    }
}
