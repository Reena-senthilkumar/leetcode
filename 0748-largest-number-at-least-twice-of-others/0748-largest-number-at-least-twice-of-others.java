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
for (int i = 0; i < nums.length; i++) {
    if (i != index && nums[index] < nums[i] * 2)
        return -1;
}
return index;
    }
}