/*	10���� �迭�� ����� ������ �� �ִ�, �ּ� �� ã��
 */
public class Exam_07 {
	public static void main(String[] args) {
		int score[] = {90,44,77,88,67,94,83,54,86,57};
		int max=score[0];
		int min=score[0];
		for(int x=1;x<score.length;x++) {
			if(max<score[x]) {
				max=score[x];
			}
			if(min>score[x]) {
				min=score[x];
			}
		}
		//���
		System.out.print("�Է��ڷ� : ");
		for(int i=0;i<score.length;i++) {
			System.out.print(score[i]+" ");
		}
		System.out.println("\nMAX : "+max+"\tMIN : "+min);
		
	}
}
