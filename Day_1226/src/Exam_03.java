import java.util.Scanner;

public class Exam_03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); //new ������ => ��ü ����
		//Scanner => ������, ��ġ����
		int a = 10;
		System.out.print("������ �Է��Ͻÿ� : ");
		a=scn.nextInt();//����=>���� �Է����� �Ѿ
		System.out.print("�Ǽ��� �Է��Ͻÿ� : ");
		double b = scn.nextDouble();
		System.out.print("���ڿ��� �Է��Ͻÿ� : ");
		String c = scn.next();//���� �νľȵ�
		System.out.print("���ڿ��� �Է��Ͻÿ� : ");
		String d = scn.nextLine();// �� �� ��°�� ���鵵 �ν�
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		System.out.println("d = "+d);
		System.out.println("scn = "+scn);
		
		
		
		
		
	}
}
