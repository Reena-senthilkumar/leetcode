class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int op=0;
       for(int i=1;i<=Math.max(nums[0],nums[nums.length-1]);i++){
        if(nums[0]%i==0 && nums[nums.length-1]%i==0){
            op=i;
        }
       }
       return op;
    }
}