class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] temp={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set=new HashSet<>();

        for(String s:words){
            StringBuilder sb=new StringBuilder();
            for(char ch:s.toCharArray()){
                sb.append(temp[ch-'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}