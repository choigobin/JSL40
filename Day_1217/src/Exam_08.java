import java.util.Scanner;

/*	��ȣ, �̸�, ��������, ��������, ����������
 * 	�Է¹޾Ƽ� ����, ����� ����Ͽ� ���
 */
public class Exam_08 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("��ȣ : ");
		int bun = scn.nextInt();
		
		System.out.println("�̸� : ");
		String name = scn.next();
		
		System.out.println("�������� : ");
		int kor = scn.nextInt();

		System.out.println("�������� : ");
		int mat = scn.nextInt();

		System.out.println("�������� : ");
		int eng = scn.nextInt();
		
		int tot = kor+mat+eng;
		double avg = tot/3.;
		scn.close();
		System.out.println("��ȣ\t�̸�\t��������\t��������\t��������\t����\t���");
		System.out.println(bun+"\t"+name+"\t"+kor+"\t"+mat+"\t"+eng+"\t"+tot+"\t"+avg);
	}

}
