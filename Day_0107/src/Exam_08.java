import java.util.Scanner;

/*	Ű���� �Է�(1~99)
 * 	�Է� �ڷᰡ -99, �Ǵ� �Է��ڷ� �Ǽ��� 20�� �� ����
 * 	�Է� : 77
 * 		. . .
 * 	�Է� : -99
 * 	�Է� �ڷ� : xx xx xx xx xx xx ... xx
 * 	���        : xx
 * 	��տ� ���� ����� �� : xx
 */
public class Exam_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[20];
		int sum=0, cnt=0;
		while(cnt<20) {
			System.out.print("�Է� : ");
			int x = sc.nextInt();
			if(x==-99) {
				break;
			}else if(x>0 && x<101){
				num[cnt] = x;
				sum+=x;
				cnt++;
			}else {
				System.out.println("�Է� ����");
			}
		}
		sc.close();
		int avg = sum/cnt;
		int mvp = 100;
		System.out.print("\n�Է� �ڷ� : ");
		for(int i=0;i<cnt;i++) {
			System.out.print(num[i]+" ");
			if(mvp<avg) {
				if(num[i]<avg) {
					mvp = ((avg-mvp)<(avg-num[i])) ? mvp : num[i];
				}else {
					mvp = ((avg-mvp)<(num[i]-avg)) ? mvp : num[i];
				}
			}else {
				if(num[i]<avg) {
					mvp = ((mvp-avg)<(avg-num[i])) ? mvp : num[i];
				}else {
					mvp = ((mvp-avg)<(num[i]-avg)) ? mvp : num[i];
				}
			}
		}
		System.out.println("\n���        : "+avg);
		System.out.println("��տ� ���� ����� �� : "+mvp);
		
		
		
	}
}
