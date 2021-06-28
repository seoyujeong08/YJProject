package test6_2;

import java.util.Scanner;

public class test6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner(System.in);

		while (true) {
		System.out.println("\n이용 날짜를 입력해주세요. (ex 2021 06 05)");
		int year, month, day = 0;
		year = myInput.nextInt();
		month = myInput.nextInt();
		day = myInput.nextInt();

		int ticketA = 60000, ticketB = 56000, ticketC = 50000;
		int ticket6A;
		// 6, 7월달은 B, 8, 9월달은 A, 10, 11월달은 C
		if (month == 6) {
			month = ticketB;
			System.out.println("B 티켓이 선택되었습니다."); 
		} else if (month == 7) {
			month = ticketB;
			System.out.println("B 티켓이 선택되었습니다."); 
		} else if (month == 8) {
			month = ticketA;
			System.out.println("A 티켓이 선택되었습니다.");  
		} else if (month == 9) {
			month = ticketA;
				System.out.println("A 티켓이 선택되었습니다.");
		} else if (month == 10) {
			month = ticketC;
				System.out.println("C 티켓이 선택되었습니다."); 
		} else if (month == 11) {
			month = ticketC;
				System.out.println("C 티켓이 선택되었습니다."); 
		}
		
		System.out.println("\n생년월일을 입력해주세요. (ex 19951222)");
		// 소인, 경로
		int age;
		age = myInput.nextInt();
		if (age <= 19561231) {
			System.out.println("경로 우대권이 자동 선택되었습니다.\n");
			age = month - 20000;
		} else if (age >= 20091231) {
			age = month - 20000;
			System.out.println("소인 요금이 적용됩니다.\n");
		} else if (age <= 20091231) {
		}
		System.out.println("몇 장을 주문하시겠습니까?");
		int orderTicket;
		orderTicket = myInput.nextInt();
		System.out.printf("\n%d 장을 주문하셨습니다.\n", orderTicket);
		
		System.out.println("\n우대사항을 선택하세요. \n1. 없음 (경로 우대는 자동처리됩니다.)\n"
				+ "2. 장애인 \n3. 국가유공자 \n4. 다자녀 \n5. 임산부");
		int number, price = 0;
		number = myInput.nextInt();
		if (age <= 19561231) {
			System.out.printf("경로우대가가 적용됩니다. \n가격은 %d 원 입니다. 감사합니다.", orderTicket * age);
			price = orderTicket * age;
		} else if (age >= 20091231) {
			System.out.printf("가격은 %d 원 입니다. 감사합니다.", orderTicket * age);
			price = orderTicket * age;
		} else if (number ==1) {
			System.out.printf("가격은 %d 원 입니다. 감사합니다.", orderTicket * month);
		} else if (number ==2) {
			number = month - 20000;
			System.out.printf("장애인 우대가가 적용됩니다. \n가격은 %d 원 입니다. 감사합니다.", orderTicket * number);
			price = orderTicket * number;
		} else if (number ==3) {
			number = month - 40000;
			System.out.printf("국가유공자 우대가가 적용됩니다. \n가격은 %d 원 입니다. 감사합니다.", orderTicket * number);
			price = orderTicket * number;
		} else if (number ==4) {
			number = month - 20000;
			System.out.printf("다자녀 우대가가 적용됩니다. \n가격은 %d 원 입니다. 감사합니다.", orderTicket * number);
			price = orderTicket * number;
		} else if (number ==5) {
			number = month - 20000;
			System.out.printf("임산부 우대가가 적용됩니다. \n가격은 %d 원 입니다. 감사합니다.", orderTicket * number);
			price = orderTicket * number;
			}
		
		if (age <= 20091231) {
		System.out.println("\n==============에버랜드==============");
		System.out.printf("%d   대인   x%d    %d    \n", month, orderTicket, price);
	    } else if (age >= 20091231) {
	    	System.out.println("\n==============에버랜드==============");
			System.out.printf("%d   소인   x%d    %d    \n", month, orderTicket, price);
	    }
}

}
}
// 누덕누덕코드...........................................ㅠ