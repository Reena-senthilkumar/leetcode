class Solution {
    public int secondHighest(String s) {
        Set<Integer> set=new HashSet<>();
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                set.add(ch-'0');
            }
        }
        List<Integer> list=new ArrayList<>(set);
        Collections.sort(list);
        return list.size()<=1 ? -1 :list.get(list.size()-2);
    }
}