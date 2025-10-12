class Solution {
    public int getLeastFrequentDigit(int n) {
        Map<Integer,Integer> map=new HashMap<>();
        while(n!=0)
        {
           int rem=n%10;
           map.put(rem,map.getOrDefault(rem,0)+1);
           n=n/10;
        }
        
        int min=Integer.MAX_VALUE;
        int result=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
if(min> entry.getValue() || (min== entry.getValue() &&min<entry.getValue() )){                result=entry.getKey();
                min=entry.getValue();
            }
        }
        return result;
    }
}