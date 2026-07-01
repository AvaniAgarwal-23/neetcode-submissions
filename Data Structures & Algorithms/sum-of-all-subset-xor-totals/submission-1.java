class Solution {
    int finl=0;
    public void backtrack(int inex,int[] nums,int xor){
        if(inex==nums.length){
            finl+=xor;
            return;
        }
        backtrack(inex+1,nums,xor^nums[inex]);
        backtrack(inex+1,nums,xor);

    }
    public int subsetXORSum(int[] nums) {
        backtrack(0,nums,0);
        return finl;
    }
}