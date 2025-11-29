class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int result[][]=new int[image.length][image.length];
        for(int[] arr:image){
            int i=0;
            int j=arr.length-1;
            while(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image.length;j++){
                if(image[i][j]==1){
                    result[i][j]=0;
                }
                else{
                    result[i][j]=1;
                }
            }
        }
        return result;
    }
}