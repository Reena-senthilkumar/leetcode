class Solution {
    public String removeDuplicates(String s, int k) {

        // Stack stores: character + its consecutive count
        Stack<int[]> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            // if same as previous character
            if (!stack.isEmpty() && stack.peek()[0] == c) {
                stack.peek()[1]++;

                // if count reaches k → remove
                if (stack.peek()[1] == k) {
                    stack.pop();
                }
            } 
            else {
                // new character starts with count = 1
                stack.push(new int[]{c, 1});
            }
        }

        // build answer
        StringBuilder sb = new StringBuilder();
        for (int[] pair : stack) {
            sb.append(String.valueOf((char) pair[0]).repeat(pair[1]));
        }

        return sb.toString();
    }
}
