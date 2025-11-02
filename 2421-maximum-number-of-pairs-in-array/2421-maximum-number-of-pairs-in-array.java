class Solution {
    public int[] numberOfPairs(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int pairs=0;
        int lo=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            lo+=entry.getValue()%2;
            pairs+=entry.getValue()/2;
        }
        return new int[]{pairs,lo};
    }
}