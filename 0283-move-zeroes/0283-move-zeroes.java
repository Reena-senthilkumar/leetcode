class Solution {
    public void moveZeroes(int[] nums) {
        int p=0;
        for(int i=0;i<nums.length;i++){
        if(nums[i]!=0){
            nums[p]=nums[i];
            p+=1;
        }
        }while(p<nums.length){
            nums[p]=0;
            p+=1;
        }
       
    return ;
    }
}