class Solution {
    public int characterReplacement(String s, int k) {
        int[] rr=new int[26];
        int left=0;
        int mx=0;
        int x=0;
        for(int right=0;right<s.length();right++){
            rr[s.charAt(right)-'A']++;
            mx=Math.max(mx,rr[s.charAt(right)-'A']);
            while((right-left+1)-mx>k) {
                rr[s.charAt(left)-'A']--;
                left++;
            }
            x=Math.max(x,right-left+1);
        }
        return x;
    }
}