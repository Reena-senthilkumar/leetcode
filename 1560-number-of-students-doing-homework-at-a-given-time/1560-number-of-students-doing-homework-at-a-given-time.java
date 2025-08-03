class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int student=0;
        int index=0;
        while(index!=startTime.length){
        for(int i=startTime[index];i<=endTime[index];i++){
            if(i==queryTime){
                student++;
            }
        }
        index++;
        }
        return student;
    }
}