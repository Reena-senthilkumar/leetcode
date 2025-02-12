    class Solution {
        public int removeDuplicates(int[] nums) {
            Arrays.sort(nums);
            int l=nums.length;
            int j=0;
            for(int i=1;i<l;i++){
                if(nums[j]!=nums[i]){
                    j++;
                    nums[j]=nums[i];
                }
                else{
                    continue;
                }
            }
            return j+1;
    }} 

