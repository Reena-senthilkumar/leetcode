class Solution {
    public String reverseWords(String s) {
        String[] sp=s.split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(int i=sp.length-1;i>=0;i--){
            sb.append(sp[i]+" ");
        }
        return sb.toString().trim();
    }
}