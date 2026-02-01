class Solution {
    public int countMonobit(int n) {
        String[] arr=new String[n+1];
        int count=0;
        for(int i=0;i<=n;i++){
            arr[i]=Integer.toBinaryString(i);
            if(arr[i].length()==1){
                count++;
            }
            else{
                Set<Character> set=new HashSet<>();
                for(char ch:arr[i].toCharArray()){
                    set.add(ch);
                }
                if(set.size()==1){
                    count++;
                }
            }
        }
        return count;
    }
}©leetcode
