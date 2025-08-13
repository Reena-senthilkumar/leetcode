class Solution {
    public String findLatestTime(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
               if(s.charAt(i)=='?' && i==0 ){
                if(Character.getNumericValue(s.charAt(i+1))<=1){
                sb.append(String.valueOf("1"));
               }
               else{
                 sb.append(String.valueOf("0"));
               }
        }
               else if(s.charAt(i)=='?' && i==1){
                if(s.charAt(i-1)=='0'){
                    sb.append(String.valueOf("9"));
                }
                else{
                sb.append(String.valueOf("1"));
                }
               }
               else if(s.charAt(i)=='?' && i==3){
                sb.append(String.valueOf("5"));
               }
               else if(s.charAt(i)=='?' && i==4){
                sb.append(String.valueOf("9"));
               }
               else{
                sb.append(s.charAt(i));
               }
        }
        return sb.toString();
    }
}