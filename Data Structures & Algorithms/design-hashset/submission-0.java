class MyHashSet {
    boolean[] hh;
    public MyHashSet() {
        hh=new boolean[1000001];
    }
    
    public void add(int key) {
        hh[key]=true;
    }
    
    public void remove(int key) {
        hh[key]=false;
    }
    
    public boolean contains(int key) {
        return hh[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */