import java.util.Scanner;

// 체스 나이트가 이동 가능한 경우의 수 세는 문제
public class RoyalKnight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] loc = input.split("");

        int[][] movement = {{-2, -1}, {-1, -2}, {1, -2}, {2, -1}, {-2, 1}, {-1, 2}, {1, 2}, {2, 1}};

        int x = (int)loc[0].charAt(0)-96, y = Integer.parseInt(loc[1]);

        int cnt = 0;

        for (int i = 0; i < 8; i++) {
            if (x + movement[i][0] > 0 && x + movement[i][0] < 9) {
                if (y + movement[i][1] >0 && y + movement[i][1] < 9) {
                    cnt++;
                }
            }
        }

        System.err.println(cnt);
    }
}
