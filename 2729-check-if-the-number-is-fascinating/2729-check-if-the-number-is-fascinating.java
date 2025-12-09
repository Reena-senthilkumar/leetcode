class Solution {
    public boolean isFascinating(int n) {
        String s=n+""+(n*2)+""+(n*3);
        if(s.length()!=9) return false;
        for(int i=1;i<=9;i++){
            if(!s.contains(i+"")){
                return false;
            }
        }
        return true;
    }
}