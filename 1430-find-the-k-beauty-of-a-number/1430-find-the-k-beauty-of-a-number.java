class Solution {
    public int divisorSubstrings(int num, int k) {
        String s=String.valueOf(num);
        int c=0;
        for(int i=0;i<=s.length()-k;i++){
            // String sub=s.substring(i,k+i);
            int div=Integer.parseInt(s.substring(i,k+i));
        if(div!=0 && num % div==0){
            c++;
        }
       }
     return c;
    }
}