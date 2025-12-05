class Solution {
    public int countPartitions(int[] nums) {
        int sum1=nums[0];
        int count=0;
        for(int i=1;i<nums.length;i++){
            int sum2=0;
            for(int j=i;j<nums.length;j++){
               sum2+=nums[j];
            }
            if((sum1-sum2)%2==0){
                count++;
            }
            sum1=sum1+nums[i];
        }
        return count;
    }
}