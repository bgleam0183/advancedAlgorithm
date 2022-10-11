// n * n 크기의 사각형에서 알파벳을 입력받아 상하좌우 이동하는 문제
import java.util.Scanner;

public class DirectionControl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String move = sc.nextLine();

        String[] moveArr = move.split("");

        int x = 0;
        int y = 0;

        for (String tmp :
                moveArr) {

            switch (tmp) {
                case "R":
                    if (x<n) x++;
                    break;
                case "L":
                    if (x != 0) x--;
                    break;
                case "U":
                    if (y != 0) y--;
                    break;
                case "D":
                    if (y < n) y++;
                    break;
                default:
                    break;
            }
        }

        x++;
        y++;

        System.err.println(x + " " + y);
    }
}