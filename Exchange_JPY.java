import java.util.Scanner;

public class Exchange_JPY {

	public final double EXCHANGE_RATE_JPY = 10.25;
	public double jpyResult;
	public int won, exchange = 0;
	public int name;

	public void JPY_Exchange() {
		if (name == 3) {
			double jpyResult;
			jpyResult = (int) (won / EXCHANGE_RATE_JPY);
			exchange = (int) (won % EXCHANGE_RATE_JPY) / 10 * 10;
			Scanner myInput = new Scanner(System.in);
			myInput.nextLine();
			System.out.print("환전한 엔화는 총" + jpyResult + "엔입니다.");
			System.out.println("거스름돈은" + exchange + "원입니다.");

			int jpy10000, jpy5000, jpy1000, jpy500, jpy100, jpy50, jpy10;

			jpy10000 = (int) jpyResult / 10000;
			jpyResult = jpyResult - jpy10000 * 10000;
			jpy5000 = (int) jpyResult / 5000;
			jpyResult = jpyResult - jpy5000 * 5000;
			jpy1000 = (int) jpyResult / 1000;
			jpyResult = jpyResult - jpy1000 * 1000;
			jpy500 = (int) jpyResult / 500;
			jpyResult = jpyResult - jpy500 * 500;
			jpy100 = (int) jpyResult / 100;
			jpyResult = jpyResult - jpy100 * 100;
			jpy50 = (int) jpyResult / 50;
			jpyResult = jpyResult - jpy50 * 50;
			jpy10 = (int) jpyResult / 10;
			jpyResult = jpyResult - jpy10 * 10;

			System.out.printf("10000엔 : %d장\n", jpy10000);
			System.out.printf("5000엔 : %d장\n", jpy5000);
			System.out.printf("1000엔 : %d장\n", jpy1000);
			System.out.printf("500엔 : %d장\n", jpy500);
			System.out.printf("100엔 : %d장\n", jpy100);
			System.out.printf("50엔 : %d장\n", jpy50);
			System.out.printf("10엔 : %d장\n", jpy10);
		}

	}
}