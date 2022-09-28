import java.util.*;

public class listNumberAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] list = new int[n];
        int result = 0;

        for(int i=0; i<n; i++) {
            list[i] = sc.nextInt();
            result += list[i];
        }

        System.out.println(result);
    }
}