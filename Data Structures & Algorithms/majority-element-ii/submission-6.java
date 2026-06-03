class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x: nums){
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }
            else{
                 map.put(x,1);
            }
        }
        ArrayList<Integer> rr= new ArrayList<>();
        for(Integer key: map.keySet()){
            if(map.get(key)>nums.length/3){
                rr.add(key);
            }
        }
        return rr;
    }
}