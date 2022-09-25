import java.util.Scanner;

public class atm_java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] inValue = new int[n];
        int result = 0;

        for (int i = 0; i < n; i++) {
            inValue[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (inValue[i] > inValue[j]) {
                    int tmp = inValue[j];
                    inValue[j] = inValue[i];
                    inValue[i] = tmp;
                }
            }
        }

        int tmp = 0;
        for(int item : inValue) {
            tmp = tmp + item;

            result += tmp;
        }

        System.out.println(result);
    }
}
