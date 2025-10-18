class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> list=new LinkedList<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                for(int k=0;k<nums3.length;k++){
                    if(nums1[i]==nums2[j] || nums1[i]==nums3[k]){
                        if(!list.contains(nums1[i])) list.add(nums1[i]);
                    }
                    else if(nums2[j]==nums3[k]){
                        if(!list.contains(nums2[j]))
                        list.add(nums2[j]);
                    }
                }
            }
        }
        return list;
    }
}