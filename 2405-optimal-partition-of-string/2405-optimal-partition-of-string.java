class Solution {
    public int partitionString(String s) {
        int count=1;
       for(int i=0;i<s.length();i++){
             StringBuilder sb=new StringBuilder();
        for(int j=i;j<s.length();j++){
            if(sb.toString().contains((s.charAt(j)+""))){
            System.out.print(sb.toString()+" ");
            count++;
            break;
        }
        else{
        sb.append(s.charAt(j)+"");
        }
        i=j;
        }
       }
       return count;
    }
}