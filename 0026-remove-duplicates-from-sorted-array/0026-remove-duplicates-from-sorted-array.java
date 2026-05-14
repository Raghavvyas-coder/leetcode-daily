class Solution {
    public int removeDuplicates(int[] nums) {

        // If array is empty
        if (nums.length == 0) {
            return 0;
        }

        int i = 0;

        // Traverse array
        for (int j = 1; j < nums.length; j++) {

            // If new unique element found
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }

        // Number of unique elements
        return i + 1;
    }
}