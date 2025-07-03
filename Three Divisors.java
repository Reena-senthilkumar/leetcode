class Solution {
    public boolean isThree(int n) {
        int c=0;
        if(n<=3) return false;
        
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c++;
                            }
        }
        return c==3;
    }
}
