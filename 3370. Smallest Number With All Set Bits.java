class Solution {
    public int smallestNumber(int n) {
        int result=0;
        while(result==0){
            String s=Integer.toBinaryString(n);
            Set<Character> set=new HashSet<>();
            for(char ch:s.toCharArray()){
                set.add(ch);
            }
            if(set.size()==1){
            result=Integer.parseInt(s,2); break;}
            else{
                n=n+1;
                set.clear();
            }
        }
        return result;
    }
}
