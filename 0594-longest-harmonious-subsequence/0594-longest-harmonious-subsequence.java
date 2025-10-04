class Solution {
    public int findLHS(int[] nums) {
        Map<Integer,Integer> map=new TreeMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int har=0;
        for(int i:map.keySet()){
            if(map.containsKey(i+1)){
                har=Math.max(har,(map.get(i)+map.get(i+1)));
            }
        }
        return har;
    }
}