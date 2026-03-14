package algorithms;

import graph.SocialGraph;
import java.util.*;

public class ShortestConnection {

    public static List<Integer> findPath(
            SocialGraph graph, int start, int end) {

        Queue<Integer> queue = new LinkedList<>();
        Map<Integer, Integer> parent = new HashMap<>();
        Set<Integer> visited = new HashSet<>();

        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {

            int node = queue.poll();

            if (node == end)
                break;

            for (int neighbor : graph.getFriends(node)) {

                if (!visited.contains(neighbor)) {

                    visited.add(neighbor);
                    parent.put(neighbor, node);
                    queue.add(neighbor);
                }
            }
        }

        List<Integer> path = new ArrayList<>();

        if (!parent.containsKey(end))
            return path;

        int current = end;

        while (current != start) {

            path.add(current);
            current = parent.get(current);
        }

        path.add(start);

        Collections.reverse(path);

        return path;
    }
}