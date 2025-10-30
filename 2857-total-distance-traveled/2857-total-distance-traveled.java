class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
    int d=0;
            while (mainTank >= 5) {
            d+= 50;
            mainTank-= 5;
            if (additionalTank> 0) {
                mainTank++;
                additionalTank--;
            }     
        }
        d+=mainTank*10;
        return d;
    }
}