class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length== 0){
            return 0;
        }
        Arrays.sort(nums);
        int count=1;
        int count2=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                continue;
            }
            else if(nums[i-1]+1==nums[i]){
                count++;
            }
            else{
                count2= Math.max(count2,count);
                count=1;
            }
        }
        count2 = Math.max(count2,count);
        return count2;
    }
}
