import java.util.Scanner;

/*	Ű����� 10���� ���� data �Է�
 * 	�հ踦 ���
 */
public class Exam_07 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int sum = 0; //������ �ʱ�ȭ �ʿ�
		int x; // ������ �ʱ�ȭ ����
		for(int i=0;i<10;i++) {
			System.out.print("���� �Է� = ");
			//int x = scn.nextInt();// ��� ���� ������� => �޸� ��� ��Ƹ��� => 
			//������ �ڹٴ� gc(Garbage Collection)���� �����ʴ� �޸� �ڵ� ���� 
			x = scn.nextInt(); //�޸� 1���� ��
			sum+=x;
		}
		scn.close();
		System.out.println("�հ� = "+sum);
		
		
	}
}
