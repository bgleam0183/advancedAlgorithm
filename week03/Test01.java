import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		int[] s = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt(); 
		}
		for (int i = 0; i < n; i++) {
			int insert_point = i;
			int insert_value = a[i];
			for (int j = i -1; j >=0; j--) {
				if (a[i] > a[j]) {
					insert_point = j + 1;
					break;					
				}
				if (j ==0) {
					insert_point = 0;
				}
			}
			for (int j = i; j > insert_point; j--) {
				a[j] = a[j-1];
			}
			a[insert_point] = insert_value;
		}
		s[0] = a[0];
		for (int i = 1; i < n; i++) {
			s[i] = s[i-1] + a[i];
		}
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + s[i];
		}
		System.out.println(sum);
	}

}
