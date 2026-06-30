class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int r=nums1.length-1;
        int l=0;
        while(l<nums2.length){
            if(nums1[r]==0){
                nums1[r]=nums2[l];
                r--;
                l++;
            }
        }
        Arrays.sort(nums1);
    }
}