public class Task2 {

    static class Edge{
    int vertice;
    Edge next;
    int weight;

    public Edge(int var, int w){
        this.vertice = var;
        this.next = null;
        this.weight = w;

    }
}
    static void addEdge(Edge[] graph, int [][] mat , int a1, int a2, int w){
        Edge newEdge = new Edge(a2,w);
        newEdge.next= graph[a1];
        graph[a1] = newEdge;
        newEdge = new Edge(a1,w);
        newEdge.next= graph[a2];
        graph[a2] = newEdge;
        mat[a1][a2] = w;
        mat[a2][a1] = w;
    }

    public static void showAdjList(Edge[] graph){
        System.out.println("The adjacency list(With weights) is: ");

        for(int i = 0 ; i < graph.length;i++){
            System.out.print(i+" -> ");
            Edge temp = graph[i];
            while(temp != null){
                System.out.print(temp.vertice + " , and weight = " + temp.weight + " ->> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void showAdjMat(int [][] mat){
        System.out.println("The adjacency matrix is: ");
        for(int j = 0 ; j <mat.length;j++){
            System.out.print(j + " ");
        }
        for(int i = 0 ; i < mat.length;i++){
            System.out.println(i + " ");
            for(int j = 0 ; j < mat[i].length;j++){
                System.out.print(mat[i][j] + " ");
            }
        }
    }

    public static int verwithmaxedgesum(Edge[] graph){
        int maxs = 0 ;
        int ver = -1;
        for(int i = 0 ; i < graph.length;i++){
            int sum = 0;
            Edge temp = graph[i];
            while(temp != null){
                sum += temp.weight;
                temp = temp.next;
            }
            if(sum > maxs){
                maxs = sum;
                ver = i;
            }
        }
        System.out.println("The vertex with the maximum sum of edges is: " + ver + " with a sum of: " + maxs);
        return ver;
    }

   

    public static void main (String [] atgs){
        int V = 7;
        Edge [] g = new Edge[V];
        int [][] mat = new int[V][V];

        addEdge(g,mat, 0, 0,5);
        addEdge(g, mat, 0, 1,3);
        addEdge(g, mat,0, 2,4 );
        addEdge(g,mat, 1, 2 ,1);
        addEdge(g, mat,1, 3,2);
        addEdge(g,mat, 2, 3,3);
        addEdge(g,mat, 2, 4,2);
        addEdge(g,mat, 3, 4,5);
        addEdge(g,mat, 3, 5,6);
        addEdge(g, mat,4, 5,3);
        addEdge(g,mat, 4, 6,7);
        addEdge(g,mat, 5, 6,9);
        addEdge(g, mat,5, 0,8);
        addEdge(g,mat, 6, 0,6);
        addEdge(g, mat,6, 1,3);
        addEdge(g, mat,6, 2,5);

        showAdjList(g);
        showAdjMat(mat);
        System.out.println();
        verwithmaxedgesum(g);

      
    }
 }
