class CustomStack {

    private int[] stack;
    private int[] inc;
    private int size;

    public CustomStack(int maxSize) {
        stack = new int[maxSize];
        inc = new int[maxSize];
        size = 0;
    }

    public void push(int x) {
        if (size == stack.length) return;
        stack[size] = x;
        size++;
    }

    public int pop() {
        if (size == 0) return -1;

        size--;
        int ans = stack[size] + inc[size];

        if (size > 0)
            inc[size - 1] += inc[size];

        inc[size] = 0;

        return ans;
    }

    public void increment(int k, int val) {
        int idx = Math.min(k, size) - 1;
        if (idx >= 0)
            inc[idx] += val;
    }
}