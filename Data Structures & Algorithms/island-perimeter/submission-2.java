class Solution {
    boolean[][] et;
    public int perimeter(int[][] grid,int i,int j){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length){
            return 1;
        }
        if(grid[i][j]==0){
            return 1;
        }
        if(et[i][j]){
            return 0;
        }
        et[i][j]=true;
        return perimeter(grid,i-1,j)+perimeter(grid,i+1,j)+perimeter(grid,i,j-1)+perimeter(grid,i,j+1);
    }
    public int islandPerimeter(int[][] grid) {
        et=new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    return perimeter(grid,i,j);
                }
            }
        }
        
    return 0;
    }
}