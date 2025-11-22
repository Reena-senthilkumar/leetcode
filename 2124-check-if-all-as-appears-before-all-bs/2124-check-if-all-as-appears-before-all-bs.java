class Solution {
    public boolean checkString(String s) {
        if(!s.contains("b")) return true;
        int index=s.indexOf('b');
        for(int i=index+1;i<s.length();i++){
            if(s.charAt(i)=='a') return false;
        }
        return true;
    }
}