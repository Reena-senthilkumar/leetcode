class Solution {
    public boolean checkOnesSegment(String s) {
        boolean foundZero = false;
    for (char c : s.toCharArray()) {
        if (c == '1') {
            if (foundZero) {
                return false;
            }
        } else {
            foundZero = true;
        }
    }
    return true;
}
}