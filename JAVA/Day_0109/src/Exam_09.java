/*	이차원 배열
 * 
 */
public class Exam_09 {
	public static void main(String[] args) {
		int score[][] = { { 1, 90, 78, 79, 0, 1 }, { 5, 95, 80, 70, 0, 1 }, 
			{ 2, 79, 88, 77, 0, 1 },{ 4, 75, 88, 77, 0, 1 }, { 3, 95, 88, 75, 0, 1 }};

		// 입력자료 출력
		System.out.println("번호\t국어\t영어\t수학");
		for (int x = 0; x < score.length; x++) {
			for (int y = 0; y < score[x].length - 2; y++) {
				System.out.print(score[x][y] + "\t");
			}
			System.out.println();
		}
		// 총점 계산
		for (int x = 0; x < score.length; x++) {
			for (int y = 1; y < 4; y++) {
				score[x][4] += score[x][y];
			}
		}
		// 석차 계산
		for(int x=0; x<score.length; x++) {
			for(int y=0; y<score.length; y++) {
				if(score[x][4]<score[y][4]) { //총점 기준
					score[x][5]++;
				}
			}
		}
		
		// 번호기준 오름차순 정렬
		for (int x = 0; x < score.length - 1; x++) {
			for (int y = x + 1; y < score.length; y++) {
				if (score[x][0] > score[y][0]) {
					int[] temp = new int[6];
					for (int z = 0; z < 6; z++) {
						temp[z] = score[x][z];
						score[x][z] = score[y][z];
						score[y][z] = temp[z];
					}
				}
			}
		}

		// 출력자료 출력
		System.out.println("번호\t국어\t영어\t수학\t총점\t석차");
		for (int x = 0; x < score.length; x++) {
			for (int y = 0; y < score[x].length; y++) {
				System.out.print(score[x][y] + "\t");
			}
			System.out.println();
		}

	}
}