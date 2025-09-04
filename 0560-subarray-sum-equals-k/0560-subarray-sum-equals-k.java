class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            int tempsum=0;
            for(int j=i;j<nums.length;j++){
                tempsum+=nums[j];
                if(tempsum==k){
                    count++;
                }
               sum+=tempsum;
        }
        }
        return count;
    }
}