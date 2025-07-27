class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb=new StringBuilder();
        char[] ch=s.toCharArray();
        sb.append(ch[0]);
        for(int i=1;i<ch.length;i++){
            if(Character.isLetter(ch[i])){
                sb.append(ch[i]);
            }else{
                int temp=Integer.parseInt(String.valueOf(ch[i]));
                sb.append((char)((int)(ch[i-1])+temp));
            }
        }
        return sb.toString();
    }
}