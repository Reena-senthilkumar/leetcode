class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        // Arrays.sort(fruits);
        List<Integer> list=new LinkedList<>();
        for(int num:baskets){
            list.add(num);
        }
        // Collections.sort(list);
        int count=fruits.length;
        for(int i=0;i<fruits.length;i++){
            for(int j=0;j<list.size();j++){
                if(fruits[i]<=list.get(j)){
                    count--;
                    list.remove(j);
                    break;
                }
            }
        }
            return count++;
    }
}