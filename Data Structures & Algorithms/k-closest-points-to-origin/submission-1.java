class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> x=new PriorityQueue<>((a,b)->b[0]-a[0]);
        for(int i=0;i<points.length;i++){
            int w=points[i][0];
            int y=points[i][1];
            int f=w*w+y*y;
            x.offer(new int[]{f, w, y});
            if(x.size()>k){
                x.poll();
            }
        }
        int[][] g=new int[k][2];
        int h=0;
        while(!x.isEmpty()){
            int[] j=x.poll();
            g[h][0]=j[1];
            g[h][1]=j[2];
            h++;
        }
        return g;
    }
}
