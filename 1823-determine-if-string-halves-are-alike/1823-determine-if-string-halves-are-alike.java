class Solution {
    public boolean halvesAreAlike(String s) {
        String s1=s.substring(0,s.length()/2);
        String s2=s.substring(s.length()/2,s.length());
        int c1=0;
        int c2=0;
        for(char ch:s1.toLowerCase().toCharArray()){
            if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' || ch=='u' ){
                c1++;
            }
        }
        for(char ch:s2.toLowerCase().toCharArray()){
            if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' || ch=='u' ){
                c2++;
            }
        }
        return c1==c2;
    }
}