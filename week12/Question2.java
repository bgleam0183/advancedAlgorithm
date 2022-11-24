import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        // java StrRearrange
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        ArrayList<Character> result = new ArrayList<Character>();

        int value = 0;

        for (int i=0; i<input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 65 && ch <= 90) {
                result.add(ch);
            }
            else {
                value += ch - '0';
            }
        }

        Collections.sort(result);

        for (Character ch : result) {
            System.out.print(ch);
        }
        if (value != 0) System.out.print(value);
    }
}
