
public class Exam_02 {

	public static void main(String[] args) {
		int a=(int)(7/5.); // ����ȯ-��������ȯ(�����Ͱ� �߷����� �� ����)
		int b=7%5;
		System.out.println("7/5=" + a);
		System.out.println("7%5=" + b);
		System.out.println("7/5=" + 7/5.);
		System.out.println("7%5=" + 7%5);
		
		//int var = 3.14; int = 4byte, double = 8byte -> 4����Ʈ�� 8����Ʈ���� �־ ����
		int var = (int)3.14;
		double d =a;	//�ڵ�����ȯ
		double d2 = 90; //�ڵ�����ȯ//90.//(double)90
		System.out.println("d=" + d);
		System.out.println("d2=" + d2);
		System.out.println("var=" + var);
	}

}
