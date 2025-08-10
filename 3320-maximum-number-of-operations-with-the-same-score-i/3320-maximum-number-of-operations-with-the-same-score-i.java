class Solution {
    public int maxOperations(int[] nums) {
        int result=1;
        int sum=nums[0]+nums[1];
        for(int i=2;i<nums.length-1;i=i+2){
              if(nums[i]+nums[i+1]==sum){
                result++;
              }
              else{
                break;
              }
        }
        return result;
    }
}