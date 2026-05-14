class Solution {

    public int majorityElement(int[] nums) {

        // stores possible majority element
        int candidate = 0;

        // stores votes/support for candidate
        int count = 0;

        // traverse array
        for (int i = 0; i < nums.length; i++) {

            // if count becomes 0
            // choose current element as new candidate
            if (count == 0) {
                candidate = nums[i];
            }

            // if current element matches candidate
            // increase vote
            if (nums[i] == candidate) {
                count++;
            }

            // if current element is different
            // decrease vote
            else {
                count--;
            }
        }

        // remaining candidate is majority element
        return candidate;
    }
}