class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        if(nums.length==0) return 0;
           int output=1;
        int inc=1;
        int dec=1;
        for(int i=1;i<nums.length;i++){
                if(nums[i]>nums[i-1]){
                   inc++;
                   dec=1;
                }
                else if(nums[i]<nums[i-1]){
                    dec++;
                    inc=1;
                }
                else{
                    inc=1;
                    dec=1;
                }
    output=Math.max(output,Math.max(inc,dec));
        }
    return output;
}
}