import java.util.Scanner;

public class JavaScanner {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int a,c=0;
		int sum = 0;

		System.out.print("시작　숫자：　");
		a = in.nextInt();
		
		System.out.print("마지막　숫자：　");
		c = in.nextInt();
		
		for(int i = a; i <= c; i++) {
			sum += i;
		}
		System.out.println(a + "부터 " + c + "까지의 합은 " + sum);
	}

}

