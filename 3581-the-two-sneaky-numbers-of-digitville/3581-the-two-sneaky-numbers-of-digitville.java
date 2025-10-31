class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int result[]=new int[2];
        int index=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==2) result[index++]=entry.getKey();
        }
        return result;
    }
}