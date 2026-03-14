package algorithms;

import graph.SocialGraph;
import java.util.*;

public class FriendSuggestion {

    public static List<Integer> suggest(SocialGraph graph, int userId) {

        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        List<Integer> suggestions = new ArrayList<>();

        visited.add(userId);
        queue.add(userId);

        int level = 0;

        while (!queue.isEmpty() && level < 2) {

            int size = queue.size();

            for (int i = 0; i < size; i++) {

                int current = queue.poll();

                for (int friend : graph.getFriends(current)) {

                    if (!visited.contains(friend)) {

                        visited.add(friend);
                        queue.add(friend);

                        if (level == 1) {
                            suggestions.add(friend);
                        }
                    }
                }
            }

            level++;
        }

        return suggestions;
    }
}