import java.io.IOException;

/*	ǥ�� �Է�
 * 	System.in.read(); -- 1���� �Է� -- ������ ��ȯ
 * 	����ó�� �ʼ� ex.throws IOException
 * 	ASCII Code => A=65,a=97,0=48,LF(Line feed)=10,CR(Carrage return)=13
 * 	���� => \r\n => 1310
 */
public class Exam_02 {
	public static void main(String[] args) throws IOException {
		
		System.out.print("1���� �Է� : ");
		//int ch = System.in.read(); //A -- ASCII Code (A=65,a=97,0=48)
		//����ȯ
		char ch = (char)System.in.read();
		System.out.println("ch="+ch);
		
		
	}
}
