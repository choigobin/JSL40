import java.util.Scanner;

/*	���� 2�� �Է� ũ�� ���ϱ�
 *	ex) 79, 88 �Է½�
 *	 => 79<88
 *		
 *		70, 60 �Է½�
 *	 => 70>60
 */

public class Exam_05 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("����a�� �Է��Ͻÿ� : ");
		int a = s.nextInt();
		System.out.print("����b�� �Է��Ͻÿ� : ");
		int b = s.nextInt();
		
		if(a>b) {
			System.out.println(a+">"+b);
		}else if(a==b){
			System.out.println(a+"="+b);
		}else {
			System.out.println(a+"<"+b);
		}
		
	}

}
