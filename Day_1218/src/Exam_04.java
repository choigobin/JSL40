import java.util.Scanner;

/*	(����)��ȣ, �̸�, ����, ����, ���� ������ Ű����� �Է�(������ �Ҽ��� ù°�ڸ����� �Է°���)
 * 	����, ���(�Ҽ��� ����° �ڸ����� �ݿø�)
 */
public class Exam_04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("��ȣ : ");
		int num = s.nextInt();
		System.out.print("�̸� : ");//����� �Է��ϸ� ��������
		String name = s.next();
		System.out.print("���� : ");
		double kor = s.nextDouble();
		System.out.print("���� : ");
		double eng = s.nextDouble();
		System.out.print("���� : ");
		double mat = s.nextDouble();
		s.close();
		double tot = kor+eng+mat;
		double avg = tot/3.;// ex)87.256-> 87.26
		avg = (int)(avg*100+0.5)/100.;
		
		System.out.println("��ȣ\t�̸�\t����\t���\t");
		System.out.println(num+"\t"+name+"\t"+tot+"\t"+avg);
	}

}