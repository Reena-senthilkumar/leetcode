class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int result=-1;
        int count=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getKey()%2==0){
               if(count<entry.getValue() || (count==entry.getValue() && result>entry.getKey())){
                count=entry.getValue();
                result=entry.getKey();
               }
            }
        }
        return result;
    }
}