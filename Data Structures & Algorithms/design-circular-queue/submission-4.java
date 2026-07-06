/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */

class MyCircularQueue {
    int rr[];
    int front;
    int totl;
    int rer;
    public MyCircularQueue(int k) {
        rr=new int[k];
        front=0;
        rer=0;
        totl=0;
    }
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        else{
            rr[rer]=value;
            rer=(rer+1)%rr.length;
            totl++;
        }
        return true;
        }
    
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        front=(front+1)%rr.length;
        totl--;
        return true;
    }
    
    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return rr[front];
    }
    
    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        return rr[(rer-1+rr.length)%rr.length];
    }
    
    public boolean isEmpty() {
        if(totl==0){
            return true;
        }
        return false;
    }
    
    public boolean isFull() {
        if(totl==rr.length){
            return true;
        }
        return false;
    }
}

