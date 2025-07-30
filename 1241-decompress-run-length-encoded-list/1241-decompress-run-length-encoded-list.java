class Solution {
    public int[] decompressRLElist(int[] nums) {
        int n=0;
        for(int i=0;i<nums.length;i=i+2){
            n+=nums[i];
        }
        int[] result=new int[n];
        int index=0;
        for(int i=1;i<nums.length;i=i+2){ 
            for(int j=0;j<nums[i-1];j++){
                result[index++]=nums[i];
            }
        }
        return result;
    }
}