class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(first<second && second<nums[i]){
                return true;
            }
            if(nums[i]>first){
                second=nums[i];
            }
            first=Math.min(first,nums[i]);
        }
        return false;
    }
}