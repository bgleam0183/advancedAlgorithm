import java.util.Arrays;

public class ZeroToLast {
    public static void main(String[] args) {
        int arr1[] = {6, 0, 8, 2 ,3, 0, 4, 0, 1};
        int n = arr1.length;

        // 스캔 받는 경우
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("입력할 배열 개수 >> ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
         */

        for(int i = 0; i < n; i++) {
            if (arr1[i] == 0) {
                for (int j = i; j < n; j++) {
                    if (arr1[j] != 0) {
                        arr1[i] = arr1[j];
                        arr1[j] = 0;
                        break;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(arr1));
    }
}
