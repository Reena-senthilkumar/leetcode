class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> list=new LinkedList<>();
        for(String s:words){
            String[] temp=s.split("\\"+separator);
            for(String sa:temp){
                if(!sa.isEmpty()){
            list.add(sa);
                }
            }
        }
        return list;
    }
}