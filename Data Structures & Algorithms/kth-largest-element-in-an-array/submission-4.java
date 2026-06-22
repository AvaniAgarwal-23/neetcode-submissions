class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> x=new PriorityQueue<>();
        for(int y:nums){
            x.add(y);
            if(x.size()>k){
            x.poll();
            }
        }
        return x.peek();
    }
}
