class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int sum=Arrays.stream(apple).sum();
        int c=0;
            for (int i = capacity.length - 1; i >= 0; i--) {
                    sum=sum-capacity[i]; c++;
                if(sum<=0) break;
        }
        return c;
    }
}