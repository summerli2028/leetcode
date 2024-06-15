class Solution {
    public int removeElement(int[] nums, int val) {
        int writePointer = 0; // Pointer to track the position to write to

        // Iterate over the array
        for (int readPointer = 0; readPointer < nums.length; readPointer++) {
            if (nums[readPointer] != val) {
                // If the current element is not val, write it to the writePointer index
                nums[writePointer] = nums[readPointer];
                writePointer++; // Move the writePointer forward
            }
        }
        
        // writePointer now points to the index after the last non-val element, so it is equal to k
        return writePointer;
    }
}
