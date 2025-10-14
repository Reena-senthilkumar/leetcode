class Solution {
    public int similarPairs(String[] words) {
        int result=0;
        for(int i=0;i<words.length;i++){
            Set<Character> set1=new HashSet<>();
            for(char ch:words[i].toCharArray()){
                set1.add(ch);
            }
            for(int j=i+1;j<words.length;j++){
                Set<Character> set2=new HashSet<>();
                for(char ch:words[j].toCharArray()){
                    set2.add(ch);
                }
                if(set1.equals(set2)){
                    result++;
                }
            }
        }
        return result;
    }
}