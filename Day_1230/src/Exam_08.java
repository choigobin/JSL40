import java.util.Scanner;

/*	�� ���� ���� �� ��,��,�� ã��
 * 	1. ���� ū �� ã��
 * 	2. ���� ���� �� ã��
 */
public class Exam_08 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("����1 :");
		int a = scn.nextInt();
		System.out.print("����2 :");
		int b = scn.nextInt();
		System.out.print("����3 :");
		int c = scn.nextInt();
		scn.close();
		int max = 0;
		if(a>b) {
			if(a>c) {
				max=a;
			}else {
				max=c;
			}
		}else {
			if(b>c) {
				max=b;
			}else {
				max=c;
			}
		}
		
		System.out.println("max : "+max);
		
	}
}
