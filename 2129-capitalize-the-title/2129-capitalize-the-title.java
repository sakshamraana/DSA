class Solution {
    public String capitalizeTitle(String title) {
       String[] words=title.split(" ");
       StringBuilder sc=new StringBuilder();
       for(String word:words){
      word=word.toLowerCase();
            if(word.length()>2){
           word=Character.toUpperCase(word.charAt(0))+word.substring(1);
        }
        sc.append(word).append(" ");
       
        }
       return sc.toString().trim(); 
    }
}