class Solution {
    public int[] shuffle(int[] nums, int n) {
          int []arr=new int[2*n];
          int b=0;
          for(int i=0;i<n;i++){
            arr[b]=nums[i];
            arr[b+1]=nums[n+i];
            b+=2;
          }
          return arr;
    }
}