import java.util.Scanner;

/*	�� ���� ���� �� ��,��,�� ã��
 * 	1. ���� ū �� ã��
 * 	2. ���� ���� �� ã��
 * 	���� ������ (���ǽ�) ? ��: ����;
 */
public class Exam_11 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("����1 :");
		int a = scn.nextInt();
		System.out.print("����2 :");
		int b = scn.nextInt();
		System.out.print("����3 :");
		int c = scn.nextInt();
		scn.close();
		
		int max=0, med=0, min=0;
		if(a>b) {
			if(a>c) {
				max=a;
				if(b>c) {
					med=b;
					min=c;
				}else {
					max=c;
					med=a;
					min=b;
				}
			}
		}else {
			if(b>c) {
				max=b;
				if(a>c) {
					med=a;
					min=c;
				}else {
					med=c;
					min=a;
				}
			}else {
				max=c;
				med=b;
				min=a;
			}
		}
		
		System.out.println("max : "+max);
		System.out.println("med : "+med);
		System.out.println("min : "+min);
	}
}
