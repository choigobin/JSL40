import java.util.Scanner;

/*	�� ���� ������ Ű����� �Է� -> ��,��,�� ���
 * 	��, ������ ���� ����.
 */
public class Exam_10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ� : ");
		int a = s.nextInt();
		System.out.print("������ �Է��Ͻÿ� : ");
		int b = s.nextInt();
		System.out.print("������ �Է��Ͻÿ� : ");
		int c = s.nextInt();
		int max,me,min;
		
		/*
		if(a>b) {
			if(a>c) {
				max=a;
				if(b>c) {
					me=b;min=c;
				}else {
					me=c;min=b;
				}
			}else {
				max=c;me=a;min=b;
			}
		}else {
			if(b>c) {
				max=b;
				if(a>c) {
					me=a;min=c;
				}else {
					me=c;min=a;
				}
			}else {
				max=c;me=b;min=a;
			}
		}
		*/
		
		if(a>b && a>c) {
			max=a;
			if(b>c) {
				me=b;min=c;
			}else {
				me=c;min=b;
			}
		}else {
			if(b>c) {
				max=b;
				if(a>c) {
					me=a;min=c;
				}else {
					me=c;min=a;
				}
			}else {
				max=c;
				if(a>b) {
					me=a;min=b;
				}else {
					me=b;min=a;
				}
			}
		}
		
		System.out.println("MAX = "+max);
		System.out.println("ME = "+me);
		System.out.println("MIN = "+min);
	}

}
