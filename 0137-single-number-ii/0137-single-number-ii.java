class Solution {
    public int singleNumber(int[] nums) {
       int op=1;
       boolean[] temp=new boolean[nums.length];
       temp[0]=true;
       for(int i=0;i<nums.length;i++){
        int count=1;
       if(!temp[i]){
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]==nums[j]){
                count++;
                temp[j]=true;
            }
        }
        if(count==1){
            op=nums[i];
        }
       }
       }
        return op ;
    }
}