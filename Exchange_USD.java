import java.util.Scanner;

public class Exchange_USD {

	public final double EXCHANGE_RATE_USD = 1131.80;
	public int won, exchange = 0;
	public double usdResult;
	public int name;

	public void USD_Exchange() {
		if (name == 1) {
			usdResult = (int) (won / EXCHANGE_RATE_USD);
			exchange = (int) (won % EXCHANGE_RATE_USD) / 10 * 10;
			Scanner myInput = new Scanner(System.in);
			myInput.nextLine();
			System.out.print("ȯ���� �޷��� ��" + usdResult + "�޷��Դϴ�.");
			System.out.println("�Ž�������" + exchange + "���Դϴ�.");

			int usd100, usd50, usd20, usd10, usd5, usd2, usd1;
			usd100 = (int) usdResult / 100;
			usdResult = usdResult - usd100 * 100;
			usd50 = (int) usdResult / 50;
			usdResult = usdResult - usd50 * 50;
			usd20 = (int) usdResult / 20;
			usdResult = usdResult - usd20 * 20;
			usd10 = (int) usdResult / 10;
			usdResult = usdResult - usd10 * 10;
			usd5 = (int) usdResult / 5;
			usdResult = usdResult - usd5 * 5;
			usd2 = (int) usdResult / 2;
			usdResult = usdResult - usd2 * 2;
			usd1 = (int) usdResult / 1;
			usdResult = usdResult - usd1 * 1;
			System.out.printf("100�޷� : %d��\n", usd100);
			System.out.printf("50�޷� : %d��\n", usd50);
			System.out.printf("20�޷� : %d��\n", usd20);
			System.out.printf("10�޷� : %d��\n", usd10);
			System.out.printf("5�޷� : %d��\n", usd5);
			System.out.printf("2�޷� : %d��\n", usd2);
			System.out.printf("1�޷� : %d��\n", usd1);
		}

	}
}