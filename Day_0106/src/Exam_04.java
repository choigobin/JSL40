import java.util.Scanner;

/*	Ű����� �޿��� �Է�(1 ~ 500,000)
 * 	�Է� �ڷᰡ -999 �̸� ���� �Ǵ� �ο����� �ִ� 10��
 * 	
 * 	50,000 : xx
 * 	10,000 : xx
 * 	5,000 : xx
 * 		...
 * 	1 : xx
 * 
 */
public class Exam_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int oman=0,man=0,ochun=0,chun=0,obak=0,bak=0,osib=0,sib=0,o=0,il=0,cnt=0,x;
		while(cnt<10) {
			System.out.print("�Է� : ");
			x = sc.nextInt();
			if(x==-999) break;
			else if(x>=1 && x<=500000) {
				cnt++;
				oman+=x/50000;
				x=x%50000;
				man+=x/10000;
				x=x%10000;
				ochun+=x/5000;
				x=x%5000;
				chun+=x/1000;
				x=x%1000;
				obak+=x/500;
				x=x%500;
				bak+=x/100;
				x=x%100;
				osib+=x/50;
				x=x%50;
				sib+=x/10;
				x=x%10;
				o+=x/5;
				x=x%5;
				il+=x;
				
			}else System.out.println("�Է� ����");
		}
		sc.close();
		System.out.println("50,000 : "+oman);
		System.out.println("10,000 : "+man);
		System.out.println("5,000 : "+ochun);
		System.out.println("1,000 : "+chun);
		System.out.println("500 : "+obak);
		System.out.println("100 : "+bak);
		System.out.println("50 : "+osib);
		System.out.println("10 : "+sib);
		System.out.println("5 : "+o);
		System.out.println("1 : "+il);
		
		
		
	}
}
