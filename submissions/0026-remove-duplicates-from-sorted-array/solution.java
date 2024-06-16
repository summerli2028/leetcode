class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> duplicates = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                if(nums[i]==nums[j] && i!=j && nums[i]!=101){
                    nums[j]=101;
                }
            }
        }
        int k=0;
            for(int element: nums){
                if(element != 101){
                    nums[k++] = element;
                }
            }
        return k;
    }
}
