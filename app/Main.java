package app;

import service.SocialNetworkService;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SocialNetworkService network =
                new SocialNetworkService();

        while (true) {

            System.out.println("\n===== SOCIAL NETWORK MENU =====");

            System.out.println("1. Add User");
            System.out.println("2. Add Friendship");
            System.out.println("3. Show Friends");
            System.out.println("4. Suggest Friends");
            System.out.println("5. Shortest Connection");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter User ID: ");
                    int id = sc.nextInt();

                    System.out.print("Enter User Name: ");
                    String name = sc.next();

                    network.addUser(id, name);

                    System.out.println("User added successfully.");
                    break;


                case 2:

                    System.out.print("Enter First User ID: ");
                    int u1 = sc.nextInt();

                    System.out.print("Enter Second User ID: ");
                    int u2 = sc.nextInt();

                    network.addFriend(u1, u2);

                    System.out.println("Friendship created.");
                    break;


                case 3:

                    System.out.print("Enter User ID: ");
                    int userId = sc.nextInt();

                    System.out.println("Friends List:");

                    network.showFriends(userId);
                    break;


                case 4:

                    System.out.print("Enter User ID: ");
                    int sugId = sc.nextInt();

                    System.out.println("Friend Suggestions:");

                    network.suggestFriends(sugId);
                    break;


                case 5:

                    System.out.print("Enter Start User ID: ");
                    int start = sc.nextInt();

                    System.out.print("Enter Target User ID: ");
                    int end = sc.nextInt();

                    network.shortestPath(start, end);
                    break;


                case 6:

                    System.out.println("Exiting program.");
                    sc.close();
                    return;


                default:

                    System.out.println("Invalid choice.");
            }
        }
    }
}
