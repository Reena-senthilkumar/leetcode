class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
           map.put(num,map.getOrDefault(num,0)+1);
        } 
        for(int num:map.values()){
            boolean temp=true;
            if(num>1){
            for(int i=2;i<num;i++){
                if(num%i==0){
                    temp=false;
                    break;
                }
            }
            if(temp) return true;
            }
        } 
        return false; 
    }
}