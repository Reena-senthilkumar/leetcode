class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count=0;
        long temp=0;
        for(int num:nums){
            if(num==0){
                temp++;
                count+=temp;
            }
            else{
                temp=0;
            }
        }
    return (long)count;
}
}