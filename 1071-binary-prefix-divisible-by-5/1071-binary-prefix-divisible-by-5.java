class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> answer = new ArrayList<>();
        int num = 0;
        for (int b : nums) {
            num = (num * 2 + b) % 5;  
            answer.add(num == 0);
        }
        return answer;
    }
}