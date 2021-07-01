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
			System.out.print("환전한 달러는 총" + usdResult + "달러입니다.");
			System.out.println("거스름돈은" + exchange + "원입니다.");

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
			System.out.printf("100달러 : %d장\n", usd100);
			System.out.printf("50달러 : %d장\n", usd50);
			System.out.printf("20달러 : %d장\n", usd20);
			System.out.printf("10달러 : %d장\n", usd10);
			System.out.printf("5달러 : %d장\n", usd5);
			System.out.printf("2달러 : %d장\n", usd2);
			System.out.printf("1달러 : %d장\n", usd1);
		}

	}
}