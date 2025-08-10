class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int temp=0,count=0;
        for(int num:nums){
            temp+=num;
            if(temp==0){
                count++;
            }
        }
        return count;
    }
}