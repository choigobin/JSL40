import java.util.Scanner;

/*	Ű���� �Է�
 * 	��ȣ : 
 * 	���� : 
 * 	���� : 
 * 	���� : 
 * 
 * 	���
 * 	��ȣ	����	����	����	����	���	����
 * 	
 * 	ó������ :
 * 	���� = ����+����+����
 * 	��� = ����/3.
 * 	���� : ����� 60�̻��̰� 3���� ��� 40�̻� �� �� "�հ�"
 * 	1���� �̶� 40�̾��̸� "����"
 * 	3���� ��� 40�̻��̳� ����� 60�̸��̸� "���հ�"
 */
public class Exam_07 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("��ȣ : ");
		int num = s.nextInt();
		System.out.print("���� : ");
		int kor = s.nextInt();
		System.out.print("���� : ");
		int eng = s.nextInt();
		System.out.print("���� : ");
		int mat = s.nextInt();
		int tot = kor+eng+mat;
		double avg = tot/3.;
		avg = (int)(avg*100+0.5)/100.;
		String pass = "";
		/*
		if(kor>=40 && eng>=40 && mat>=40) {
			if(avg>=60) {
				pass = "�հ�";
			}else {
				pass = "���հ�";
			}
		}else {
			pass = "����";
		}
		*/
		
		if(kor>=40&&eng>=40&&mat>=40&&avg>=60) {
			pass = "�հ�";
		}else {
			if(avg<60) {
				pass="���հ�";
			}else {
				pass="����";
			}
		}
		
		System.out.println("\t��ȣ\t����\t����\t����\t����\t���\t����");
		System.out.println("\t"+num+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+avg+"\t"+pass);
	}

}
