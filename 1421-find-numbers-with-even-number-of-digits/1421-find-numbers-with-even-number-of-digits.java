class Solution {
    public int findNumbers(int[] nums) {
        int count1=0;
        for(int num:nums){
            int count=0;
            while(num!=0){
                int rem=num%10;
                count++;
                num=num/10;
            }
            if(count%2==0){
                count1++;
            }
        }
        return count1;
    }
}