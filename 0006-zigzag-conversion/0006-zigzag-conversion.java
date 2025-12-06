class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        List<StringBuilder> list=new LinkedList<>();
        for(int i=0;i<numRows;i++){
            list.add(new StringBuilder());
        }
        boolean row=false;
        int temp=0;
        for(char c:s.toCharArray()){
            list.get(temp).append(c);
             if(temp==0 || temp==numRows-1){
                row=!row;
            }
            temp+=row ? 1: -1;
        }
        StringBuilder sb=new StringBuilder();
        for(StringBuilder b:list){
            sb.append(b);
        }
        return sb.toString();
    }
}