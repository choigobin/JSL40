import java.util.Scanner;

/*	Ű����� ������ ���� data 10�� �Է�
 * 	��, data�� 50�̻� 100���ϸ� �Է�
 * 	1,60,50,70,-99,69,60
 */
public class Exam_05 {
	public static void main(String[] args) {
		//�Է�
		Scanner scn = new Scanner(System.in);
		int[] score = new int[10];
		int cnt=0; // data ���� ī��Ʈ
		while(true) {// ���� ����
			System.out.print("���� �Է� : ");
			int jungsu = scn.nextInt();
			if(jungsu>=50 && jungsu<=100) {
				score[cnt] = jungsu;
				cnt++;
				if(cnt==10) {
					break;
				}
			}
		}
		//���
		for(int i=0;i<score.length;i++) {
			System.out.println((i+1)+"��° = "+score[i]);
		}
		
	}
}
