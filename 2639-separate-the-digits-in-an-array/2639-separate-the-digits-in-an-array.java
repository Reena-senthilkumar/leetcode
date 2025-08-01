class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list=new LinkedList<>();
        int index=0;
        for(int num:nums){
           String s=Integer.toString(num);
           StringBuilder sb=new StringBuilder(s).reverse();
           for(int i=sb.length()-1;i>=0;i--){
            list.add(Character.getNumericValue(sb.charAt(i)));
           }
           sb.setLength(0);
        }
                int result[]=new int[list.size()];

        for(int n:list){
            result[index++]=n;
        }
        return result;
    }
}