class Solution {
    public void duplicateZeros(int[] arr) {
        int index = 0;
        int[] result = new int[arr.length];
        
        for (int i = 0; i < arr.length && index < arr.length; i++) {
            if (arr[i] != 0) {
                result[index++] = arr[i];
            } else {
                result[index++] = 0;
                if (index < arr.length) { // avoid overflow
                    result[index++] = 0;
                }
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = result[i];
        }
    }
}
