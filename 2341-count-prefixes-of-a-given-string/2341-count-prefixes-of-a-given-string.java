class Solution {
    public int countPrefixes(String[] words, String s) {
        StringBuilder sb=new StringBuilder();
        int c=0;
        for(char ch:s.toCharArray()){
          sb.append(ch);
            for(String sa:words){
                if(sa.equals(sb.toString())){
                    c++;
                }
            }
        }
        return c;
    }
}