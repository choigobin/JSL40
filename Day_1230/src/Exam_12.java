import java.util.Scanner;

/*	�� ���� ���� �� ��,��,�� ã��
 * 	1. ���� ū �� ã��
 * 	2. ���� ���� �� ã��
 * 	���� ������ (���ǽ�) ? ��: ����;
 */
public class Exam_12 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("����1 :");
		int a = scn.nextInt();
		System.out.print("����2 :");
		int b = scn.nextInt();
		System.out.print("����3 :");
		int c = scn.nextInt();
		scn.close();
		
		if(a<b) {
			int imsi = a;
			a=b;
			b=imsi;
		}
		if(a<c ) {
			int imsi = a;
			a=c;
			c=imsi;
		}
		if(b<c) {
			int imsi = b;
			b=c;
			c=imsi;
		}
		System.out.println("max = "+a+" med = "+b+" min = "+c);
		
		
	}
}
