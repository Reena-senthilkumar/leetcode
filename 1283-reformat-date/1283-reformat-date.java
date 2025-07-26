class Solution {
    public String reformatDate(String date) {

        String[] sa=date.split(" ");
        String[] month={"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        StringBuilder sb=new StringBuilder();
        sb.append(sa[sa.length-1]+"-");
        for(int i=0;i<month.length;i++){
            if(sa[1].equals(month[i])){
                if(String.valueOf(i+1).length()==2){
                sb.append(String.valueOf(i+1)+"-");
                }else{
                sb.append("0"+String.valueOf(i+1)+"-");

                }
            }
        }
        if(sa[0].length()==4){
        sb.append(sa[0].substring(0,sa[0].length()-2));
        }else{
                    sb.append("0"+sa[0].substring(0,sa[0].length()-2));

        }
return sb.toString();
    }
}