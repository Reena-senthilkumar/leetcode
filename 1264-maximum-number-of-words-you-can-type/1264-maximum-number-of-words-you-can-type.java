class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int c=0;
        String[] t=text.split(" ");
        for(String s:t){
            boolean temp=true;
            for(char ch:brokenLetters.toCharArray()){
                if(s.contains(String.valueOf(ch))){
                 temp=false;
                 break;
            }
            }

            if(temp){
                c++;
            }
            
        }
      
      return c;
}
}
    