import java.util.Scanner;

/*	if(���ǽ�){ //��
 * 		����1;
 * 	}else{ //����
 * 		����2;
 * 	}
 * 	����3;
 * 
 * 	���� : Ű����� ������ �Է� �޾Ƽ� 85 �̻��̸� "�հ�" �ƴϸ� "���հ�" ���
 */
public class Exam_04 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int score = s.nextInt();
		
		String pass="";
		if(score>=85) {
			//System.out.println("�հ�");
			pass = "�հ�";
		}else {
			//System.out.println("���հ�");
			pass = "���հ�";
		}
		System.out.println("��� : "+pass);
	}

}
