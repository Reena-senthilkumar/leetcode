class Solution {
    public int maxDifference(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int even=Integer.MAX_VALUE;
        int odd=Integer.MIN_VALUE;
        for(int num:map.values()){
            if(num%2==0){
                even=Math.min(even,num);
            }
            else{
                odd=Math.max(odd,num);
            }
        }
        return odd-even;
    }
}