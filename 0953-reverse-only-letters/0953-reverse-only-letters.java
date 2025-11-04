class Solution {
    public String reverseOnlyLetters(String s) {
        int i=0;
        int j=s.length()-1;
        char ch[]=s.toCharArray();
        while(i<j){
          if(!Character.isLetter(ch[i])){
            i++;
          }
          else if(!Character.isLetter(ch[j])){
            j--;
          }
        //   else if(Character.isLetter(ch[j]) && Character.isLetter(ch[i])){
            else{
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
          }
        }
        return new String(ch);
    }
}