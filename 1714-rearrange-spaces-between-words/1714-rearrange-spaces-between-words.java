class Solution {
    public String reorderSpaces(String text) {
        String[] words=text.trim().split("\\s+");
        int spaceCount=0;
        for(char ch:text.toCharArray()){
            if(ch==' ') spaceCount++;
        }
        if (words.length == 1) {
            return words[0] + " ".repeat(spaceCount);
        }

        int evenSpace=spaceCount/(words.length-1) ;
        int remainingSpace = spaceCount % (words.length - 1);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            sb.append(words[i]);
            if (i != words.length - 1) {
                sb.append(" ".repeat(evenSpace));
            }
        }
        sb.append(" ".repeat(remainingSpace));
        return sb.toString();
    }
}