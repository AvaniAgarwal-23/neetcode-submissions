class Solution {

    public String encode(List<String> strs) {
        StringBuilder f = new StringBuilder();
        for(String s: strs){
            f.append(s.length());
            f.append("#");
            f.append(s);
        }
        return f.toString();
    }

    public List<String> decode(String str) {
        ArrayList<String> finl= new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int g= Integer.parseInt(str.substring(i,j));
            String h= str.substring(j+1,j+1+g);
            finl.add(h);
            i= j+1+g;
        }
        return finl;
    }
}