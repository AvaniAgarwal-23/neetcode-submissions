class KthLargest {
    int k;
    PriorityQueue<Integer> x;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        x=new PriorityQueue<>();
        for(int y:nums){
            x.add(y);
            if(x.size()>k){
                x.poll();
            }
        }
    }
    public int add(int val) {
        x.add(val);
        if(x.size()>k){
            x.poll();
        }
        return x.peek();
    }
}
