class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        Map<Integer,Integer> m=new HashMap<>();
        for(int num:nums){
            m.put(num,m.getOrDefault(num,0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
                    if( entry.getValue() ==1){
                        sum+=entry.getKey();
                    }
}
return sum;
    }
}