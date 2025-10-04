class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int temp=Integer.MAX_VALUE;
        List<String> l=new LinkedList<>();
        for(int i=0;i<list1.length;i++){
            for(int j=0;j<list2.length;j++){
                if(list1[i].equals(list2[j])){
                if(temp>i+j ){
                   temp=i+j;
                   l.clear();
                   l.add(list1[i]);
                }
                else if(temp==i+j){
                    l.add(list1[i]);
                }
                }
            }
        }
        String result[] =new String[l.size()];
        int inx=0;
        for(String s:l){
            result[inx++]=s;
        }
        return result;
    }
}