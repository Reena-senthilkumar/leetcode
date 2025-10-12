class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int result=-1;
        for(int i=0;i<s.length()-1;i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    result=Math.max(result,Math.abs(j-i-1));
                }
            }
        }
        return result;
    }
}