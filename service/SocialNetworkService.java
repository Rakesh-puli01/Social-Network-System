package service;

import model.User;
import graph.SocialGraph;
import algorithms.*;

import java.util.*;

public class SocialNetworkService {

    private Map<Integer, User> users;
    private SocialGraph graph;

    public SocialNetworkService() {

        users = new HashMap<>();
        graph = new SocialGraph();
    }

    public void addUser(int id, String name) {

        users.put(id, new User(id, name));
        graph.addUser(id);
    }

    public void addFriend(int u1, int u2) {

        graph.addFriendship(u1, u2);
    }

    public void showFriends(int id) {

        List<Integer> friends = graph.getFriends(id);

        if (friends.isEmpty()) {

            System.out.println("No friends found.");
            return;
        }

        for (int f : friends) {
            System.out.println(users.get(f));
        }
    }

    public void suggestFriends(int id) {

        List<Integer> suggestions =
                FriendSuggestion.suggest(graph, id);

        if (suggestions.isEmpty()) {

            System.out.println("No suggestions available.");
            return;
        }

        for (int s : suggestions) {
            System.out.println(users.get(s));
        }
    }

    public void shortestPath(int start, int end) {

        List<Integer> path =
                ShortestConnection.findPath(graph, start, end);

        if (path.isEmpty()) {

            System.out.println("No connection found.");
            return;
        }

        for (int p : path) {

            System.out.print(users.get(p) + " -> ");
        }

        System.out.println("END");
    }
}