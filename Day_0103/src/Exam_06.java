import java.util.Scanner;

/*	Ű���� �Է�
 * 	1. ���� 10���� �Է� ���� ����Ͻÿ�
 * 	
 * 	2. ���� 10���� �Է� ���� ���(��, �Է� ���� ������ �����Ѵ�)
 */
public class Exam_06 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//while()
		/*
		int cnt=0; // ����
		int total=0; // �հ�
		while(cnt<10) {
			System.out.print("���� : ");
			int var = scn.nextInt();
			if(var>=0) {
				cnt++;
				total+=var;
			}
		}
		scn.close();
		System.out.println("�հ� = "+total);
		*/
		//for()
		/*
		int sum=0;
		for(int x=1;x<=10;) {
			System.out.print("���� : ");
			int var = scn.nextInt();
			if(var>=0) {
				sum+=var;
				x++;
			}
		}
		scn.close();
		System.out.println("�հ� = "+sum);
		*/
		int sum=0;
		for(int x=1;x<=10;x++) {
			System.out.print("���� : ");
			int var = scn.nextInt();
			if(var>=0) {
				sum+=var;
			}else {
				x--;
				}
		}
		scn.close();
		System.out.println("�հ� = "+sum);
		
		
	}
}
