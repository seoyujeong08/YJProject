public class Exchange_KOR {
	
	public int won, exchange = 0;
	
	public void KOR_Exchange() {
	int exchange1000, exchange500, exchange100,
	exchange50, exchange10;
	
	exchange1000 = exchange / 1000;
	exchange = exchange - exchange1000 * 1000;
	exchange500 = exchange / 500;
	exchange = exchange - exchange500 * 500;
	exchange100 = exchange / 100;
	exchange = exchange - exchange100 * 100;
	exchange50 = exchange / 50;
	exchange = exchange - exchange50 * 1000;
	exchange10 = exchange / 10;
	exchange = exchange - exchange10 * 10;

	System.out.printf("1,000�� : %d��\n", exchange1000);
	System.out.printf("500�� : %d��\n", exchange500);
	System.out.printf("100�� : %d��\n", exchange100);
	System.out.printf("50�� : %d��\n", exchange50);
	System.out.printf("10�� : %d��\n", exchange10);

}
}