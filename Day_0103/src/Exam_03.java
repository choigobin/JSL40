import java.util.Scanner;

/*	2�ڸ� �̳� ������ �Է�
 * 	1 ~ �Էµ� �������� �հ踦 ����Ͽ� ���
 */
public class Exam_03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int var;
		while(true) {
			System.out.print("�����Է�(1~99):");
			var = scn.nextInt();
			if(var>=1 && var<=99) {
				int sum = 0;
				for(int x=1;x<=var;x++) {
					sum+=x;
				}
				System.out.println("1 ~ "+var+" �հ� = "+sum);
				scn.close();
				break;
			}
		}
		// 1 ~ var �հ��� ���
		
	}
}
