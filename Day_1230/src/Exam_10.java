import java.util.Scanner;

/*	�� ���� ���� �� ��,��,�� ã��
 * 	1. ���� ū �� ã��
 * 	2. ���� ���� �� ã��
 * 	���� ������ (���ǽ�) ? ��: ����;
 */
public class Exam_10 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("����1 :");
		int a = scn.nextInt();
		System.out.print("����2 :");
		int b = scn.nextInt();
		System.out.print("����3 :");
		int c = scn.nextInt();
		scn.close();
		
		int max = (a>b) ? a : b;
		max= (max>c) ? max : c;
		
		System.out.println("max : "+max);
		
	}
}
