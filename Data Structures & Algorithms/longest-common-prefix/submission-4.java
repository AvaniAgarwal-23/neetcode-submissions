class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String finl= "";
        char firt[]=strs[0].toCharArray();
        char last[]=strs[strs.length-1].toCharArray();
        for(int i=0;i<firt.length;i++){
            if(firt[i]!=last[i]){
                break;
            }
            else{
                finl+=firt[i];
            }
        }
        return finl;
    }
}