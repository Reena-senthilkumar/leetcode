class Solution {
    public String largestGoodInteger(String num) {
        int max=0;
        for(int i=2;i<num.length();i++){
            if(num.charAt(i-2)==num.charAt(i-1) && num.charAt(i-1)==num.charAt(i)){
                max=Math.max(Character.getNumericValue(num.charAt(i)),max);
            }
        }
        if(num.contains(String.valueOf(max).repeat(3))){
        return String.valueOf(max).repeat(3);
        }
        return "";
    }
}