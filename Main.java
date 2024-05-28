import java.util.Scanner;

class PreAssesementAnswer {
    public void execute(int choice) {
        switch (choice) {
            case 1:
                executeCucian();
                break;
            case 2:
                executeVerb();
                break;
            case 3:
                executeInggris();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    private void executeCucian() {
        PriorityScheduler daftarCuci = new PriorityScheduler();
        
        daftarCuci.terimaCucian(1, "Intan", 3, "biasa", 5);
        daftarCuci.terimaCucian(2, "Dudi", 4, "express", 3);
        daftarCuci.terimaCucian(3, "Ruli", 4, "kilat", 1);
        daftarCuci.terimaCucian(4, "Susi", 5, "biasa", 2);
        daftarCuci.terimaCucian(5, "Ira", 6, "biasa", 5);
        daftarCuci.terimaCucian(6, "Mayang", 7, "kilat", 4);

        System.out.println("List Jadwal:");
        daftarCuci.listJadwal();    
    }

    private void executeVerb() {
        BST bst = new BST();

        bst.insert("took");
        bst.insert("cut");
        bst.insert("put");
        bst.insert("went");

        System.out.println("Inorder traversal:");
        bst.inorder();

        System.out.println("\nHasil search:");

        bst.search("cut");
        bst.search("run");
    }

    private void executeInggris() {
        AdjacencyList adjacencyList = new AdjacencyList();
        
        adjacencyList.addEdge("London", "Salisbury");
        adjacencyList.addEdge("London", "Birmingham");
        
        adjacencyList.addEdge("Salisbury", "Bristol");
        adjacencyList.addEdge("Salisbury", "London");

        adjacencyList.addEdge("Bristol", "Salisbury");
        adjacencyList.addEdge("Bristol", "Birmingham");
        
        adjacencyList.addEdge("Birmingham", "Cardiff");
        adjacencyList.addEdge("Birmingham", "Bristol");
        adjacencyList.addEdge("Birmingham", "London");
        adjacencyList.addEdge("Birmingham", "Manchester");
        adjacencyList.addEdge("Birmingham", "Kingston");

        adjacencyList.addEdge("Cardiff", "Birmingham");

        adjacencyList.addEdge("Manchester", "Birmingham");
        adjacencyList.addEdge("Manchester", "Kingston");
        adjacencyList.addEdge("Manchester", "Liverpool");
        adjacencyList.addEdge("Manchester", "Newcastle");
        adjacencyList.addEdge("Manchester", "Glasgow");

        adjacencyList.addEdge("Kingston", "Manchester");
        adjacencyList.addEdge("Kingston", "Birmingham");
        adjacencyList.addEdge("Kingston", "Newcastle");

        adjacencyList.addEdge("Liverpool", "Manchester");

        adjacencyList.addEdge("Newcastle", "Manchester");
        adjacencyList.addEdge("Newcastle", "Kingston");
        adjacencyList.addEdge("Newcastle", "Edinburgh");

        adjacencyList.addEdge("Edinburgh", "Newcastle");
        adjacencyList.addEdge("Edinburgh", "Glasgow");

        adjacencyList.addEdge("Glasgow", "Edinburgh");
        adjacencyList.addEdge("Glasgow", "Manchester");

        BFS bfs = new BFS(adjacencyList);

        System.out.println("BFS dari London:");
        bfs.search("London");

        System.out.println();

        System.out.println("DFS dari London:");

        DFS dfs = new DFS(adjacencyList);

        dfs.search("London");

        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Pre-Assesement");
        System.out.println("1. Cucian");
        System.out.println("2. Verb");
        System.out.println("3. Inggris");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Pilih: ");

        int choice = scanner.nextInt();

        PreAssesementAnswer preAssesementAnswer = new PreAssesementAnswer();

        preAssesementAnswer.execute(choice);
    }
}