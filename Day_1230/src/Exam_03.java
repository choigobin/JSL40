import java.util.Scanner;

/*	Ű����� ���� 2�� �Է� ũ�� ���ϱ�
 * 	
 */
public class Exam_03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("����1 :");
		int a = scn.nextInt();
		System.out.print("����2 :");
		int b = scn.nextInt();
		scn.close();
		if(a>b) System.out.println("a>b"); //������ 1���� ��
		if(a<b)
			System.out.println("a<b"); //������ 1���� ��
		if(a==b) {
			System.out.println("a==b");
		}
		
		
		
	}
}
