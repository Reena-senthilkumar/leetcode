class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int count=0;
        int index=1;
        for(int i=citations.length-1;i>=0;i--){
            if(citations[i]>=index){
                count++;
                index++;
            }
            else{
                break;
            }
        }
        return count;
    }
}