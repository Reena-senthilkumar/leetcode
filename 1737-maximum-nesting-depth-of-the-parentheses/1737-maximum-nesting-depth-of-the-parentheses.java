class Solution {
    public int maxDepth(String s) {
        int result=0;
        int bracket=0;
        for(char ch:s.toCharArray()){
                if(ch=='('){
                    bracket++;
                    if(result<bracket)
                        result=bracket;
                }
                else if(ch==')'){
                    bracket--;
                }

            }
        return result;
    }
    }