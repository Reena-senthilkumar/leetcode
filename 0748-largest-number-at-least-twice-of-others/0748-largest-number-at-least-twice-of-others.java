class Solution {
    public int dominantIndex(int[] nums) {
int max = Arrays.stream(nums).max().getAsInt();
int index = -1;
for (int i = 0; i < nums.length; i++) {
    if (nums[i] == max) {
        index = i;
        break;
    }
}    
boolean temp=true;
for(int i=0;i<nums.length;i++){
    if(i!=index){
        if(nums[index]>=nums[i]*2){
            temp=true;
        }
        else{
            temp=false; break;
        }
    }
}    
        return temp? index : -1;
    }
}