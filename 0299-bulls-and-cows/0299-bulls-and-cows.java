class Solution {
    public String getHint(String secret, String guess) {
        int bull=0;
        int cow=0;
        int[] freq=new int[10];
        for(int i=0;i<secret.length();i++){
            char s=secret.charAt(i);
            char g=guess.charAt(i);
            if(s==g){
                bull++;
            }
            else{
                if(freq[s-'0']<0){
                    cow++;
                }
                if(freq[g-'0']>0){
                    cow++;
                }
                freq[s-'0']++;
                freq[g-'0']--;
            }
        }
        return bull+"A"+cow+"B";
    }
}