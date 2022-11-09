package dataStructure.graph;

import java.util.LinkedList;
import java.util.Queue;

public class adjacencyGraph {
    private int V;
    private int E;
    int[][] adjMatrix;
    public adjacencyGraph(int nodes)
    {
        this.adjMatrix = new int[nodes][nodes];
        this.V = nodes;
        this.E =0;
    }
    public void addEdge(int u , int v)
    {
        this.adjMatrix[u][v]=1;
        this.adjMatrix[v][u]=1;
        E++;

    }
    @Override
    public String toString() {
        StringBuilder s  = new StringBuilder();
        s.append(V+" vertices "+E+" Edges "+"\n");
        for (int i = 0;i<V;i++)
        {
            s.append(i+" ");
            for (int j:adjMatrix[i])
            {
                s.append(j+" ");
            }
            s.append("\n");
        }
        return s.toString();
    }
    public static void main(String[] args) {
        adjacencyGraph g = new adjacencyGraph(4);
        Queue<Integer> q = new LinkedList<>();
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,0);
        System.out.println(g);
        q.offer(32);
        System.out.println(q);
        q.poll();
        System.out.println(q);
    }

}

