class Solution {
    public String finalString(String s) {
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch!='i'){
                sb.append(ch);
            }
            else{
                sb.reverse();
            }
            
        }
        return sb.toString();
    }
}