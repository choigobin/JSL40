import java.util.Scanner;

/*	��ȣ, �̸�, ����, ����, ���� ������ Ű����� �Է�
 * 	����, ���(�Ҽ��� �ι�° �ڸ����� �ݿø�)
 */
public class Exam_03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("��ȣ : ");
		int num = s.nextInt();
		System.out.print("�̸� : ");//����� �Է��ϸ� ��������
		String name = s.next();
		System.out.print("���� : ");
		int kor = s.nextInt();
		System.out.print("���� : ");
		int eng = s.nextInt();
		System.out.print("���� : ");
		int mat = s.nextInt();
		
		int tot = kor+eng+mat;
		double avg = tot/3.;// ex)87.256-> 87.3
		avg = (int)(avg*10+0.5)/10.;
		
		System.out.println("��ȣ\t�̸�\t����\t���\t");
		System.out.println(num+"\t"+name+"\t"+tot+"\t"+avg);
	}

}
