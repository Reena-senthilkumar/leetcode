class Solution {
    public boolean isSubstringPresent(String s) {
        StringBuilder sb=new StringBuilder(s).reverse();
        for(int i=2;i<s.length()+1;i++){
            if(sb.toString().contains(s.substring(i-2,i))){
                return true;
            }
        }
        return false;
    }
}