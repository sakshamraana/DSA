class Solution {
    public boolean judgeSquareSum(int c) {
        long i=0;
        long j=(long)Math.sqrt(c);
        while(i<=j){
            long z=(i*i)+(j*j); 
            if(z==c){
                return true;
            }
            else if(z>c){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }
}