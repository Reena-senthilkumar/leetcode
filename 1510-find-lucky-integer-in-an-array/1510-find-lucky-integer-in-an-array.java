class Solution {
    public int findLucky(int[] arr) {
        int op=-1;
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getKey()==entry.getValue()){
                op=entry.getValue();
            }
        }
        return op;
    }
}