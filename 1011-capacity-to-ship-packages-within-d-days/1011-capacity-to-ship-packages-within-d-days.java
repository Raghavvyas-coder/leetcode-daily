class Solution {

    private boolean canShip(int[] weights, int days, int cap) {
        int usedDays = 1;
        int curWeight = 0;

        for (int w : weights) {
            if (curWeight + w > cap) {
                usedDays++;
                curWeight = 0;
            }
            curWeight += w;
        }

        return usedDays <= days;
    }

    public int shipWithinDays(int[] weights, int days) {
        int left = 0, right = 0;

        for (int w : weights) {
            left = Math.max(left, w);
            right += w;
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (canShip(weights, days, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}