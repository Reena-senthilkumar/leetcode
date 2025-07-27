class Solution {
    public int minimumSum(int num) {
        int i=0;
        int arr[]=new int[4];
        while(num!=0){
            arr[i++]=num%10;
            num=num/10;
        }
        Arrays.sort(arr);
        int a=(arr[0]*10)+arr[2];
        int b=(arr[1]*10)+arr[3];
        return a+b;
    }}