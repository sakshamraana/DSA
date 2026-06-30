class Solution {
    public int countSegments(String s) {
        s=s.trim();
        if(s.isEmpty()){
            return 0;
        }
        String[] words=s.split("\\s+");
        int count=0;
        for(String word:words){
            count++;
        }
        return count;
    }
}