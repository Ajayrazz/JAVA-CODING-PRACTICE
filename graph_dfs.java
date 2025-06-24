import java.util.*;
class graph_dfs {
    int v;
    ArrayList<ArrayList<Integer>> adj;
    //constructor
    public graph_dfs(int v){
        this.v = v;
        this.adj = new ArrayList<>(v);

        for(int i = 0; i < v; i++){
            adj.add(new ArrayList<>());
        }
    }

    //add edge
    public void addEdge(int i, int j){
        if(i < 0 || j < 0 || i >= v || j >= v){
            throw new IllegalArgumentException("Invalid vertex index");
        }

        adj.get(i).add(j);
        adj.get(j).add(i);
    }

    //remove edge
    public void removeEdge(int i, int j){
        if(i < 0 || j < 0 || i >= v || j >= v){
            throw new IllegalArgumentException("Invalid vertex index");
        }

        adj.get(i).remove(Integer.valueOf(j));
        adj.get(j).remove(Integer.valueOf(i));
    }

    //bfs traversal
    public ArrayList<ArrayList<Integer>> dfs(int start){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[v];
        queue.add(start);
        visited[start] = true;

        while(!queue.isEmpty()){
            int currentVertex = queue.poll();
            ArrayList<Integer> currentAdj = new ArrayList<>();
            currentAdj.add(currentVertex);
            result.add(currentAdj);

            for(int i : adj.get(currentVertex)){
                if(!visited[i]){
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
        return result;
    }

    //depth first search
    public ArrayList<Integer> dfs(int start){
        ArrayList<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[v];
        dfsUtil(0, visited, result, adj);
        return result;
    }

    //util function for dfs
    private void dfsUitl(int start, boolean[] visited, ArrayList<Integer> result, ArrayList<ArrayList<Integer>> adj){
        //visit
        visited[start] = true;
        result.add(start);

        for(Integer i  adj.get(start)){
            if(!visited[i]){
                dfsUitl(i, visited, result, adj);
            }
        }
    }

    public static void main(String[] args){
        graph_dfs graph = new graph_dfs(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);

        System.out.println("DFS Traversal starting from vertex 0:");
        ArrayList<ArrayList<Integer>> result = graph.dfs(0);
        for(ArrayList<Integer> list : result){
            System.out.println(list);
        }

        System.out.println("BFS Traversal starting from vertex 0:");
        ArrayList<Integer> bfsResult = graph.bfs(0);
        for(Integer i : bfsResult){
            System.out.print(i + " ");
        }


        // Output:
    }
}