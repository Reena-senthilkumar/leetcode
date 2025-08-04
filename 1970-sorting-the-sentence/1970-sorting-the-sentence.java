class Solution {
    public String sortSentence(String s) {
        String[] ch=s.split(" ");
        int temp[]=new int[ch.length];
        int i=0;
        for(String sa:ch){
            temp[i++]=Character.getNumericValue(sa.charAt(sa.length()-1));
        }
        Arrays.sort(temp);
        StringBuilder sb=new StringBuilder();
        for(int num:temp){
            for(String c:ch){
                if(c.contains(String.valueOf(num))){
                    if(num!=ch.length){
                    sb.append(c.substring(0,c.length()-1)+" ");
                    }
                    else{
                        sb.append(c.substring(0,c.length()-1));
                    }
                }
            }
        }
        return sb.toString();
    }
}