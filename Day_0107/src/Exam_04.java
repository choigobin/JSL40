import java.util.Scanner;

/*	Ű�����Է�(2~100)
 * 	�Է°��� -99 �̸� ����
 * 	�Է��ڷ� �� �Ҽ��� ���Ͽ� ���(�ִ� 5��) -> �Ҽ��� 5�� �Ǹ� ���α׷� ����
 * 	�Է� : 5
 * 	...
 * 	�Է� : -99
 * 	�Ҽ� : x x x x x
 */
public class Exam_04 {
	public static void main(String[] args) {
		int prime[] = new int[5];
		int num=0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("�Է� : ");
			int x = sc.nextInt();
			if(x==-99) {
				break;
				}else if(x>=2 && x<=100) {
					for(int i=2;i<=x;i++) {
						if(x%i==0) {
							if(x==i) {
								prime[num] = x;
								num++;
							}
							break;
						}
					}
				}else {
					System.out.println("�Է� ����");
				}
			
			
		}while(num<5);
		sc.close();
		System.out.print("�Ҽ� : ");
		for(int i=0;i<num;i++) {
				System.out.print(prime[i]+" ");
		}
		
		
	}
}
