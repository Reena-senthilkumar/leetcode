class Solution {
    public String reverseVowels(String s) {
        int i=0,j=s.length()-1;
        char[] ch=s.toCharArray();
        String vowels="aeiouAEIOU";
        while(i<j){
            if(!vowels.contains(String.valueOf(ch[i]))){
                i++;
            }
            else if(!vowels.contains(String.valueOf(ch[j]))){
                j--;
            }
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