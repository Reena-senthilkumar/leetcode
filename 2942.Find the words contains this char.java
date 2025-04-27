class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list=new LinkedList<>();
        for(int i=0;i<words.length;i++){
            if(words[i].indexOf(x)!=-1){
                list.add(i);
            }
        }
        return list;
    }
}