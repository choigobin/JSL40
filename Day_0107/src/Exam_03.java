import java.util.Scanner;

/*	Ű���� �Է�(1~100) �ִ� 10�� �Է�
 * 	 ¦���� ���
 */
public class Exam_03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		/*
		for(int x=0; x<10; x++) {
			System.out.print("�Է� : ");
			int a=scn.nextInt();
			if(a%2==0) {
				System.out.println(a);
			}
		}
		*/
		int val[] = new int[10];
		//�Է��۾�
		for(int x=0; x<10; x++) {
			System.out.print("�Է� : ");
			int a=scn.nextInt(); // a�� �˻��ؼ� ���ǿ� ���� ��쿡 �迭�� ���� ��
			val[x] = a; 
			//val[x] = scn.nextInt(); //�ٷ� �ֱ�
		}
		scn.close();
		//���
		System.out.print("�Է��ڷ� : ");
		for (int i=0; i<10; i++) {
			System.out.print(val[i]+"\t");
		}
		System.out.print("\n¦�� : ");
		for (int i=0; i<10; i++) {
			if(val[i]%2==0) {
				System.out.print(val[i]+"\t");
			}
		}
		
	}
}
