import java.util.Scanner;

/*	Ű����� ���� �Է�
 * 	1. �Է� ���� (2 ~ 100)
 * 	2. �Էµ� ���� 2������ ��ȯ ���
 * 	3. �Է¿���
 * 		���� �Է� : 101
 * 		�Է¿��� --> ���Է�
 * 		���� �Է� : 10
 * 		10����(10) : 2����(1010) --> �����Ѵ�
 */
public class Exam_07 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String binary ="";
		int num;
		while(true) {
			System.out.print("���� �Է� : ");
			int var = scn.nextInt();
			num = var;
			if(var>1 && var<101) {
				while(var>0) {
					int remainder = var%2;
					var=var/2;
					binary = remainder+binary; 
				}
				System.out.println("10����("+num+") : 2����("+binary+")");
				scn.close();
				break;
			}
			System.out.println("�Է¿���");
		}
		/*
		 while(true) {
			System.out.print("���� �Է� : ");
			int var = scn.nextInt();
			num = var;
			if(var>1 && var<101) {
				while(var>1) {
					int remainder = var%2;
					var=var/2;
					binary = remainder+binary; 
				}
				binary = var+binary;
				System.out.println("10����("+num+") : 2����("+binary+")");
				scn.close();
				break;
			}
			System.out.println("�Է¿���");
		}
		 */
		
		
	}

}
