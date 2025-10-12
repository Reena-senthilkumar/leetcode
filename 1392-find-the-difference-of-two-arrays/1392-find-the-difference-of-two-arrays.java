class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result=new LinkedList<>();
        List<Integer> list=new LinkedList<>();
        for(int i=0;i<nums1.length;i++){
            boolean temp=false;
            for(int j=0;j<nums2.length;j++){
                 if(nums1[i]==nums2[j]){
                    temp=true;
                    break;
                 }
            }
            if(!temp && !list.contains(nums1[i])){
                list.add(nums1[i]);
            }
        }
        result.add(list);
        List<Integer> list1=new LinkedList<>();
        for(int i=0;i<nums2.length;i++){
            boolean temp=false;
            for(int j=0;j<nums1.length;j++){
                 if(nums2[i]==nums1[j]){
                    temp=true;
                    break;
                 }
            }
            if(!temp && !list1.contains(nums2[i])){
                list1.add(nums2[i]);
            }
        }
        result.add(list1);
        return result;
    }
}