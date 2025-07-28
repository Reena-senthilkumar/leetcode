class Solution {
    public int[] leftRightDifference(int[] nums) {
        int result[]=new int[nums.length];
        int arr1[]=new int[nums.length];
        int arr2[]=new int[nums.length];
        int index=0;
        int sum=0;
        arr1[index++]=sum;
        for(int i=0;i<nums.length-1;i++){
            sum=sum+nums[i];
            arr1[index++]=sum;
        }
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