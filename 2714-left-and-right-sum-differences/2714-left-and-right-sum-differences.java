class Solution {
    public int[] leftRightDifference(int[] nums) {
        int result[]=new int[nums.length];
        int arr1[]=new int[nums.length];
        int arr2[]=new int[nums.length];
        //array 1 that mean left sum
        int sum=0;
        for(int i=0;i<nums.length;i++){
            arr1[i]=sum;
            sum+=nums[i];
        }
        //array 2 that mean rightsum
        int sum1 = 0;
for (int i = nums.length - 1; i >= 0; i--) {
    arr2[i] = sum1;
    sum1 += nums[i];
}
        for(int i=0;i<nums.length;i++){
            result[i]=Math.abs(arr1[i]-arr2[i]);
        }
        return result;
    }
}