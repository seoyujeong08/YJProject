import java.util.Scanner;

public class 배열_실습2 {

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
			System.out.println("이름을 입력하세요.");
			name[count] = myInput.next();
			System.out.println("영어 점수는 몇점입니까?");
			englishScore[count] = myInput.nextInt();
			engTotalScore = engTotalScore + englishScore[count];
			System.out.println("수학 점수는 몇점입니까?");
			mathScore[count] = myInput.nextInt();
			mathTotalScore = mathTotalScore + mathScore[count];
			System.out.println("추가 입력 하시겠습니까?\n1. 추가 2. 종료");
			type = myInput.nextInt();
			count++;

		} while (type == 1);

		for (int index = 0; index < count; index++) {
			totalScore = mathScore[index] + englishScore[index];
			avg = totalScore / 2;
			System.out.println("\n이름\t영어점수\t수학점수\t총점\t평균\n");
			System.out.printf("%s\t%d\t%d\t%d\t%d\n", name[index],
					englishScore[index], mathScore[index], totalScore, avg);
		
		engAveScore = engTotalScore / count;
		mathAveScore = mathTotalScore / count;
		System.out.printf("총점\t%d\t%d\n", engTotalScore, mathTotalScore);
		System.out.printf("평균\t%5.2f\t%5.2f\n", engAveScore ,  mathAveScore);	
	}
	}


}

