class Solution {
    public int romanToInt(String s) {
        int count=0;
        int p=0;
        int i=s.length();
            for(i=s.length()-1;i>=0;i--){
                int d=0;
                if(s.charAt(i)=='I'){
                d+=1;
                }
                if(s.charAt(i)=='V'){
                d+=5;
                }
                if(s.charAt(i)=='X'){
                d+=10;
                }
                if(s.charAt(i)=='L'){
                d+=50;
                }
                if(s.charAt(i)=='C'){
                d+=100;
                }
                if(s.charAt(i)=='D'){
                d+=500;
                }
                if(s.charAt(i)=='M'){
                d+=1000;
                }
                if(d<p){
                    count-=d;
                }
                else{
                 count+=d;
                }
                p=d;
            }
            return count;
    }
}