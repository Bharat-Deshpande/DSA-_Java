package Graph;

import java.util.ArrayList;

public class DepthFirstSearch {

    public static void dfs(int node, boolean vis[],ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ls){
        vis[node] = true;
        ls.add(node);

        for(Integer it: adj.get(node)){
            if(vis[it] == false ){
                dfs(it, vis,adj,ls);
            }
        }
    }

    public ArrayList<Integer> dfsofGraph(int v, ArrayList<ArrayList<Integer>> adj){
        boolean[] visited = new boolean[v+1];
        visited[0] = true;
        ArrayList<Integer> ls = new ArrayList<>();
        dfs(0,visited,adj, ls);

        return ls;
    }
}
