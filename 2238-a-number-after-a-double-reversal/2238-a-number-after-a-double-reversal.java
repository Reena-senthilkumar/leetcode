class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num==0) return true;
         return num%10!=0;
        
    }}
//        String temp=String.valueOf(num);
//        StringBuilder sb=new StringBuilder();
//        for(char ch:temp.toCharArray()){
//         if(ch!='0'){
//             sb.append(ch);
//         }
//        }
//        return Integer.parseInt(sb.toString())==num;
//     }
// }