package MAP;
import java.util.Scanner;
public class Graph {
	private int v;
	private int[][] matrix;
	public Graph(int v) {
		this.v=v;
		matrix=new int[v][v];
	}
	public void addEdge(int i,int j) {
		matrix[i][j]=1;
		matrix[j][i]=1;
	}
	public void printGraph() {
		for(int i=0;i<v;i++) {
			for(int j=0;j<v;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int s1=s.nextInt();
		Graph g=new Graph(s1);
		while(true) {
			int x=s.nextInt();
			int y=s.nextInt();
			if((x<0||y<0)||(x>=g.v||y>=g.v)) break;
			g.addEdge(x,y);
		}
		g.printGraph();
	}
}
