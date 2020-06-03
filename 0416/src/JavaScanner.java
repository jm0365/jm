import java.util.Scanner;

public class JavaScanner {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int a,c=0;
		int sum = 0;

		System.out.print("矫累　箭磊：　");
		a = in.nextInt();
		
		System.out.print("付瘤阜　箭磊：　");
		c = in.nextInt();
		
		for(int i = a; i <= c; i++) {
			sum += i;
		}
		System.out.println(a + "何磐 " + c + "鳖瘤狼 钦篮 " + sum);
		System.out.println("test");
	}

}

