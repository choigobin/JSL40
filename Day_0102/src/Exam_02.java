import java.util.Scanner;

/*	Ű����� ������ �Է�
 * 	1. �Է��ڷ�� 1 ~ 100 ������ ����
 * 	2. �Է��ڷ� ��  7�� ����� �հ�� ����� ���Ͽ� ���
 * 	3. ��ü�ڷ�(��������)�� 20���̸� ���α׷��� ����.
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
 * 
 * 		�Է� �ڷ� 20�� �� ������(%) : xx %
 * 		�Է� �ڷ� 20�� �� 7�� �����(%) : xx %
 * 		7�� ��� �հ� : xxx
 * 		7�� ��� ��� : xx.xx
 */
public class Exam_02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x,cnt=0,sum=0,cnt_7=0,err=0;
		do {
			System.out.print("�Է� �ڷ�  : ");
			x = scn.nextInt();
			cnt++;
			if(x>0 && x<101) {
				if(x%7==0) {
					cnt_7++;
					sum+=x;
				}
			}else {
				System.out.println("error �Է� ������ �ƴ�");
				err++;
			}
		}while(cnt<20);
		scn.close();
		System.out.println("�Է� �ڷ� 20�� �� ������(%) : "+(err*5)+"%");
		System.out.println("�Է� �ڷ� 20�� �� 7�� �����(%) : "+(cnt_7*5)+"%");
		System.out.println("7�� ��� �հ� : "+sum);
		System.out.println("7�� ��� ��� : "+(int)((double)sum/cnt_7*100+0.5)/100.);
	}
}
