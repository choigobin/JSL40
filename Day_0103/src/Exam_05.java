import java.util.Scanner;

/*	Ű���� �Է�
 * 	1. ���� 10���� �Է� ���� ����Ͻÿ�
 * 	
 * 	2. ���� 10���� �Է� ���� ���(��, �Է� ���� ������ �����Ѵ�)
 */
public class Exam_05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		/*
		int sum=0;
		for(int x=1;x<=10;x++) {
			System.out.print("���� : ");
			int var = scn.nextInt();
			sum+=var;
		}
		scn.close();
		System.out.println("�հ� = "+sum);
		*/
		//while()
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
	}
}
