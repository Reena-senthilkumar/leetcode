class Solution {
    public int rob(int[] nums) {
        int money=0;
        int money1=0;
        for(int n:nums){
            int temp=Math.max(money,money1+n);
            money1=money;
            money=temp;
    }
    return money;
}
}