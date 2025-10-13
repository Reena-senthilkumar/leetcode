class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new LinkedList<>();
        for(int i=left;i<=right;i++){
            int num=i;
            boolean temp=true;
            while(num!=0){
                int rem=num%10;
                if( rem==0 || i%rem != 0){
                    temp=false;
                    break;
                }
                num=num/10;
            }
            if(temp) list.add(i);
        }
        return list;
    }
}