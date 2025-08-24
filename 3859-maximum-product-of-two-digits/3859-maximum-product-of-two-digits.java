class Solution {
    public int maxProduct(int n) {
        String temp=Integer.toString(n);
        int[] arr=new int[temp.length()];
        int i=0;
        for(char ch:temp.toCharArray()){
            arr[i++]=ch-'0';
        }
        int result=0;
        for(int j=0;j<arr.length;j++){
            for(int k=j+1;k<arr.length;k++){
            result=Math.max(result,arr[j]*arr[k]);
            }
        }
        return result;
    }
}