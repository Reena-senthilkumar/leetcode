class Solution {
    public int countBeautifulPairs(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                String s1=nums[i]+"";
                String s2=nums[j]+"";
                if(gcd(s1.charAt(0)-'0',s2.charAt(s2.length()-1)-'0')==1){
                    count++;
                }
            }
        }
        return count;
    }
    private int gcd(int num1,int num2){
    while (num1 != num2) {
            if (num1 > num2) {
                num1 -= num2;
            } else {
                num2 -= num1;
            }
        }
        return num1; 
    }
}