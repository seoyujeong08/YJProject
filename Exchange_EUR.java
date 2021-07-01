import java.util.Scanner;

public class Exchange_EUR {

	public final double EXCHANGE_RATE_EUR = 1346.23;
	public double euroResult;
	public int won, exchange = 0;
	public int name;

	public void EUR_Exchange() {
		if (name == 2) {
			double euroResult;

			euroResult = (int) (won / EXCHANGE_RATE_EUR);
			exchange = (int) (won % EXCHANGE_RATE_EUR) / 10 * 10;
			Scanner myInput = new Scanner(System.in);
			myInput.nextLine();
			System.out.print("환전한 유로는 총" + euroResult + "유로입니다.");
			System.out.println("거스름돈은" + exchange + "원입니다.");

			int eur500, eur200, eur100, eur50, eur20, eur10, eur5;

			eur500 = (int) euroResult / 500;
			euroResult = euroResult - eur500 * 500;
			eur200 = (int) euroResult / 200;
			euroResult = euroResult - eur200 * 200;
			eur100 = (int) euroResult / 100;
			euroResult = euroResult - eur100 * 100;
			eur50 = (int) euroResult / 50;
			euroResult = euroResult - eur50 * 50;
			eur20 = (int) euroResult / 50;
			euroResult = euroResult - eur50 * 50;  
			
			 
			
			eur10 = (int) euroResult / 10;
			euroResult = euroResult - eur10 * 10;
			eur5 = (int) euroResult / 5;
			euroResult = euroResult - eur5 * 5;

			System.out.printf("500유로 : %d장\n", eur500);
			System.out.printf("200유로 : %d장\n", eur200);
			System.out.printf("100유로 : %d장\n", eur100);
			System.out.printf("50유로 : %d장\n", eur50);
			System.out.printf("20유로 : %d장\n", eur20);
			System.out.printf("10유로 : %d장\n", eur10);
			System.out.printf("5유로 : %d장\n", eur5);
		}

	}
}