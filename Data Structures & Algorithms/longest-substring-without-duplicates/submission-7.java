class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> h=new HashSet<>();
        int left=0;
        int right=0;
        int mx=0;
        while(right<s.length()){
            if(!h.contains(s.charAt(right))){
                h.add(s.charAt(right));
                mx=Math.max(mx,right-left+1);
                right++;
            }
            else{
                h.remove(s.charAt(left));
                left++;
            }
        }
        return mx;
    }
}