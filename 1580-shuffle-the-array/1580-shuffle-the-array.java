class Solution {
    public int[] shuffle(int[] nums, int n) {
        int re[]=new int[n*2];
        int i=0;
            for(int j=0;j<n;j++){
                re[i++]=nums[j];
                re[i++]=nums[j+n];
        }
        return re;
    }
}