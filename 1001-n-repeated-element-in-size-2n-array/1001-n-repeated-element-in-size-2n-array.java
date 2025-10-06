class Solution {
    public int repeatedNTimes(int[] nums) {
      Map<Integer,Integer> map=new HashMap<>();
      for(int n:nums){
        map.put(n,map.getOrDefault(n,0)+1);
      }
      int result=0;
      for(Map.Entry<Integer,Integer> entry:map.entrySet()){
        if(entry.getValue()!=1){
            result=entry.getKey();
        }
      }
      return result;
    }
}