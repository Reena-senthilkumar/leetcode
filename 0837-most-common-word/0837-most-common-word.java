class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> map = new HashMap<>();
String[] temp = paragraph.split("[,.?:;'!\\s]+");

for (String s : temp) {
    boolean t = true;
    s=s.trim().toLowerCase();
    // check if word is banned
    for (int i = 0; i < banned.length; i++) {
        if (s.equalsIgnoreCase(banned[i])) {
            t = false;
            break;
        }
    }

    if (t) {
        s = s.replaceAll("[^a-zA-Z]", "");

        if (!s.isEmpty()) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
    }
}

    int result=Integer.MIN_VALUE;
    String output="";
    if (map.isEmpty()) return null;
    for(String s:map.keySet()){
        if(result<map.get(s)){
        result=map.get(s);  
        output=s;
        }
    }
    return output;
}
}