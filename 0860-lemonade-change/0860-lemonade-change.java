class Solution {
    public boolean lemonadeChange(int[] bills) {
        int ten=0;
        int five=0;
         for(int n:bills){
            if(n==5){
                five++;
            }
            else if(n==10){
                if(five==0) return false;
                ten++;
                five--;
            }
            else{
                if(five>0 &&ten>0) 
                {
                    five--; 
                    ten--;
                }
                else if(five>=3)
                { five-=3;
                }
                else{
                    return false;
                }
               
            }
         }
        return true;
    }
}