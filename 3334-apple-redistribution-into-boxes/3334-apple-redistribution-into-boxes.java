class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int sum=Arrays.stream(apple).sum();
        int c=0;
            for (int i = capacity.length - 1; i >= 0; i--) {
                if(capacity[i]<=sum || capacity[i]>=0){
                    c++;
                    sum=sum-capacity[i];
                }
                if(sum<=0) break;
        }
        return c;
    }
}