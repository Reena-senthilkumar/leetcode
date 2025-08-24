class Solution {
    public int maxFreqSum(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int vowel=0;
        int consonant=0;
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getKey()=='a' ||entry.getKey()=='e'||entry.getKey()=='i'||entry.getKey()=='o'||entry.getKey()=='u'){
                vowel=Math.max(vowel,entry.getValue());
            }
            else{
                consonant=Math.max(consonant,entry.getValue());
            }
        }
        return vowel+consonant;
    }
}