class Solution {
    public int dayOfYear(String date) {
        int result=0;
        int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
        int month=Integer.parseInt(date.substring(5,7));
        int year=Integer.parseInt(date.substring(0,4));
        int day=Integer.parseInt(date.substring(8,10));
        for(int i=0;i<month-1;i++){
            result+=days[i];
        }
        result=result+day;
        if(((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) && month>2){
            result+=1;
        }
        return result;
    }
}