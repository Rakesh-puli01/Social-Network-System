package graph;

import java.util.*;

public class SocialGraph {

    private Map<Integer, List<Integer>> graph;

    public SocialGraph() {
        graph = new HashMap<>();
    }

    public void addUser(int id) {
        graph.putIfAbsent(id, new ArrayList<>());
    }

    public void addFriendship(int u1, int u2) {

        graph.get(u1).add(u2);
        graph.get(u2).add(u1);
    }

    public List<Integer> getFriends(int id) {
        return graph.getOrDefault(id, new ArrayList<>());
    }

    public Map<Integer, List<Integer>> getGraph() {
        return graph;
    }
}