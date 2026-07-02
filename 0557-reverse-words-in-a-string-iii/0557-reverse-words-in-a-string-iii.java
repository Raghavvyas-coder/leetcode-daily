class Solution {
    public String reverseWords(String s) {

        char[] arr = s.toCharArray();
        int start = 0;

        for (int end = 0; end <= arr.length; end++) {

            if (end == arr.length || arr[end] == ' ') {

                int i = start;
                int j = end - 1;

                while (i < j) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }

                start = end + 1;
            }
        }

        return new String(arr);
    }
}