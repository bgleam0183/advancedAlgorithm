import java.util.Scanner;

public class QuestionWithJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int answer = 0;

        String k_num = to_k_num(n, k);


        for (String item : k_num.split("0")) {
            if (item.equals("")) continue;
            if(isPrimeNumber(Integer.parseInt(item))) {
                answer++;
            }
        }

        System.out.println(answer);
    }
    public static String to_k_num(int n, int k) {
        String result = "";

        while (n > 0) {
            result = (n%k) + result;

            n /= k;
        }

        return result;
    }

    public static boolean isPrimeNumber(int n) {
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n < 2) return false;

        for (int i = 2; i <= Math.sqrt(n); i++ ) {
            if (n%i ==0) return false;
        }
        return true;
    }
}

