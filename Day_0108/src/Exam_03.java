import java.util.Scanner;

/* 	Ű���� �Է� (2 ~ 1024) �Է�
 * 	�Է� ���� 2���� ��ȯ�ؼ� ���
 * 	�Է� ���� -99 �̸� ����
 * 
 * 	����)
 * 	�Է� : 10
 * 	2���� : 1010
 * 	�Է� : 1
 * 	�Է� ����
 * 	�Է� : 127
 * 	2���� : 1111111
 * 	�Է� : -99
 * 	���α׷� ����
 */
public class Exam_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[11];
		while(true) {
			System.out.print("10���� : ");
			int a = sc.nextInt();
			if(a==-99) {
				System.out.println("���α׷� ����");
				break;
				}
			int jinsu = sc.nextInt();
			int cnt = 0;
			if(a>=2 && a<=1024) {
				while(true) {
					if(a>jinsu-1) {
						num[cnt]=a%jinsu;
						cnt++;
						a=a/jinsu;
					}else if(a!=0) {
						num[cnt]=a;
						cnt++;
						break;
					}else {
						break;
					}
				}
				System.out.print(jinsu+"���� : ");
				for(int i=cnt-1;i>=0;i--) {
					System.out.print(num[i]);
				}
				System.out.println();
			}else {
				System.out.println("�Է� ����");
			}
		}
		sc.close();
		
		
		
		
		
	}
}
