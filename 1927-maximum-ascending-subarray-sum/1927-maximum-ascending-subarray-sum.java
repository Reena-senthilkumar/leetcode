class Solution {
    public int maxAscendingSum(int[] nums) {
        int s1=nums[0];
        int result=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                s1+=nums[i];
            }
            else{
                 s1=nums[i];
            }
            result=Math.max(s1,result);
        }
        return result;
    }
}