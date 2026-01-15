class Solution {
    public int countSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            StringBuilder sb=new StringBuilder();
            for(int j=i;j<s.length();j++){
                sb.append(s.charAt(j));
                StringBuilder temp=new StringBuilder(sb);
                if(sb.toString().equals(temp.reverse().toString())){
                    count++;
                }
            }
        }
        return count;
    }
}