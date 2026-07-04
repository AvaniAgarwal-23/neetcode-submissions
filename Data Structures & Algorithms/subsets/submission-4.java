class Solution {
    public void finl(int inex,int[] nums,List<List<Integer>> x,List<Integer> temp){
        if(inex==nums.length){
            x.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[inex]);
        finl(inex+1,nums,x,temp);
        temp.remove(temp.size()-1);
        finl(inex+1,nums,x,temp);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> x=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        finl(0,nums,x,temp);
        return x;
    }
}
