class Solution {
    public boolean validPalindrome(String s) {
       StringBuilder sb=new StringBuilder();
       int temp=0;
       while(temp!=s.length()){
       for(int i=0;i<s.length();i++){
             if(i!=temp){
                sb.append(s.charAt(i));
             }
       }
       String a=sb.toString();
       String b=new StringBuilder(a).reverse().toString();
       if(a.equals(b)){
        return true;
       }
       temp++;
       sb.setLength(0);
       }
       return false;
}
}
