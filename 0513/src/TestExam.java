import java.util.Scanner;

public class TestExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("500 ������ �ڿ����� �Է��ϼ���.");
		int num1 = scan.nextInt();
		int sum = 0;
		int i = 1;

		while(i<=num1) {
			if(i%3==0 && i%7==0) {
				System.out.println(i);
				sum += i;
			}
			i++;
		}
		System.out.println("1~"+num1+"���� 3�� ����̸鼭 7�� ����� ���� ���� "+sum+"�Դϴ�.");
	}
}