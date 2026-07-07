class Solution {
    public long sumAndMultiply(int n) {
        int rev=0;
        while(n!=0){
            int d=n%10;
            if(d!=0){
          rev=rev*10+d;
            }
            n/=10;
        }
        int sum=0;
        long org=0;
        while(rev!=0){
            int c=rev%10;
          org=org*10+c;
          sum+=c;
          rev/=10;
        }
        long b=org*sum;
        return b;
    }
}