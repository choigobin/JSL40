import java.util.Scanner;

/*	Ű����� ����(2~1000) �Է�
 * 	1) 2 ~ �Է°� ������ �Ҽ��� ���
 * 	2) �� �ٿ� 5���� ���
 * 	3) �������� �Ҽ��� ���� ���
 * 	4) ����
 * 	�Է� : 50
 * 	2 3 5 7 11
 * 	13 ...
 * 	�Ҽ� ���� : xx
 */
public class Exam_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,cnt=0;
		while(true) {
			System.out.print("�Է� : ");
			x = sc.nextInt();
			if(x>=2 && x<=1000) {
				for(int i=2;i<=x;i++) {
					for(int y=2;y<=i;y++) {
						if(i%y==0) {
							if(i==y) {
								cnt++;
								System.out.print(i+"\t");
								if(cnt%5==0) {
									System.out.print("\n");
								}
							}else {
								break;
							}
						}
					}
				}
				if(cnt%5!=0) System.out.println();
				System.out.println("�Ҽ� ���� : "+cnt);
				break;
			}else {
				System.out.println("�Է� ����");
			}
			
		}
		sc.close();
		
		
	}
}
