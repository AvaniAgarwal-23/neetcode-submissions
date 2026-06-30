class StockSpanner {
    Stack<int[]> l;
    public StockSpanner() {
        l=new Stack<>();
    }
    public int next(int price) {
        int count=1;
        while(!l.isEmpty()&&l.peek()[0]<=price){
            int z=l.peek()[1];
            l.pop();
            count+=z;
        }
        l.push(new int[]{price,count});
        return count;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */