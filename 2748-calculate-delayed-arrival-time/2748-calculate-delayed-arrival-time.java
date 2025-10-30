class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        if(arrivalTime + delayedTime <24  ) return arrivalTime+delayedTime;
        if(arrivalTime + delayedTime >24) return (arrivalTime+delayedTime)%24;
        return 0;
    }
}