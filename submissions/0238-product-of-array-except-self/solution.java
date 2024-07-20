class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeroCount = 0;
        int product = 1;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]==0){
                zeroCount++;
            }else{
                product*=nums[i];
            }
        }
        if(zeroCount == nums.length){
            product = 0;
        }
        if(zeroCount>=2){
            for(int j = 0; j<nums.length; j++){
                nums[j]= 0;
            }
            return nums;
        }
        if(zeroCount==1){
            for(int k = 0; k<nums.length; k++){
                if(nums[k]==0){
                    nums[k]=product;
                }else{
                    nums[k]=0;
                }
            }
            return nums;
        }
        for(int l = 0; l<nums.length; l++){
            nums[l]= (int)(product*1.0/nums[l]);
        }
        return nums;

        
    }
}
