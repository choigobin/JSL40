import java.util.Scanner;

/*	Ű�����Է�
 * 	50~90 ������ �ڷ� 10�� �Է� �հ� ���
 * 	�Է� ����
 * 	10,80,60,90,95, ......
 */
public class Exam_08 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int sum = 0; // �հ�
		int var; // �Է��ڷ� ����
		int cnt=0; // ������ ī��Ʈ
		
		while(true){
			System.out.print("���� �Է� = ");
			var = scn.nextInt();
			if(var>=50 && var<=90) {
				sum+=var;
				cnt++;
				if(cnt==10) break; // cnt �����ø� ���� => �ӵ��� ����
			}
			//if(cnt==10) break; // cnt ī��Ʈ�� ������� �׻� ����� => �ӵ��� ������
		}
		scn.close();
		System.out.println("�հ� = "+sum);
		
	}
}
