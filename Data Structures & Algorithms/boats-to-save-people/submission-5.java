class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int count=0;
        int l=0;
        int r=people.length-1;
        while(l<=r){
            if(people[r]==limit||people[l]==limit){
                count++;
                if(people[r]==limit){
                    r--;
                }
                else{
                    l++;
                }
            }
            else if(people[l]+people[r]<=limit){
                r--;
                l++;
                count++;
            }
            else{
                r--;
                count++;
            }
        }
        return count;
    }
}