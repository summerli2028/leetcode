class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        int switchVal = nums[0];
        int switchIndex = 0;
        int start = 0;

        
        for (int i = 0; i < len; i++) {
            if(k==0){
                break;
            }
            switchIndex = (switchIndex + k) % len;
            int temp = nums[switchIndex];
            nums[switchIndex] = switchVal;
            switchVal = temp;
            
            // If we complete a cycle, move to the next starting position
            if (switchIndex == start) {
                start++;
                switchIndex = start;
                switchVal = nums[start];
            }
        }
    }
}

