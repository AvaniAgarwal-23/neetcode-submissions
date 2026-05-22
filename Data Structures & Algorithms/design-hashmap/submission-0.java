class MyHashMap {
    int[] hh;
    public MyHashMap() {
        hh=new int[1000001];
        for(int i=0;i<hh.length;i++){
            hh[i]=-1;
        }
    }
    
    public void put(int key, int value) {
        hh[key]=value;
    }
    
    public int get(int key) {
        return hh[key];
    }
    
    public void remove(int key) {
        hh[key]=-1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */