class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] result=new int[nums.length];
        int front=0;
        int back=nums.length-1;
        for(int num:nums){
            if(num%2==0){
                result[front++]=num;
            }
            else{
                result[back--]=num;
            }
        }
        return result;
    }
}