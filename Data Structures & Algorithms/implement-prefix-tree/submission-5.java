class trienoe{
    trienoe[] x;
    boolean one;
    trienoe(){
        x=new trienoe[26];
        one=false;
    }
}
class PrefixTree {
    trienoe root;
    public PrefixTree() {
        root=new trienoe();
    }
    public void insert(String word) {
        trienoe temp=root;
        for(int i=0;i<word.length();i++){
            int inex=word.charAt(i)-'a';
            if(temp.x[inex]==null){
                temp.x[inex]=new trienoe();
            }
            temp=temp.x[inex];
        }
        temp.one=true;
    }
    public boolean search(String word) {
        trienoe temp=root;
        for(int i=0;i<word.length();i++){
            int inex=word.charAt(i)-'a';
            if(temp.x[inex]==null){
                return false;
            }
            temp=temp.x[inex];
        }
        return temp.one;
    }

    public boolean startsWith(String prefix) {
        trienoe temp=root;
        for(int i=0;i<prefix.length();i++){
            int inex=prefix.charAt(i)-'a';
            if(temp.x[inex]==null){
                return false;
            }
            temp=temp.x[inex];
        }
        return true;
    }
}
