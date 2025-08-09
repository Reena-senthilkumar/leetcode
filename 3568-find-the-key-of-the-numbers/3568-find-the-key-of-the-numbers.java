class Solution {
    public int generateKey(int num1, int num2, int num3) {
        String n1="0".repeat(4-String.valueOf(num1).length())+String.valueOf(num1);
        String n2="0".repeat(4-String.valueOf(num2).length())+String.valueOf(num2);
        String n3="0".repeat(4-String.valueOf(num3).length())+String.valueOf(num3);
        int min=0;
        int finalmin=0;
       int sb=0;
        for(int i=0;i<4;i++){
            min=Math.min(n1.charAt(i)-'0',n2.charAt(i)-'0');//0 //0
            finalmin=Math.min(min,n3.charAt(i)-'0');//0 //0
            sb=sb*10+finalmin;//
        }
         return sb;
    }
}