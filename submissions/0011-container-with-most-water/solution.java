class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int leftHeight = height[left];
            int rightHeight = height[right];
            int width = right - left;

            // Calculate current area and update maxArea if larger
            int currentArea = width * (leftHeight < rightHeight ? leftHeight : rightHeight);
            if (currentArea > maxArea) {
                maxArea = currentArea;
            }

            // Move the pointer pointing to the shorter line
            if (leftHeight < rightHeight) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}


