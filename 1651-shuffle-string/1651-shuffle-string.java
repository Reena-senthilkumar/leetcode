class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder sb=new StringBuilder();
        int j=0;
        char[] ch=new char[s.length()];
        for(int i:indices){
           ch[i]=s.charAt(j++);
        }
        for(char c:ch){
        sb.append(c);
        }
        return sb.toString();
    }
}