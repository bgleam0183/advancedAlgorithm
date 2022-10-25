import java.util.*;

public class Maze {
    static int N, M;
    static int[][] maze;
    static Stack<HashMap<Integer, Integer>> mv = new Stack<>();
    static HashMap<Integer, Integer> goal;
    static int cnt = 1;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        maze = new int[N][M];
        goal = new HashMap<Integer, Integer>(N-1,N-1);
        sc.nextLine();

        for (int i = 0; i < N; i++) {
            String tmp = sc.nextLine();

            for (int j = 0; j < M; j++) {
                maze[i][j] = Integer.parseInt(tmp.split("")[j]);
            }
        }

        solve(0,0);

//        for (int i = 0; i < N; i++) {
//            System.err.println("\n");
//
//            for (int j = 0; j < M; j++) {
//                System.err.print(maze[i][j] + " ");
//            }
//        }
    }

    protected static void solve(int x, int y) {
        HashMap<Integer, Integer> temp = new HashMap<Integer, Integer>(x,y);
        mv.push(temp);
        cnt++;

        if (Objects.equals(goal, temp)) {
            System.err.println(cnt);

            return;
        }

        if (maze[x][y] == 1) {
            maze[x][y] = cnt;

            if ((x+1) < N) {
                solve(x + 1, y);
            }

            if ((x-1) >= 0) {
                solve(x - 1, y);
            }

            if ((y+1) < M) {
                solve(x, y + 1);
            }

            if ((y-1) >= 0) {
                solve(x, y - 1);
            }
        }
        else {
            maze[x][y] = 0;
            cnt--;
        }
    }
}
//5 6
//101010
//111111
//000001
//111111
//111111