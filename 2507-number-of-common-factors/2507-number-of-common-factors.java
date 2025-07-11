class Solution {
    public int commonFactors(int a, int b) {
        List <Integer> l1=new LinkedList<>();
        List <Integer> l2=new LinkedList<>();
        for(int i=1;i<=a;i++){
          if(a%i==0){
            l1.add(i);
          }
        }
        for(int i=1;i<=b;i++){
          if(b%i==0){
            l2.add(i);
          }
        }
        int count=0;
        for(int i:l1){
            for(int j=0;j<l2.size();j++){
                if(i==l2.get(j)){
                    count++;
                }
            }
        }
        return count;
    }
}