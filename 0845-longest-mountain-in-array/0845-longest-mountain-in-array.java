class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        int maxLen = 0;

        for (int i = 1; i < n - 1; i++) {

            // Check if current element is a peak
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {

                int left = i;
                int right = i;

                // Move left while increasing
                while (left > 0 && arr[left] > arr[left - 1]) {
                    left--;
                }

                // Move right while decreasing
                while (right < n - 1 && arr[right] > arr[right + 1]) {
                    right++;
                }

                int length = right - left + 1;
                maxLen = Math.max(maxLen, length);

                // Skip processed elements
                i = right;
            }
        }

        return maxLen;
    }
}
