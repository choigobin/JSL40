/*	�迭 ó��: ������ �̸��� ���� �������� �̸� (ex.����Ʈ) //�迭 : ������, �ּҰ� ����
 * 	�迭��(�̸�), �ε���(÷��) -> a[1]
 */
public class Exam_01 {
	public static void main(String[] args) {
		// �迭 ����
		int a; // a���� ���� -> 4byte
		a=10; // �Ϲݺ��� => �� ����
		int var[]; // var �迭���� ����(������ �Ҵ�) / int���̴ϱ� 4byte
		var = new int[10];// �Ҵ�(���� �޸� ����), �ּҰ� ���� / �迭�� �Ҵ��� �ڵ����� �ʱ�ȭ
		//var -> ù��° ����� '�ּ�'�� ����Ŵ
		System.out.println("var = "+var);//�迭�� �����ּ� = ù���� ����� �ּ�
		System.out.println("var+0 = "+var+0);//ù��° ����� �ּ�
		System.out.println("var+1 = "+var+1);//�ι�° ����� �ּ� -> �迭�� �����ּҿ��� 4byte�ǳ� �� �ּ�
		System.out.println("var[0] = "+var[0]);//[0]�� ����� ��
	}
}
