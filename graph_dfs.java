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

    public static void main(String[] args){
        graph_dfs graph = new graph_dfs(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);

        ArrayList<ArrayList<Integer>> result = graph.dfs(0);
        for(ArrayList<Integer> list : result){
            System.out.println(list);
        }
        // Output:
    }
}