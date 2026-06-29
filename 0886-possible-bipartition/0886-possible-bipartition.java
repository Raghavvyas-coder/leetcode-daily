import java.util.*;

class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {

        List<Integer>[] graph = new ArrayList[n + 1];

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] edge : dislikes) {
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }

        int[] color = new int[n + 1];
        Arrays.fill(color, -1);

        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= n; i++) {

            if (color[i] != -1)
                continue;

            color[i] = 0;
            q.offer(i);

            while (!q.isEmpty()) {

                int curr = q.poll();

                for (int neighbor : graph[curr]) {

                    if (color[neighbor] == -1) {

                        color[neighbor] = 1 - color[curr];
                        q.offer(neighbor);

                    } else if (color[neighbor] == color[curr]) {

                        return false;
                    }
                }
            }
        }

        return true;
    }
}