import java.util.Scanner;

/*	Ű�����Է�
 * 	�ڷ� ������ �Է�
 * 	�Է� ����
 * 	10,80,60,90,95, ......-1
 * 	�Է� �ڷ� �� 50~90 ������ �ڷḸ ���
 * 	��, �Է� �ڷῡ ������ �ԷµǸ� ����� ���ÿ� �հ�, ��� ���
 */
public class Exam_10 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int sum = 0; // �հ�
		int var = 1; // �Է��ڷ� ����
		int cnt = 0; // ������ ī��Ʈ
		
		while(var>0){ //break�� �Ⱦ��� ���ѷ��� Ż��! => ���ǽĿ� break�� �ش�.
			System.out.print("���� �Է� = ");
			var = scn.nextInt();
			if(var>=50 && var<=90) {
				sum+=var;
				cnt++;
			}
		}
		scn.close();
		System.out.println("�հ� = "+sum+"\t���= "+((double)sum/cnt));
		
	}
}
