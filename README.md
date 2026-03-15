# Social Network System (Java)

## Project Description

The Social Network System is a console-based Java application that simulates the core functionality of a social networking platform. The system allows users to create profiles, connect with other users, and explore relationships within the network.

The project uses graph-based data structures to represent users and their connections. Each user is treated as a node, and friendships between users are represented as edges in the graph. This structure helps manage and analyze relationships efficiently.

The system also includes algorithms to find the shortest connection between users and suggest potential friends based on existing network relationships. This project demonstrates how social networks organize and analyze connections using Data Structures and Algorithms.


## Features

- Create and manage user profiles
- Add friendships between users
- View connections in the social network
- Suggest potential friends
- Find the shortest connection between two users
- Graph-based relationship management
- Console-based user interaction


## Technologies Used

- Java
- Data Structures (Graph, List, Map)
- Graph Algorithms
- Object-Oriented Programming
- Console-based input/output


## Project Structure

SocialNetworkSystem
│
├── algorithms
│   ├── FriendSuggestion.java
│   └── ShortestConnection.java
│
├── app
│   └── Main.java
│
├── graph
│   └── SocialGraph.java
│
├── model
│   └── User.java
│
└── service
    └── SocialNetworkService.java


## How to Run the Project

1. Clone the Repository

git clone https://github.com/your-username/social-network-system.git

2. Navigate to Project Folder

cd social-network-system

3. Compile the Java Files

javac app/Main.java algorithms/*.java graph/*.java model/*.java service/*.java

4. Run the Program

java app.Main


## Example Usage

Enter user name:
Alice

Enter friend name:
Bob

Friend connection created successfully

Enter two users to find connection:
Alice Bob

Shortest connection found between users


## Learning Outcomes

- Understanding how social networks manage user relationships
- Applying graph data structures to represent connections
- Implementing algorithms for friend suggestions and shortest paths
- Practicing Object-Oriented Programming in Java
- Building structured console-based applications
