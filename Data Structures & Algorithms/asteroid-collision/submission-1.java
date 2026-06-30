class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> t=new Stack<>();
        for(Integer x:asteroids){
            boolean y=true;
            while(y&&!t.isEmpty()&&t.peek()>0&&x<0){
                if(Math.abs(t.peek())<Math.abs(x)){
                    t.pop();
                }
                else if(Math.abs(t.peek())==Math.abs(x)){
                    t.pop();
                    y=false;
                }
                else{
                    y=false;
                }
            }
            if(y){
                t.push(x);
            }
        }
        int[] finl=new int[t.size()];
        for(int i=t.size()-1;i>=0;i--){
            finl[i]=t.pop();
        }
        return finl;
    }
}