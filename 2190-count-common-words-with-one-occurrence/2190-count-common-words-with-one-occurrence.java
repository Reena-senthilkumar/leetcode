class Solution {
    public int countWords(String[] words1, String[] words2) {
        int count=0;
        Map<String,Integer> map1=new HashMap<>();
        Map<String,Integer> map2=new HashMap<>();
        for(String s:words1){
            map1.put(s,map1.getOrDefault(s,0)+1);
        }
        for(String s:words2){
            map2.put(s,map2.getOrDefault(s,0)+1);
        }
        for(Map.Entry<String,Integer> i:map1.entrySet()){
            for(Map.Entry<String,Integer> j:map2.entrySet()){
                if(i.getKey().equals(j.getKey())){
                    if(i.getValue()==1 && j.getValue()==1){
                    count++;
                    }
                }
            }
        }
        return count;
    }
}