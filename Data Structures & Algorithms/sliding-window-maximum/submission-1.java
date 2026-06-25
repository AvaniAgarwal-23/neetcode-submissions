class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Integer> h=new PriorityQueue<>(Collections.reverseOrder());
        int[] ans=new int[nums.length-k+1];
        int left=0;
        int right=0;
        int i=0;
        while(right<nums.length){
            h.add(nums[right]);
            if(right-left+1==k){
                ans[i]=h.peek();
                h.remove(nums[left]);
                left++;
                i++;
            }
            right++;
        }
        return ans;
    }
}