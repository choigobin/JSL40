import java.util.Scanner;

/*	�Ҽ��Ǻ�
 * 	Ű���� �Է� x -> ex)x=5 -> 5�� �Ҽ��ΰ�?
 * 	--------------------------------
 * 	Ű���� �Է�
 * 	1) -99�� �Է� �� �� ���α׷� ����
 * 	2) �Է� ������ 2 ~ 100
 * 	2) �Է� �ڷ��� �Ҽ��� ������ ���� ���Ͽ� ���
 * 
 * 	�Է� : -6
 * 	�Է� ����  -> �Է��ڷᰡ �ƴ�
 * 	�Է� : 3
 * 		...
 * 	�Է� : -99 -> �Է��ڷᰡ �ƴ�
 * 	�Է� �ڷ� �� : xx
 * 	�Ҽ� ���� : xx
 * 	�Ҽ� �հ� : xx
 */
public class Exam_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,cnt=0,sum=0,prime=0,y;
		do {
			System.out.print("�Է� : ");
			x= sc.nextInt();
			if(x>=2 && x<=100) {
				cnt++;
				y=1;
				for(int i=2;i<x;i++) {
					if(x%i==0) {
						y=0;
						break;
					}
				}
				if(y==1) {
					sum+=x;
					prime++;
				}
			}else if(x!=-99){
				System.out.println("�Է� ����");
			}	
		}while(x!=-99);
		sc.close();
		System.out.println("�Է� �ڷ�� : "+cnt);
		System.out.println("�Ҽ� ���� : "+prime);
		System.out.println("�Ҽ� �հ� : "+sum);
		
		
		
	}
}
