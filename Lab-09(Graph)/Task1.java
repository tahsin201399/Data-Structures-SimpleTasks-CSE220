
class Edge{
    int vertice;
    Edge next;

    public Edge(int var){
        this.vertice = var;
        this.next = null;
    }
}

public class Task1 {
    static void addEdge(Edge[] graph , int a1, int a2, int [][] mat){
        Edge newEdge = new Edge(a2);
        newEdge.next= graph[a1];
        graph[a1] = newEdge;
        newEdge = new Edge(a1);
        newEdge.next= graph[a2];
        graph[a2] = newEdge;
        mat[a1][a2] = 1;
        mat[a2][a1] = 1;
    }

    public static void showAdjList(Edge[] graph){
        System.out.println("The adjacency list is: ");

        for(int i = 0 ; i < graph.length;i++){
            System.out.print(i+" -> ");
            Edge temp = graph[i];
            while(temp != null){
                System.out.print(temp.vertice + " ->> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void showAdjMat(int [][] mat){
        System.out.println("The adjacency matrix is: ");
        for(int i = 0 ; i < mat.length;i++){
            for(int j = 0 ; j < mat[i].length;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int findmaxdeg(Edge[] graph){
        int max = 0 ;
        for(int i = 0 ; i < graph.length;i++){
            int d=0;
            Edge temp = graph[i];
            while(temp != null){
                d++;
                temp = temp.next;
            }
            if(d > max){
                max = d;
            }
        }
        return max;

    }

    public static void main (String [] atgs){
        int V = 7;
        Edge [] g = new Edge[V];
        int [][] mat = new int[V][V];

        addEdge(g, 0, 0, mat);
        addEdge(g, 0, 1, mat);
        addEdge(g, 0, 2, mat);
        addEdge(g, 1, 2, mat);
        addEdge(g, 1, 3, mat);
        addEdge(g, 2, 3, mat);
        addEdge(g, 2, 4, mat);
        addEdge(g, 3, 4, mat);
        addEdge(g, 3, 5, mat);
        addEdge(g, 4, 5, mat);
        addEdge(g, 4, 6, mat);
        addEdge(g, 5, 6, mat);
        addEdge(g, 5, 0, mat);
        addEdge(g, 6, 0, mat);
        addEdge(g, 6, 1, mat);
        addEdge(g, 6, 2, mat);

        showAdjList(g);
        showAdjMat(mat);

        int maximumdegree = findmaxdeg(g);
        System.out.println("The maximum degree of the graph is: " + maximumdegree);
    }
 }