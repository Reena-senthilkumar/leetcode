class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int temp[]=new int[map.size()];
        int index=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
                temp[index++]=entry.getValue();
        }
        Arrays.sort(temp);
        int result=temp[temp.length-1];
        int sum=0;
        for(int i=temp.length-1;i>=0;i--){
            if(temp[i]==result)
              sum+=temp[i];
        }
        return sum;
    }
}
