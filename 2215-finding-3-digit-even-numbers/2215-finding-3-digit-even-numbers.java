class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> set=new TreeSet<>();
        for(int i=0;i<digits.length;i++){
            if(digits[i]==0) continue;
	        for(int j=0;j<digits.length;j++){
	            for(int k=0;k<digits.length;k++){
	                if(i != j && j != k && i != k){
	                    {
	                        if((digits[i]*100+digits[j]*10+digits[k])%2==0)
                             {
                                set.add(digits[i]*100+digits[j]*10+digits[k]);
                            }
                        }
                    }}
            }}
            int result[] =new int[set.size()];
            int index=0;
            for(int num:set){
                result[index++]=num;
            }
            return result;
    }}