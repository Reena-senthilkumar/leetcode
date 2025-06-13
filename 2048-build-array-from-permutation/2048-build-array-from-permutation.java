class Solution {
    public int[] buildArray(int[] nums) {
        int[] result=new int[nums.length];
        int j=0;
        for(int i:nums){
            result[j++]=nums[i];
        }
        return result;
    }
}