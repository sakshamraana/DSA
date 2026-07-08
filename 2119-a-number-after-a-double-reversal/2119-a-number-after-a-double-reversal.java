class Solution {
    public boolean isSameAfterReversals(int num) {
        int rev=0;
        int c=num;
        while(num!=0){
            int d=num%10;
            rev=rev*10+d;
            num/=10;
        }
        int org=0;
        while(rev!=0){
            int d=rev%10;;
            org=org*10+d;
            rev/=10;
        }
        if(org==c){
            return  true;
        }
        return false;
    }
}