class Solution {
    public String removeStars(String s) {
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch!='*'){
            stack.push(ch);
            }
            else if(ch=='*'){
                stack.pop();
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char ch:stack){
            sb.append(ch);
        }
        return sb.toString();
    }
}