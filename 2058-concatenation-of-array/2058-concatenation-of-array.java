class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] re=new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
            re[i]=nums[i];
        }
        int j=0;
        for(int i=nums.length;i<re.length;i++){
            re[i]=nums[j++];
        }
        return re;
    }
}