import java.util.Scanner;

public class �迭_�ǽ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myInput = new Scanner(System.in);
		String[] name = new String[100];
		int[] englishScore = new int[100];
		int[] mathScore = new int[100];
		int count = 0;
		int type;
		int totalScore = 0, avg = 0, englishAvg = 0, mathAvg = 0;
		float engAveScore = 0, mathAveScore = 0;
		int engTotalScore = 0, mathTotalScore = 0;
		
		do {
			System.out.println("�̸��� �Է��ϼ���.");
			name[count] = myInput.next();
			System.out.println("���� ������ �����Դϱ�?");
			englishScore[count] = myInput.nextInt();
			engTotalScore = engTotalScore + englishScore[count];
			System.out.println("���� ������ �����Դϱ�?");
			mathScore[count] = myInput.nextInt();
			mathTotalScore = mathTotalScore + mathScore[count];
			System.out.println("�߰� �Է� �Ͻðڽ��ϱ�?\n1. �߰� 2. ����");
			type = myInput.nextInt();
			count++;

		} while (type == 1);

		for (int index = 0; index < count; index++) {
			totalScore = mathScore[index] + englishScore[index];
			avg = totalScore / 2;
			System.out.println("\n�̸�\t��������\t��������\t����\t���\n");
			System.out.printf("%s\t%d\t%d\t%d\t%d\n", name[index],
					englishScore[index], mathScore[index], totalScore, avg);
		
		engAveScore = engTotalScore / count;
		mathAveScore = mathTotalScore / count;
		System.out.printf("����\t%d\t%d\n", engTotalScore, mathTotalScore);
		System.out.printf("���\t%5.2f\t%5.2f\n", engAveScore ,  mathAveScore);	
	}
	}


}

