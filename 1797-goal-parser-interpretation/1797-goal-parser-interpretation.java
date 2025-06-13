class Solution {
    public String interpret(String command) {
        return command.replace("(al)","al").replace("()","o");
        
    }
}