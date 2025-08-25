class Solution {
    public String generateTag(String caption) {
        if(caption.trim().isEmpty()) return "#";

        String[] arr=caption.trim().split(" ");
        StringBuilder tag=new StringBuilder("#");
          int len = 1;
        for (char c : arr[0].toCharArray()) {
            if (Character.isLetter(c) && len < 100) {
                tag.append(Character.toLowerCase(c));
                len++;
            }
        }
        for(int i=1;i<arr.length;i++){
            char ch[]=arr[i].toCharArray();
            for(int j=0;j<ch.length;j++){
                if(Character.isLetter(ch[j]) && len<100){
                if(j==0){
                    tag.append(String.valueOf(ch[j]).toUpperCase()); 
                      len++;
                }
                else{
                    tag.append(String.valueOf(ch[j]).toLowerCase());
                      len++;
                }
            }
        }
        }
        return tag.length()<100 ? tag.toString() : tag.substring(0,100).toString();
}
}