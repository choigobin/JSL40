import java.util.Scanner;

/*	������� ��� ���α׷� �ۼ�
 * 	Ű����� ������ȣ, �����ð�(��)�� �Է�
 * 	��)	������ȣ : 1234
 * 		�����ð� : 42
 * 		������� ���
 * 		������ȣ	���
 * 		1234	1500��
 * 	-�������� �ð��� �ִ� �Ϸ�(24�ð�)(1440��)
 * 	-��������� 10�й̸� ����, 30�б��� 500��,30�� ���ĺ��ʹ� 10�д� 500�� ���
 * 	-�Ϸ���������� �ִ� 30000���� ¡���Ѵ�.
 */
public class Exam_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ȣ : ");
		int car = sc.nextInt();
		System.out.print("�����ð� : ");
		int min = sc.nextInt();
		sc.close();
		int fee=0;
		if(min>=10 && min<=30) {
			fee=500;
		}else {
			min-=21;
			fee+=(min/10)*500+500;
			if(fee>30000) fee=30000;
		}
		System.out.println("������ȣ\t���");
		System.out.println(car+"\t"+fee+"��");
		
	}
}
