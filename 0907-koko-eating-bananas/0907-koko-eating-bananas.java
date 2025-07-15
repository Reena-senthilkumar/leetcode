class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int minSpeed=1;
        int maxSpeed=getLargest(piles);
        while(minSpeed<=maxSpeed){
            int midSpeed=(minSpeed+maxSpeed)/2;
            long duration =getEntireDuration(piles,midSpeed);
            if(duration<=h){
                maxSpeed=midSpeed-1;
            }else{
                minSpeed=midSpeed+1;
            }
        }return minSpeed;
    }
    private long getEntireDuration(int[] piles,int speed){
        long sum=0;
for(int bananas:piles)
{
        sum+=getDuration(bananas,speed);
       }
       return sum;
    }private int getDuration(int bananas,int speed){
        int hours=bananas/speed;
        if(bananas%speed>0)
        {
            hours+=1;
        }return hours;
       
    }
    private int getLargest(int[] piles){
        int largest=piles[0];
        for(int bananas:piles){
                largest=Math.max(largest,bananas);
        }return largest;
    }
}