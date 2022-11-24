import java.util.ArrayList;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("how much are you going to type? >> ");
        int n = sc.nextInt();

        ArrayList<Integer> input = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("input " + (n-i) +" Left >> ");
            input.add(sc.nextInt());
        }

        int result = -1;
        boolean flag;

        for (int i=0; i < input.size(); i++) {
            flag = false;

            for(int j=0; j < i; j++) {
                if (input.get(i) < input.get(j)) {
                    flag = true;
                    continue;
                }
            }
            for(int j=i; j < input.size(); j++) {
                if (input.get(i) > input.get(j)) {
                    flag = true;
                    continue;
                }
            }

            if (!flag) {
                result = i;
            }
        }

        System.out.println("answer index is "+result+"  (if the value is -1, then there's no answer");
    }
}
