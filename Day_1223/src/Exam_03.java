import java.util.Scanner;

/*	Ű����� 10���� ������ �Է¹޾Ƽ�
 * 	�迭�� ������ ����, ����� ���Ͽ� ���
 */
public class Exam_03 {
	public static void main(String[] args) {
		// �Է� �۾�
		Scanner scn = new Scanner(System.in);
		int var[] = new int[10];
		
		for(int i=0; i<10;i++) {
			System.out.print("����("+(i+1)+") :");
			var[i] = scn.nextInt();
		}
		// ��� �۾�
		int tot = 0;
		for(int i=0; i<10;i++) {
			System.out.print("����("+(i+1)+")\t");
			tot= tot+var[i];
		}
		System.out.print("����\t���\n");
		for(int i=0; i<10;i++) {
			System.out.print(var[i]+"\t");
		}
		System.out.print(tot+"\t"+(tot/10)+"\n");
		
	}
}
