import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Searchtree {
    static int[][] arr;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   // 정점
        int M = sc.nextInt();   // 간선
        int V = sc.nextInt();   // 시작번호

        arr = new int[N + 1][N + 1];
        for(int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        visited = new boolean[N + 1];
        dfs(V);

        System.out.println();

        visited = new boolean[N + 1];
        bfs(V);
    }

    public static void dfs(int V) {
        visited[V] = true;
        System.out.print(V + " ");

        if(V == arr.length) {
            return;
        }

        for (int j = 1; j < arr.length; j++) {
            if(arr[V][j] == 1 && visited[j] == false) {
                dfs(j);
            }
        }
    }

    public static void bfs(int V) {
        Queue<Integer> que = new LinkedList<Integer>();

        que.add(V);
        visited[V] = true;
        System.out.print(V + " ");

        while(!que.isEmpty()) {
            int temp = que.poll();
            for(int i = 1; i < arr.length; i++) {
                if(arr[temp][i] == 1 && visited[i] == false) {
                    que.add(i);
                    visited[i] = true;
                    System.out.print(i + " ");
                }
            }
        }
    }
}