import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);//��ĳ�ʰ�ü ����
		int tAdultNum, tChildNum;
		int ticketPrice = 8000, price=0;
		
		System.out.print("�Ƶ� ��:");
		tChildNum = in.nextInt();

		System.out.print("���� ��:");
		tAdultNum = in.nextInt();

		price = (ticketPrice-2000)*tChildNum + 
				ticketPrice*tAdultNum;
		System.out.println("�Ѽ���:"+ (tChildNum+tAdultNum));
		System.out.println("�ݾ�:"+price);			
	}
}


