class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Indices starting from the end of each array's significant values
        int i = m - 1; // Last initialized element in nums1
        int j = n - 1; // Last element in nums2
        int k = m + n - 1; // Last position in nums1 to fill

        // Merge in reverse order to avoid overwriting values in nums1 that need to be checked
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // No need to copy the remaining elements from nums1 since they are already in place
        // No need to handle the rest of nums2 because the loop runs until all elements of nums2 are processed
    }
}
