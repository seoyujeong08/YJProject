package test6_2;

import java.util.Scanner;

public class test6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner(System.in);

		while (true) {
		System.out.println("\n�̿� ��¥�� �Է����ּ���. (ex 2021 06 05)");
		int year, month, day = 0;
		year = myInput.nextInt();
		month = myInput.nextInt();
		day = myInput.nextInt();

		int ticketA = 60000, ticketB = 56000, ticketC = 50000;
		int ticket6A;
		// 6, 7������ B, 8, 9������ A, 10, 11������ C
		if (month == 6) {
			month = ticketB;
			System.out.println("B Ƽ���� ���õǾ����ϴ�."); 
		} else if (month == 7) {
			month = ticketB;
			System.out.println("B Ƽ���� ���õǾ����ϴ�."); 
		} else if (month == 8) {
			month = ticketA;
			System.out.println("A Ƽ���� ���õǾ����ϴ�.");  
		} else if (month == 9) {
			month = ticketA;
				System.out.println("A Ƽ���� ���õǾ����ϴ�.");
		} else if (month == 10) {
			month = ticketC;
				System.out.println("C Ƽ���� ���õǾ����ϴ�."); 
		} else if (month == 11) {
			month = ticketC;
				System.out.println("C Ƽ���� ���õǾ����ϴ�."); 
		}
		
		System.out.println("\n��������� �Է����ּ���. (ex 19951222)");
		// ����, ���
		int age;
		age = myInput.nextInt();
		if (age <= 19561231) {
			System.out.println("��� ������ �ڵ� ���õǾ����ϴ�.\n");
			age = month - 20000;
		} else if (age >= 20091231) {
			age = month - 20000;
			System.out.println("���� ����� ����˴ϴ�.\n");
		} else if (age <= 20091231) {
		}
		System.out.println("�� ���� �ֹ��Ͻðڽ��ϱ�?");
		int orderTicket;
		orderTicket = myInput.nextInt();
		System.out.printf("\n%d ���� �ֹ��ϼ̽��ϴ�.\n", orderTicket);
		
		System.out.println("\n�������� �����ϼ���. \n1. ���� (��� ���� �ڵ�ó���˴ϴ�.)\n"
				+ "2. ����� \n3. ���������� \n4. ���ڳ� \n5. �ӻ��");
		int number, price = 0;
		number = myInput.nextInt();
		if (age <= 19561231) {
			System.out.printf("��ο�밡�� ����˴ϴ�. \n������ %d �� �Դϴ�. �����մϴ�.", orderTicket * age);
			price = orderTicket * age;
		} else if (age >= 20091231) {
			System.out.printf("������ %d �� �Դϴ�. �����մϴ�.", orderTicket * age);
			price = orderTicket * age;
		} else if (number ==1) {
			System.out.printf("������ %d �� �Դϴ�. �����մϴ�.", orderTicket * month);
		} else if (number ==2) {
			number = month - 20000;
			System.out.printf("����� ��밡�� ����˴ϴ�. \n������ %d �� �Դϴ�. �����մϴ�.", orderTicket * number);
			price = orderTicket * number;
		} else if (number ==3) {
			number = month - 40000;
			System.out.printf("���������� ��밡�� ����˴ϴ�. \n������ %d �� �Դϴ�. �����մϴ�.", orderTicket * number);
			price = orderTicket * number;
		} else if (number ==4) {
			number = month - 20000;
			System.out.printf("���ڳ� ��밡�� ����˴ϴ�. \n������ %d �� �Դϴ�. �����մϴ�.", orderTicket * number);
			price = orderTicket * number;
		} else if (number ==5) {
			number = month - 20000;
			System.out.printf("�ӻ�� ��밡�� ����˴ϴ�. \n������ %d �� �Դϴ�. �����մϴ�.", orderTicket * number);
			price = orderTicket * number;
			}
		
		if (age <= 20091231) {
		System.out.println("\n==============��������==============");
		System.out.printf("%d   ����   x%d    %d    \n", month, orderTicket, price);
	    } else if (age >= 20091231) {
	    	System.out.println("\n==============��������==============");
			System.out.printf("%d   ����   x%d    %d    \n", month, orderTicket, price);
	    }
}

}
}
// ���������ڵ�...........................................��