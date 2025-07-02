class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int sum1=0;
        for(int i=0;i<firstWord.length();i++){
            sum1=(sum1 *10)+ ((int)firstWord.charAt(i) -97) ;
        }
        int sum2=0;
        for(int i=0;i<secondWord.length();i++){
            sum2=(sum2 *10)+ ((int)secondWord.charAt(i) -97) ;
        }
        int sum3=0;
        for(int i=0;i<targetWord.length();i++){
            sum3=(sum3 *10)+ ((int)targetWord.charAt(i) -97) ;
        }
        return (sum1+sum2)==sum3;
    }
}