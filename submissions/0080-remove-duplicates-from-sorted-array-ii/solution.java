class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        // This variable will track the position to insert the next valid element.
        int insertPos = 1;
        // Count the occurrences of each element, allowing at most two.
        int count = 1;

        // Start from the second element and process each element.
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                // If the current element is the same as the previous one, increase the count.
                count++;
            } else {
                // If it's a different element, reset the count to 1.
                count = 1;
            }

            // If the count is less than or equal to 2, move the element to the insert position.
            if (count <= 2) {
                nums[insertPos] = nums[i];
                insertPos++;
            }
        }

        // The length of the array with duplicates removed is the insert position.
        return insertPos;
    }
}

