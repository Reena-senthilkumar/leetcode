class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list=new LinkedList<>();
        for(int i:candies){//2
        boolean re=true;
            for(int j=0;j<candies.length;j++){
            if(i+extraCandies < candies[j]){
                re=false;
                break;
            }}

            if(!re){
                list.add(false);
            }
            else{
                list.add(true);
            }
        }
        return list;
    }
}