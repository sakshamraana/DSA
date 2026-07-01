class Solution {
    public boolean containsDuplicate(int[] nums) {
       HashSet<Integer> sc=new HashSet<>();
       for(int num:nums){
        if(sc.contains(num)){
            return true;
        }
        sc.add(num);
       }
       return false;
    }
}