class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder b = new StringBuilder();
        int left=0;
        int right=0;
        while(left<word1.length()&&right<word2.length()){
            b.append(word1.charAt(left));
            b.append(word2.charAt(right));
            left++;
            right++;
        }
        while(left<word1.length()||right<word2.length()){
            if(left<word1.length()){
                b.append(word1.charAt(left));
                left++;
            }
            if(right<word2.length()){
                b.append(word2.charAt(right));
                right++;
            }
        }
        return b.toString();
    }
}