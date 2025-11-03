class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>((a,b) -> b.getValue()-a.getValue());
        pq.addAll(map.entrySet());
        List<Integer> list=new LinkedList<>();
        for(int i=0;i<k;i++){
            Map.Entry<Integer,Integer> entry=pq.poll();
            list.add(entry.getKey());
        }
        int result[] =new int[list.size()]; int index=0;
        for(int n:list){
            result[index++]=n;
        }
        return result;
    }
}