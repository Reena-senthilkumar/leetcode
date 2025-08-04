class Solution {
    public int largestAltitude(int[] gain) {
        int sum=0;
        int altitude=0;
        for(int i:gain){ //-5  //1 //5 //0 //-7
            sum+=i; //0+-5=-5 //-5+1=-4//-4+5=1 //1+0=1
            if(sum>0){ //1 //1
                altitude=Math.max(sum,altitude);//max(1,0)=1 //max(1,1)
            }
        }
        return altitude;
    }
}