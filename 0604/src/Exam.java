import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);//스캐너객체 생성
		int tAdultNum, tChildNum;
		int ticketPrice = 8000, price=0;
		
		System.out.print("아동 수:");
		tChildNum = in.nextInt();

		System.out.print("성인 수:");
		tAdultNum = in.nextInt();

		price = (ticketPrice-2000)*tChildNum + 
				ticketPrice*tAdultNum;
		System.out.println("총수량:"+ (tChildNum+tAdultNum));
		System.out.println("금액:"+price);			
	}
}


