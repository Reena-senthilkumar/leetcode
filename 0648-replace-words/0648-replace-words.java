class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] sp=sentence.split(" ");
        for(int j=0;j<sp.length;j++){
            for(int i=0;i<dictionary.size();i++){
              if (sp[j].startsWith(dictionary.get(i))) {
                    sp[j]=dictionary.get(i);
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        for(String s:sp){
            sb.append(s+" ");
        }
        return sb.toString().trim();
    }
}