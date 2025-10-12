class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int size=grid.length*grid.length;
        int sum=0;
        for(int i=1;i<=size;i++){
            sum+=i;
        }

         Map<Integer,Integer> map=new HashMap<>();
        int result[] =new int[2];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                 map.put(grid[i][j],map.getOrDefault(grid[i][j],0)+1);
            }
        }
        int sum1=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==2){
                result[0]=entry.getKey();
            }
            sum1+=entry.getKey();
        }
        result[1]=sum-sum1;
        return result;
    }
}