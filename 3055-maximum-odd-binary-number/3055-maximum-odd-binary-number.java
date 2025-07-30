class Solution {
    public String maximumOddBinaryNumber(String s) {
        StringBuilder sb=new StringBuilder();
        int one=0;
        int zero=0; 
        for(char ch:s.toCharArray()){
            if(ch=='1'){
                one++;
            }
            else if(ch=='0'){
                zero++;
            }
        }
        sb.append("1".repeat(one-1)).append("0".repeat(zero)).append("1");
        return sb.toString();
    }
}