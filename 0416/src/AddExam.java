import java.util.Scanner;

public class AddExam {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a,b=0;
		int sum = 0;

		System.out.print("시작　숫자：　");
		a = in.nextInt();
		System.out.print("마지막　숫자：　");
		b = in.nextInt();
		
		for(int i = a; i <= b; i++) {
			sum += i;
		}
		System.out.println(a + "부터 " + b + "까지의 합은 " + sum);
	}

}