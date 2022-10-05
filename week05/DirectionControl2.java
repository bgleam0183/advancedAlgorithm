// 답안
// n * n 크기의 사각형에서 알파벳을 입력받아 상하좌우 이동하는 문제
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DirectionControl2 {
    public static void main(String[] args) throws IOException {
        int[][] dir = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
        // 미리 입력될 수 있는 값을 하드코딩 해두면, 유효값을 알기 쉬워 편리
        char[] alpha = {'L', 'R', 'U', 'D'};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");

        int x = 0, y = 0;

        for (int i=0; i<input.length; i++) {
            for (int j=0; j<4; j++) {
                if (input[i].charAt(0) == alpha[j]) {
//                    int nx = x + dir[j][0];
//                    int ny = y + dir[j][1];
//                    if (nx < 0 || nx >= n || ny < 0 || ny >= n) continue;
//                    x = nx;
//                    y = ny;
                }
            }
        }

        System.out.println((x+1) + " " + (y+1));
    }
}
