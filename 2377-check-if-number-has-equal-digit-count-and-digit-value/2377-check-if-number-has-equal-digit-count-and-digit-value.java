class Solution {
    public boolean digitCount(String num) {
        Map<Integer,Integer> map=new HashMap<>();
        for(char ch:num.toCharArray()){
            map.put(Character.getNumericValue(ch),map.getOrDefault(Character.getNumericValue(ch),0)+1);
        }
        for(int i=0;i<num.length();i++){
            if (Character.getNumericValue(num.charAt(i)) != map.getOrDefault(i,0)) {
                return false;
            }
        }
        return true;
    }
}