class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        if(Arrays.binarySearch(nums,1) < 0){
            return 1;
        }
        if(nums[nums.length-1]<1){
                return 1;
        }
        for(int i=2;i<=nums.length;i++){
            if(nums[i-2]==nums[i-1]){
                continue;
            }
            else if(nums[i-2] <= 0){
                continue;
            }
            else if(nums[i-2]+1==nums[i-1]){
                continue;
            }
            else if(nums[i-2]+1!=nums[i-1]){
                return nums[i-2]+1;
            }
            else{
                continue;
            }
        }
        return nums[nums.length-1]+1;
    }
}