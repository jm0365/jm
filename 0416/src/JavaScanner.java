import java.util.Scanner;

public class JavaScanner {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int a,c=0;
		int sum = 0;

		System.out.print("���ۡ����ڣ���");
		a = in.nextInt();
		
		System.out.print("�����������ڣ���");
		c = in.nextInt();
		
		for(int i = a; i <= c; i++) {
			sum += i;
		}
		System.out.println(a + "���� " + c + "������ ���� " + sum);
	}

}

