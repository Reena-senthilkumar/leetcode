class Solution {
    public int[] evenOddBit(int n) {
        String s=Integer.toBinaryString(n);
        int even=0;
        int odd=0;
        for(int i=s.length()-1;i>=0;i--){
           if(s.charAt(i)=='1' && (s.length()-i+1)%2==0){
            even++;
           }
           else if(s.charAt(i)=='1' && (s.length()-i+1)%2!=0){
            odd++;
           }
        }
        return new int[]{even,odd};
    }
}