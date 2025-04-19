class Solution {
    public int countKeyChanges(String s) {
        int c=0;
        char[] ch=s.toLowerCase().toCharArray();
        for(int i=0;i<ch.length-1;i++){
            if(ch[i]!=ch[i+1]){
                c++;
            }
        }
        return c;
    }
}
