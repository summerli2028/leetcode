class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] value = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<i; j++){
                if(nums[i]+nums[j]==target){
                    value[0]=i;
                    value[1]=j;
                    return value;
                }
            }
        }
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
            if(nums[i]+nums[j]==target){
                    value[0]=i;
                    value[1]=j;
                    return value;
                }
            }
        }
        return null;
    }
}
