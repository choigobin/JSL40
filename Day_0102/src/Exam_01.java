import java.util.Scanner;

/*	Ű����� ������ �Է�
 * 	1. �Է��ڷ�� 1 ~ 100 ������ ����
 * 	2. �Է��ڷ� �� 3�� ����̸鼭 7�� ����� �հ�� ����� ���Ͽ� ���
 * 	3. �Է��ڷᰡ 7���̸� ���α׷��� ����.
 * 	4. �Է� ����
 * 		�Է��ڷ� : 0
 * 		"error �Է� ������ �ƴ�"
 * 		�Է��ڷ� : 8
 * 		�Է��ڷ� : 77
 * 		�Է��ڷ� : 200
 * 		"error �Է� ������ �ƴ�"
 * 		�Է��ڷ� : 88
 * 			.	.	.
 * 			.	.	.
 * 		�Է��ڷ� : 88
 * 		�� �� : xxx
 * 		�� �� : xx.xx
 */
public class Exam_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x,cnt=0,sum=0,za=0;
		while(cnt<7) {
			System.out.print("�Է� �ڷ� : ");
			x = scn.nextInt();
			if(x>0 && x<101) {
				cnt++;
				if(x%3==0 && x%7==0) {
					sum+=x;
					za++;
				}
			}else {
				System.out.println("error �Է� ������ �ƴ�");
			}
		}
		scn.close();
		System.out.println("�� �� : "+sum);
		System.out.println("�� �� : "+((double)sum/za));
		
		
	}
}
