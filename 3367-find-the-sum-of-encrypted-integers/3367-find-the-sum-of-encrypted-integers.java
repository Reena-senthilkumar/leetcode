class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10){ 
                sum+=nums[i];
            }
            else
            {
                int[] digits = String.valueOf(nums[i]).chars().map(c -> c - '0') .toArray();
                Arrays.sort(digits);
                String s=String.valueOf(digits[digits.length-1]).repeat(digits.length);
                sum=sum+Integer.parseInt(s);

            }
        }
        return sum;
    }
}