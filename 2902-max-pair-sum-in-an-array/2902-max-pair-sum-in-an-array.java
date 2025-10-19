class Solution {
    public int maxSum(int[] nums) {
        int result=-1;
        for(int i=0;i<nums.length-1;i++){
            int a=max(nums[i]);
            for(int j=i+1;j<nums.length;j++){
                int b=max(nums[j]);
                    if(a==b){
                        result=Math.max(result,nums[i]+nums[j]);
                    }
                }
            }
        return result;
    }
    private int max(int num){
        int m=Integer.MIN_VALUE;
         while(num!=0){
                 m=Math.max(m,num%10);
                 num/=10;
            }
            return m;
    }
}