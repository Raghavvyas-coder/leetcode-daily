class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int left = 0;
        int maxLen = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            // If character already exists in current window
            if (map.containsKey(ch) && map.get(ch) >= left) {
                left = map.get(ch) + 1;
            }

            // Store latest index
            map.put(ch, right);

            // Update maximum length
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}