class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        StringBuilder sb=new StringBuilder(magazine);
        for(int i=0;i<ransomNote.length();i++){
          if(!sb.toString().contains(String.valueOf(ransomNote.charAt(i))))
          {
            return false;
          }
          else{
            int index=sb.indexOf(String.valueOf(ransomNote.charAt(i)));
            sb.deleteCharAt(index);
          }
        }
        return true;
    }
}