import java.util.Scanner;

/*	���� 2�� �Է�
 * 	�� ���� ���̰� 10�̻��̸� 
 * 	ū ���� -5, ���� ���� +5
 */
public class Exam_04 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("����1 :");
		int a = scn.nextInt();
		System.out.print("����2 :");
		int b = scn.nextInt();
		scn.close();
		System.out.println("a = " +a);
		System.out.println("b = " +b);
		/*
		if(a>=b+10) {
			a=a-5;b=b+5;
		}
		if(b>=a+10) {
			a=a+5;b=b-5;
		}
		*/
		// �� �� ���� ���
		int c;
		if(a>=b) {
			c=a-b;
		}else {
			c=b-a;
		}
		if(c>=10) {
			if(a>b) {
				a = a-5;
				b = b+5;
			}else {
				a = a+5;
				b = b-5;
			}
		}
		System.out.println("a' = " +a);
		System.out.println("b' = " +b);
		
	}
}
