class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> x=new PriorityQueue<>(Collections.reverseOrder());
        for(int y:stones){
            x.add(y);
        }
        while(x.size()>1){
            int q=x.poll();
            int y=x.poll();
            if(q!=y){
                x.add(Math.abs(q-y));
            }
        }
        if(x.isEmpty()){
            return 0;
        }
        return x.peek();
    }
}
