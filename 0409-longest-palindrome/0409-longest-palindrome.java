class Solution {
    public int longestPalindrome(String s) {
        if (s.length()==1) return 1;
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int longestpalindrome=0;
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()%2==0){
                longestpalindrome+=entry.getValue();
            }
            else if(entry.getValue()!=1 && entry.getValue()%2!=0){
              longestpalindrome+=(entry.getValue()-1);
              map.put(entry.getKey(),1);
            }
        }
        return map.containsValue(1) ?  longestpalindrome+1: longestpalindrome;
    }
}