class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character,Integer> map=new HashMap<>();
        String balloon="balloon";
        for(char ch:text.toCharArray()){
            if(balloon.contains(String.valueOf(ch))){
            map.put(ch,map.getOrDefault(ch,0)+1);
            }
        }
         int b = map.getOrDefault('b', 0);
        int a = map.getOrDefault('a', 0);
        int l = map.getOrDefault('l', 0) / 2;  // because we need 2 l's
        int o = map.getOrDefault('o', 0) / 2;  // because we need 2 o's
        int n = map.getOrDefault('n', 0);
        
        return Math.min(Math.min(Math.min(b, a), l), Math.min(o, n));
    }
}