/*	����, ���� ������
 * 	++, -- => ���׿�����
 */
public class Exam_09 {

	public static void main(String[] args) {
		int a=5, b=0;
		//a=a+1;//1���� == a++; ++,-- �� ������ 1�� ����
		b=a++;// ������ b=a -> ++ ���� // b=5,a=6
		b=++a;// ������ a++ -> b=a // b=6,a=6
	}

}
