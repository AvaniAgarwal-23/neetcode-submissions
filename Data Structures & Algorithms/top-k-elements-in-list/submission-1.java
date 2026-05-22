class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int num : nums){
            if(h.containsKey(num)){
                h.put(num, h.get(num)+1);
            }
            else{
                h.put(num,1);
            }
        }
        int[] rr=new int[k];
        for(int i=0;i<k;i++){
            int mx=0;
            int element =0;
            for(int key: h.keySet()){
                if(h.get(key)>mx){
                    mx=h.get(key);
                    element=key;
                }
            }
            rr[i]=element;
            h.remove(element);
        }
        return rr;
    }
}
