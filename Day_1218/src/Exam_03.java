import java.util.Scanner;

/*	��ȣ, �̸�, ����, ����, ���� ������ Ű����� �Է�
 * 	����, ���(�Ҽ��� �ι�° �ڸ����� �ݿø�)
 */
public class Exam_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("��ȣ : ");
		int num = sc.nextInt();
		System.out.print("�̸� : ");//����� �Է��ϸ� ��������
		String name = sc.next();
		System.out.print("���� : ");
		int kor = sc.nextInt();
		System.out.print("���� : ");
		int eng = sc.nextInt();
		System.out.print("���� : ");
		int mat = sc.nextInt();
		sc.close();
		int tot = kor+eng+mat;
		double avg = tot/3.;// ex)87.256-> 87.3
		avg = (int)(avg*10+0.5)/10.;
		
		System.out.println("��ȣ\t�̸�\t����\t���\t");
		System.out.println(num+"\t"+name+"\t"+tot+"\t"+avg);
	}

}
