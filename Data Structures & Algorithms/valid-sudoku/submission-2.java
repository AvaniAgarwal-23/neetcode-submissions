class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> h= new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                String r=board[i][j]+"row"+i;
                String c=board[i][j]+"col"+j;
                String b=board[i][j]+"box"+i/3+j/3;
                if(h.contains(r)||h.contains(c)||h.contains(b)){
                    return false;
                }
                h.add(r);
                h.add(c);
                h.add(b);
            }
        }
        return true;
    }
}
