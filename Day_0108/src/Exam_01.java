import java.util.Scanner;

/*	Ű���� �Է�(1 ~ 10) -> 7�� �Է�
 * 	�Է� : 5
 * 	�Է� : 0
 * 	�Է¿���
 * 	�Է� : 9
 * 	 . . . -> 7�� �Է½� ���
 * 	[ ��� ]
 * 	�Է� �ڷ� : 5 9 x x x x x
 * 	�ִ� : x
 * 	�ּڰ� : x
 * 	�հ�(�ִ�, �ּҸ� �� �հ�) : xx(xx)
 */
public class Exam_01 {
	public static void main(String[] args) {//�Է°� ����� �и���Ű�� ���� ����. -> ���ȭ
		//�Է�
		Scanner sc = new Scanner(System.in);
		int num[] = new int [7];
		int cnt=0;
		while(cnt<7) {
			System.out.print("�Է� : ");
			int a = sc.nextInt();
			if(a>0 && a<11) {
				num[cnt] = a;
				cnt++;
			}else {
				System.out.println("�Է¿���");
			}
		
		}
		sc.close();
		//���
		int max=num[0],min=num[0],sum=num[0];
		for(int i=1; i<num.length; i++) {
			if(max<num[i]) {
				max=num[i];
			}
			if(min>num[i]) {
				min=num[i];
			}
			sum +=num[i];
		}
		//���
		System.out.print("�Է� �ڷ� : ");
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println("\n�ִ� : "+max);
		System.out.println("�ּڰ� : "+min);
		System.out.println("�հ�(�ִ�,�ּҸ� �� �հ�) : "+sum+"("+(sum-max-min)+")");
	}
}