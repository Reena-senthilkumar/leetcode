class Solution {
    public int countAsterisks(String s) {
        StringBuilder sb=new StringBuilder();
        int c=0;
        // if(!s.contains("|")) return 0;
        String[] sa=s.split("\\|");
        for(int i=0;i<sa.length;i=i+2){
            sb.append(sa[i]);
        }
        for(char ch:sb.toString().toCharArray()){
            if(ch=='*'){
                c++;
            }
        }
        return c;
    }
}