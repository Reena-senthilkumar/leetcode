class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int max=Integer.MIN_VALUE;
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
            max=Math.max(max,map.get(num));
        }
        List<Integer> list=new ArrayList<>();
        for(int num:nums) list.add(num);
        int temp=0;
        int result=Integer.MAX_VALUE;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
        if(entry.getValue()==max){
            temp=entry.getKey();
        int f=list.indexOf(temp);
        int l=list.lastIndexOf(temp);
        result=Math.min(result,l-f+1);
        }
    }
    return result;
    }
}