class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int size=nums.length/2;
        boolean con1=true;
        for(int num:map.values()){
            if(num%2!=0){
                con1=false;
                break;
            }
        }
        return con1;
    }
}