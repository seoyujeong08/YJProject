package 실습;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class EverlandTicket {
	
	public static int todayYear = 0, todayDate = 0, birthYear = 0, birthMonth = 0, 
			birthDay = 0, birthDate = 0, reservationDate = 0, benefit = 0,
			count = 0, manAge = 0, price = 0;
	public static int add = 0;
	public static String ticket = null, socialNumber = null, age = null;
	public static String b = null;

	public static ArrayList<String> arrTicket = new ArrayList<String>();
	public static ArrayList<String> arrAge = new ArrayList<String>();
	public static ArrayList<Integer> arrCount = new ArrayList<Integer>();
	public static ArrayList<Integer> arrPrice = new ArrayList<Integer>();
	public static ArrayList<String> arrB = new ArrayList<String>();
           	   
	public static String pattern1 = "yyyyMMdd";
	public static SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern1);
	public static String today = simpleDateFormat.format(new Date());
	public static Scanner myInput = new Scanner(System.in);
	
	public static void inputDate() {
		while(true) {	
			System.out.println("--------------------------------------");
	  		System.out.println("이용날짜를 입력해주세요. ex 20210804");
	  		System.out.print(": ");
	  		reservationDate = myInput.nextInt();
	  		if(reservationDate == 20210703 || reservationDate == 20210704 || reservationDate == 20210710 || reservationDate == 20210711 || reservationDate == 20210717 
	  				|| reservationDate == 20210718 || reservationDate == 20210724 || reservationDate == 20210725 || reservationDate == 20210729 || reservationDate == 20210730 
	  				|| reservationDate == 20210731 || reservationDate == 20210801 || reservationDate == 20210802 || reservationDate == 20210803 || reservationDate == 20210807 
	  				|| reservationDate == 20210808 || reservationDate == 20210814 || reservationDate == 20210815 || reservationDate == 20210821 || reservationDate == 20210822 
	  				|| reservationDate == 20210828 || reservationDate == 20210829 || reservationDate == 20210903 || reservationDate == 20210906 || reservationDate == 20210907 
	  				|| reservationDate == 20210908 || reservationDate == 20210909 || reservationDate == 20210910 || reservationDate == 20210913 || reservationDate == 20210914 
	  				|| reservationDate == 20210915 || reservationDate == 20210916 || reservationDate == 20210917 || reservationDate == 20210923 || reservationDate == 20210924 
	  				|| reservationDate == 20210927 || reservationDate == 20210928 || reservationDate == 20210929 || reservationDate == 20210930 || reservationDate == 20211001 
	  				|| reservationDate == 20211004 || reservationDate == 20211005 || reservationDate == 20211006 || reservationDate == 20211007 || reservationDate == 20211008 
	  				|| reservationDate == 20211011 || reservationDate == 20211012 || reservationDate == 20211013 || reservationDate == 20211014 || reservationDate == 20211015 
	  				|| reservationDate == 20211018 || reservationDate == 20211019 || reservationDate == 20211020 || reservationDate == 20211021 || reservationDate == 20211022
	  				|| reservationDate == 20211025 || reservationDate == 20211026 || reservationDate == 20211027 || reservationDate == 20211028 || reservationDate == 20211029 
	  				|| reservationDate == 20211101 || reservationDate == 20211102 || reservationDate == 20211103 || reservationDate == 20211104 || reservationDate == 20211105 
	  				|| reservationDate == 20211108 || reservationDate == 20211109 || reservationDate == 20211110 || reservationDate == 20211111 || reservationDate == 20211112 
	  				|| reservationDate == 20211113 || reservationDate == 20211114 || reservationDate == 20211120 || reservationDate == 20211121 || reservationDate == 20211127 
	  				|| reservationDate == 20211128) {
	  			ticket = "B 티켓";
	  			break;
	  		} else if(reservationDate == 20210904 || reservationDate == 20210905 || reservationDate == 20210911 || reservationDate == 20210912 || reservationDate == 20210918
	  				|| reservationDate == 20210919 || reservationDate == 20210920 || reservationDate == 20210921 || reservationDate == 20210922 || reservationDate == 20210925
	  				|| reservationDate == 20210926 || reservationDate == 20211002 || reservationDate == 20211003 || reservationDate == 20211009 || reservationDate == 20211010
	  				|| reservationDate == 20211016 || reservationDate == 20211017 || reservationDate == 20211023 || reservationDate == 20211024 || reservationDate == 20211030
	  				|| reservationDate == 20211031 || reservationDate == 20211106 || reservationDate == 20211107) {
	  			ticket = "A 티켓";
	  			break;
	  		} else if(reservationDate == 20210628 || reservationDate == 20210629 || reservationDate == 20210630 || reservationDate == 20210701 || reservationDate == 20210702
	  				|| reservationDate == 20210705 || reservationDate == 20210706 || reservationDate == 20210707 || reservationDate == 20210708 || reservationDate == 20210709
	  				|| reservationDate == 20210712 || reservationDate == 20210713 || reservationDate == 20210714 || reservationDate == 20210715 || reservationDate == 20210716
	  				|| reservationDate == 20210719 || reservationDate == 20210720 || reservationDate == 20210721 || reservationDate == 20210722 || reservationDate == 20210723
	  				|| reservationDate == 20210726 || reservationDate == 20210727 || reservationDate == 20210728 || reservationDate == 20210804 || reservationDate == 20210805
	  				|| reservationDate == 20210806 || reservationDate == 20210809 || reservationDate == 20210810 || reservationDate == 20210811 || reservationDate == 20210812
	  				|| reservationDate == 20210813 || reservationDate == 20210816 || reservationDate == 20210817 || reservationDate == 20210818 || reservationDate == 20210819
	  				|| reservationDate == 20210820 || reservationDate == 20210823 || reservationDate == 20210824 || reservationDate == 20210825 || reservationDate == 20210826
	  				|| reservationDate == 20210827 || reservationDate == 20210830 || reservationDate == 20210831 || reservationDate == 20210901 || reservationDate == 20210902
	  				|| reservationDate == 20211115 || reservationDate == 20211116 || reservationDate == 20211117 || reservationDate == 20211118 || reservationDate == 20211119
	  				|| reservationDate == 20211122 || reservationDate == 20211123 || reservationDate == 20211124 || reservationDate == 20211125 || reservationDate == 20211126
	  				|| reservationDate == 20211129 || reservationDate == 20211130) {
	  			ticket = "C 티켓";
	  			break;
	  		} else {
	  			System.out.println("다시 입력해 주세요.");
	  			
	  		}
	  	}	
	}
	
	public static void inputID() {
		while(true) {
	  		System.out.print("주민등록번호 앞자리를 입력하세요. ex 9401115\n(0을 입력하면 첫 화면으로 돌아갑니다.)\n");
	  		System.out.print(": ");
	  		socialNumber = myInput.next();
	  		if(socialNumber.equals("0")) {break;} 
	  		else if(socialNumber.length() != 6) {System.out.println("다시 입력해 주세요.");
	  			} 
	  		else if(socialNumber.length() == 6) {
	  			birthMonth = Integer.parseInt(socialNumber.substring(2,4));
	  			birthDay = Integer.parseInt(socialNumber.substring(4,6));
	  			if((1 <= birthMonth && birthMonth <= 12) && (1 <= birthDay && birthDay <= 32)) {	
	  				break;} 
	  			else {
	  				System.out.println("다시 입력해 주세요.");
	  				;}
	  			} 
	  		else {break;}
	  	}
	}
	
	public static void inputAdvantage() {
		while(true) {
	  		System.out.println("우대사항을 선택하세요.\n(0을 입력하면 첫 화면으로 돌아갑니다.)");
	  		System.out.println("1. 없음 (나이 우대는 자동처리)");
	  		System.out.println("2. 장애인");
	  		System.out.println("3. 국가유공자");
	  		System.out.println("4. 다자녀");
	  		System.out.println("5. 임산부");
	  		System.out.print(": ");
	  		benefit = myInput.nextInt();
	  		if(0 <= benefit && benefit <=5 ) {break;} 
	  		else {
	  			System.out.println("다시 입력해 주세요.");
	  			}
	  	}
	}
	public static void checkBenefit() {
		switch(benefit) {
	  	case 1: b = "우대적용 없음"; break;
	  	case 2: b = "장애인 우대적용"; 
	  		if(ticket == "A 티켓") {
	  			if(age == "어른") {price = 36000;} 
	  			else if(age == "36개월미만") {price = 0;} 
	  			else {price = 28000;}
	  		} else if(ticket == "B 티켓") {
	  			if(age == "어른") {price = 33000;} 
	  			else if(age == "36개월미만") {price = 0;} 
	  			else {price = 26000;}
	  		} else {
	  			if(age == "어른") {price = 30000;} 
	  			else if(age == "36개월미만") {price = 0;} 
	  			else {price = 24000;}
	  		} break;
	  	case 3: b = "국가유공자 우대적용"; 
	  		if(ticket == "A 티켓") {
	  			if(age == "어른") {price = 30000;} 
	  			else if(age == "36개월미만") {price = 0;} 
	  			else {price = 24000;}
	  		} else if(ticket == "B 티켓") {
	  			if(age == "어른") {price = 28000;} 
	  			else if(age == "36개월미만") {price = 0;} 
	  			else {price = 22000;}
	  		} else {
	  			if(age == "어른") {price = 25000;} 
	  			else if(age == "36개월미만") {price = 0;} 
	  			else {price = 20000;}
	  		} break;
	  	case 4: b = "다자녀 우대적용"; 
	  		if(ticket == "A 티켓") {
	  			if(age == "어른" || age == "청소년") {price = 48000;} 
	  			else if(age == "36개월미만") {price = 0;} 
	  			else {price = 38000;}
	  		} else if(ticket == "B 티켓") {
	  			if(age == "어른" || age == "청소년") {price = 44000;} 
	  			else if(age == "36개월미만") {price = 0;} 
	  			else {price = 35000;}
	  		} else {
	  			if(age == "어른" || age == "청소년") {price = 40000;} 
	  			else if(age == "36개월미만") {price = 0;} 
	  			else {price = 32000;}
	  		} break;
	  	case 5: b = "임산부 우대적용"; 
	  		if(ticket == "A 티켓") {
	  			if(age == "36개월미만") {price = 0;} 
	  			else {price = 51000;}
	  		} else if(ticket == "B 티켓") {
	  			if(age == "36개월미만") {price = 0;} 
	  			else {price = 47000;}
	  		} else {
	  			if(age == "36개월미만") {price = 0;} 
	  			else {price = 42000;}
	  		} break;
	  		}
	}
	public static void clearAll() {
		arrTicket.clear();
    	arrAge.clear();
    	arrCount.clear();
    	arrPrice.clear();
    	arrB.clear();
	}
	
	public static void checkTicketType() {
		birthYear = Integer.parseInt(socialNumber.substring(0,2));
	  	birthDate = Integer.parseInt(socialNumber.substring(2,6));

	  	if(0 <= birthYear && birthYear <= 30) {birthYear += 2000;} 
	  	else {birthYear += 1900;}
	  	
	  	manAge = todayYear - birthYear;
	  	if(todayDate < birthDate) {manAge = manAge - 1;} 
	  	else {manAge = manAge + 0;}
	
	  	System.out.printf("만 %d\n", manAge);

	  	if((19 <= manAge) && (manAge <= 64 )) {age = "어른";	} 
	  	else if(65 <= manAge) {age = "경로";} 
	  	else if((3 <= manAge) && (manAge <= 12 )) {
	  		age = "어린이";
	  		if(ticket == "A 티켓") {price = 48000;} 
	  		else if(ticket == "B 티켓") {price = 44000;} 
	  		else {price = 40000;}} 
	  	else if(manAge < 3) {
	  		age = "36개월미만";
	  		price = 0;} 
	  	else {age = "청소년";}
	}
	
	public static void inputCount() {
		while(true) {
	  		System.out.println("몇개를 주문하시겠습니까?\n(0을 입력하면 첫 화면으로 돌아갑니다.)");
	  		System.out.print(": ");
	  		count = myInput.nextInt();
	  		if(count == 0) {break;} 
	  		else {break;}
	  	}
	}
	
	public static void inputAddOrder() {
		System.out.println("ㅡ");
	  	System.out.print("1. 추가구매 2. 구매완료\n");
	  	System.out.print(": ");
	  	add = myInput.nextInt();
	}
	
	public static void addToArrayListAll() {
		arrTicket.add(ticket);
	  	arrAge.add(age);
	  	arrCount.add(count);
	  	arrPrice.add(price);
	  	arrB.add(b);
	}
	
	public static void printData() {
		System.out.println("--");
		
		int sum=0;
		for(int i=0; i < arrTicket.size(); i++) {
			sum += arrPrice.get(i)*arrCount.get(i);
		}
		System.out.printf("총 %d 원 입니다.\n", sum);	
		System.out.println("감사합니다.");
		System.out.println();
		System.out.println("================= 에버랜드 =================");
		for(int i=0; i < arrTicket.size(); i++) {
		System.out.printf("%s\t%s\tX%d\t%d\t%s\n", arrTicket.get(i), arrAge.get(i), 
									arrCount.get(i), arrPrice.get(i)*arrCount.get(i), arrB.get(i));
		}
		System.out.println("==========================================");
		System.out.println();
		System.out.println("--------------------------------------");
		System.out.println();
		System.out.println();
	}
	
	public static void checkTicketPrice() {
		if(ticket == "A 티켓") {price = 60000;} 
	  	else if(ticket == "B 티켓") {price = 56000;} 
	  	else {price = 50000;}
	}
	
	public static void printToday() {
		todayYear = Integer.parseInt(today.substring(0,4));
	    todayDate = Integer.parseInt(today.substring(4,8));	 
	}
	
	public static void main(String[] args) {
		printToday();   
	    while(true ) {
	    	clearAll();
	    	do {
	    		inputDate();	    	  	
	    	  	checkTicketPrice();			
	    	  	System.out.println(ticket);
	    	  	System.out.println("ㅡ");
	    	  	inputID();	    	  	
	    	  	if (socialNumber.equals("0")) {} 	
	    	  	checkTicketType();
	    	  	System.out.println("ㅡ");					
	    	  	inputCount();			
	    	  	if(count == 0) {}    
	    	  	System.out.println("ㅡ");					
	    	  	inputAdvantage();	    	  	
	    	  	if(benefit == 0) {}			    	  	
	    	  	checkBenefit();	    	  	
	    	  	inputAddOrder();
	    	  	addToArrayListAll();
	    	} while(add == 1);		    	
			printData();			
			myInput.close();
			break;			
		}		
	}	
}


