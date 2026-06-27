class Solution {
    public void revere(int[] nums,int l,int r){
        while(l<r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
    }
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        revere(nums,0,nums.length-1);
        revere(nums,0,k-1);
        revere(nums,k,nums.length-1);
    }
}