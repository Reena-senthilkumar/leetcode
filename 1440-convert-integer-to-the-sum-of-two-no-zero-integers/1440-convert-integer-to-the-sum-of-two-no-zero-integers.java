class Solution {
    public int[] getNoZeroIntegers(int n) {
        int result[]=new int[2];
        int a=n-1; 
            int b=n-a; 
        while(a!=0 && b!=0){
            if(String.valueOf(a).contains("0") || String.valueOf(b).contains("0")){
                a--; //9
                b++; //2
            }else{
                 result[0]=a;
            result[1]=b;
                break;
            }
           
        }
        return result;
    }
}