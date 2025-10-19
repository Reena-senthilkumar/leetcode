class Solution {
    public int minOperations(List<Integer> nums, int k) {
        int count=0;
        int output=0;
        boolean[] found=new boolean[k];
        Arrays.fill(found,false);
        for(int i=nums.size()-1;i>=0;i--){
            if(nums.get(i) <= k && !found[nums.get(i) - 1]) {
             found[nums.get(i) - 1] = true;
             count++;
             }
            if(count==found.length){
            output=nums.size()-i;
             break;
            }
        }
        return output;
    }
}