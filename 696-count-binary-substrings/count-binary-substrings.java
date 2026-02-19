class Solution {
    public int countBinarySubstrings(String s) {
        char[] a=s.toCharArray();
        int prev=0;
        int curr=1;
        int count=0;
        for(int i=1;i<a.length;i++){
            if(a[i]==a[i-1]){
              curr++;
               
            }
            
           else{
            count += Math.min(prev,curr);
             prev=curr;
                curr=1;
           } 
        }count += Math.min(prev,curr);
        return count;
    }
}