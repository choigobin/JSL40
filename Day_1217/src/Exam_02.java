/* [�ڷ��� - DateType(�������� ũ��� ����)]
 * 
 * {�⺻ �ڷ���} - ���� : char
 * 			  - ���� : byte, int, long
 *			  - �Ǽ� : double, float
 * 			  - �� : boolean
 * 
 * �ڹٿ��� ���ڿ� �ڷ����� ���� ����
 * 
 *{������(�ּ�/��ġ)} - �迭
 *		 		  - Ŭ����, �������̽�
 * 
 * -> �������� ��� �� ����!
 */
public class Exam_02 {
	public static void main(String[] args) {
		char ch; //2byte �ѱ� 1���ڿ� 2byte(utf-16) 3byte(utf-8)
		int jung; //4byte
		double dou; //8byte
		boolean bool; //1byte
		
		ch = 'S'; // = -> ���Կ����� -1���ڴ���
		jung = 123791; //��������
		dou = 3.141592; //�Ǽ�����
		bool = true; //true(��)����
		
		System.out.println("char ch = " + ch);
		System.out.println("int jung = " + jung);
		System.out.println("double dou = " + dou);
		System.out.println("boolean bool = " + bool);
	}
}
