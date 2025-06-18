class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder sb=new StringBuilder();
        String[] sa=s.split(" ");
        for(int i=0;i<k;i++){
            if(i!=k-1){
            sb.append(sa[i]+" ");
            }
            else{
                sb.append(sa[i]);
            }
        }
        return sb.toString();
    }
}