class Solution {
    public boolean checkDistances(String s, int[] distance) {
        for(int i=0;i<distance.length;i++){
            int[] temp=new int[2];
                int index=0;
                char ch =(char)('a'+i);
                if(!s.contains(String.valueOf(ch))) 
                {
                    continue;
                }
                else{
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==ch){
                    temp[index++]=j;
                }
            }
            if(temp[1]-temp[0]-1!=distance[i]){
                return false;
            }
                }
        }
        return true;
    }
}