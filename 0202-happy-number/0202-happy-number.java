class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        
        while (n != 1 && !seen.contains(n)) { // 82!=1 && != 82 1=1
            seen.add(n);  //19 //82//1`00
            int sum = 0; 
            while (n != 0) { 
                int rem = n % 10; //9 //2 //0 0 1
                sum += rem * rem;//81 //1
                n /= 10; //1 
            }
            n = sum; //n=82 //1
        }
        
        return n == 1;
    }
}
