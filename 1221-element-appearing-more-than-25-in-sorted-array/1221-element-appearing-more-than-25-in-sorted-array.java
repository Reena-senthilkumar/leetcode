class Solution {
    public int findSpecialInteger(int[] arr) {
        int per=arr.length/4;
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int result=Integer.MIN_VALUE;
        int output=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(result<entry.getValue()){
                result=entry.getValue();
                output=entry.getKey();
            }
        }
        return output;
    }
}