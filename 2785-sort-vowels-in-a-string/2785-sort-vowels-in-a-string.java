class Solution {
    public String sortVowels(String s) {
        int[] freq=new int[10];
for (char c : s.toCharArray()) {
    if (c == 'A') freq[0]++;
    else if (c == 'E') freq[1]++;
    else if (c == 'I') freq[2]++;
    else if (c == 'O') freq[3]++;
    else if (c == 'U') freq[4]++;
    else if (c == 'a') freq[5]++;
    else if (c == 'e') freq[6]++;
    else if (c == 'i') freq[7]++;
    else if (c == 'o') freq[8]++;
    else if (c == 'u') freq[9]++;
}
        int i=0;
char[] vowels = {'A','E','I','O','U','a','e','i','o','u'};
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if("aeiouAEIOU".indexOf(c)!=-1){
                while(i<10 && freq[i]==0) i++;
                sb.append(vowels[i]);
                freq[i]--;
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}