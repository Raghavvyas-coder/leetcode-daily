class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrack(candidates, target, 0, new ArrayList<>());
        return ans;
    }

    private void backtrack(int[] arr, int target, int index, List<Integer> curr) {

        if (target == 0) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        if (target < 0 || index == arr.length) {
            return;
        }

        // Take current element
        curr.add(arr[index]);
        backtrack(arr, target - arr[index], index, curr);

        // Backtrack
        curr.remove(curr.size() - 1);

        // Skip current element
        backtrack(arr, target, index + 1, curr);
    }
}