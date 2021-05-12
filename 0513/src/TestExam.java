import java.util.Scanner;

public class TestExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("500 이하의 자연수를 입력하세요.");
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
		System.out.println("1~"+num1+"까지 3의 배수이면서 7의 배수인 수의 합은 "+sum+"입니다.");
	}
}