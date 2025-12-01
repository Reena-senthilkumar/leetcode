class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> result=new LinkedList<>();
        Map<String,Integer> map=new HashMap<>();
        for(String s:words){
            map.put(s,map.getOrDefault(s,0)+1);
        }
         PriorityQueue<Map.Entry<String, Integer>> pq =
                new PriorityQueue<>((a, b) -> {
                    int f=b.getValue()-a.getValue();
                    if(f==0){
                        return a.getKey().compareTo(b.getKey());
                    }
                    return f;
                }
                    );
        pq.addAll(map.entrySet());
        for(int i=0;i<k;i++){
            Map.Entry<String,Integer> entry=pq.poll();
            result.add(entry.getKey());
        }
        return result;
    }
}