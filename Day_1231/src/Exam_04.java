/*	�ݺ��� // ���ǽ� = ��,����
 * 	1. while(���ǽ�){	}
 * 	2. do{	}while(���ǽ�)
 * 	3. for(����=�ʱⰪ;���ǽ�;������){	}
 */
public class Exam_04 {
	public static void main(String[] args) {
		int x=0;
		while(true) {//���ѹݺ�
			System.out.println("x = "+ x);
			x++;
			if(x==10) {
				break;
			}
		}
		int y=0;
		while(y<10) {
			System.out.println("y = "+ y);
			y++;
		}
		int z=0;
		do {
			System.out.println("z = "+ z);
			z++;
		}while(z==10);
		
		
		
	}
}
