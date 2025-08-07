class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        boolean result=true;
        String[] stringarray=sentence.split(" ");
        for(int i=0;i<stringarray.length;i++){
            String temp=stringarray[i];
            if(temp.contains(searchWord)){
                if(searchWord.equals(temp.substring(0,searchWord.length()))){
                    return i+1;
                }
            }
        }
        return -1;
    }
}