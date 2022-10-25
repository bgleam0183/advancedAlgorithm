import java.util.Scanner;

public class Ice {
    static int result = 0;

    public static void pour(int[][] frm, int i, int j) {
        if (i < frm.length && j < frm[0].length && i >= 0 && j >= 0 && frm[i][j] != 1) { // i, j가 틀 안 + 1이 아닐 때만
            frm[i][j] = 1;

            pour(frm, i + 1, j);
            pour(frm, i - 1, j);
            pour(frm, i, j - 1);
            pour(frm, i, j + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // y축 => y, x축 => x
        int y = sc.nextInt();
        int x = sc.nextInt();

        sc.nextLine();

        int[][] iceFrm = new int[y][x];
        String[] frm = new String[y];

        for (int i = 0; i < y; i++) {
            frm[i] = sc.nextLine();
            for (int j = 0; j < frm[i].length(); j++) {
                iceFrm[i][j] = Integer.parseInt(frm[i].split("")[j]);
            }
        }

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (iceFrm[i][j] == 0) {
                    pour(iceFrm, i, j);
                    result++;
                }
            }
        }

        System.err.println(result);
    }
}
