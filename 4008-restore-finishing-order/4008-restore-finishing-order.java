class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] result=new int[friends.length];
        int index=0;
        for(int i=0;i<order.length;i++){
            for(int j=0;j<friends.length;j++){
                if(order[i]==friends[j]){
                    result[index++]=order[i];
                }
            }
        }
        return result;
    }
}