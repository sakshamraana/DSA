class Solution {
    public String reverseWords(String s) {
     String[]r=s.trim().split("\\s+");
     String ans="";
     for(int i=r.length-1;i>=0;i--){
        ans+=r[i];
        if(i!=0){
            ans+=" ";
        }
     }
     return ans;
    }
}