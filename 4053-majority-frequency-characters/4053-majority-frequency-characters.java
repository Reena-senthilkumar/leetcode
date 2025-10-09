class Solution {
    public String majorityFrequencyGroup(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        } //count

        Map<Integer,Integer> temp=new HashMap<>();
        for(int num:map.values()){
            temp.put(num,temp.getOrDefault(num,0)+1);            
        }
        // key count

        int max=0;
        int t=0;
        for(Map.Entry<Integer,Integer> entry:temp.entrySet()){
            if(entry.getValue() > max || (entry.getValue() == max && entry.getKey() > t)){
                max=entry.getValue();
                t=entry.getKey();
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char c:map.keySet()){
            if(map.get(c)==t ){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}