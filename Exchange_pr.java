import java.util.Scanner;

public class Exchange_pr {

	public static void main(String[] args) {

		Scanner myInput = new Scanner(System.in);
		int won = 0, name = 0;

		Exchange_USD USDprocess = new Exchange_USD();
		Exchange_EUR EURprocess = new Exchange_EUR();
		Exchange_JPY JPYprocess = new Exchange_JPY();
		Exchange_KOR KORprocess = new Exchange_KOR();

		while (true) {
			System.out.print("환전할 원화는? : ");
			won = myInput.nextInt();
			System.out.print("USD(1), EUR(2), JPY(3)를 선택해주세요.");
			name = myInput.nextInt();

			if (name == 1) {
				USDprocess.USD_Exchange();
			} else if (name == 2) {
				EURprocess.EUR_Exchange();
			} else if (name == 3) {
				JPYprocess.JPY_Exchange();
			}
			KORprocess.KOR_Exchange();
			break;
		}

	}

}
