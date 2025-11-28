class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb=new StringBuilder();
        int n1=num1.length()-1;
        int n2=num2.length()-1;
        int carry=0;
        while(n1>=0 || n2>=0 || carry!=0){
            int a=(n1>=0) ? num1.charAt(n1--)-'0':0;
            int b=(n2>=0) ? num2.charAt(n2--)-'0':0;

            int sum=a+b+carry;
            sb.append(sum%10);
            carry=sum/10;
        }
        return sb.reverse().toString();
    }
}