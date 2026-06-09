class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> h=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char firt[]=strs[i].toCharArray();
            Arrays.sort(firt);
            String ok=new String(firt);
            if(!h.containsKey(ok)){
                h.put(ok,new ArrayList<>());
            }
            h.get(ok).add(strs[i]);
        }
        
        return new ArrayList<>(h.values());
    }
}