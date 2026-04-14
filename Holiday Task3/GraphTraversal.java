import java.util.*;

public class GraphTraversal {

    static Map<Integer,List<Integer>> graph = new HashMap<>();

    static void add(int x, int y) {

        if (!graph.containsKey(x)) graph.put(x, new ArrayList<>());
        if (!graph.containsKey(y)) graph.put(y, new ArrayList<>());
        graph.get(x).add(y);
        graph.get(y).add(x);
    }

    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.add(start);
        visited.add(start);
        System.out.println("\n--- BFS ---");
        
        while (!queue.isEmpty()) {
            System.out.println("q = " + queue);
            int cur = queue.poll();
            System.out.println("visiting " + cur);
            if (!graph.containsKey(cur)) continue;
            for (int neighbor : graph.get(cur)) {
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
            
            System.out.println("visited = " + visited);
            System.out.println();
        }
    }

    static void dfs(int start) {
        Stack<Integer> stack = new Stack<>();
        Set<Integer> visited = new HashSet<>();
        stack.push(start);
        System.out.println("\n--- DFS ---");

        while (!stack.isEmpty()) {
            System.out.println("stack = " + stack);
            int cur = stack.pop();
            if (!visited.contains(cur)) {
                visited.add(cur);
                System.out.println("visiting " + cur);
                if (!graph.containsKey(cur)) continue;
                for (int neighbor : graph.get(cur)) {
                    if (!visited.contains(neighbor)) {
                        stack.push(neighbor);
                    }
                }
            }

            System.out.println("visited = " + visited);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of edges:");
        int e = sc.nextInt();
        System.out.println("enter edges:");

        for (int i = 0; i < e; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            add(a, b);
        }

        System.out.println("start node:");
        int s = sc.nextInt();
        System.out.println("1 bfs \n2 dfs ?");
        int ch = sc.nextInt();
        if (ch == 1) bfs(s);
        else dfs(s);
        System.out.println("Traversal completed!!!");
    }
}