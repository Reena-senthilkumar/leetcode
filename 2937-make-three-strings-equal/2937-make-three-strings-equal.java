class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {

        int result=0;
        for(int i=0;i<Math.min(s1.length(), Math.min(s2.length(), s3.length()));i++)        {
            if(s1.charAt(i)==s2.charAt(i) && s1.charAt(i)==s3.charAt(i)){
                result++;
            }else{
            break;
            }
        }
        return result!=0 ? (s1.length()-result)+(s2.length()-result)+(s3.length()-result) : -1;
    }
}