/*	if()
 * 	switch ~ case
 * 	90�̻�,	80�̻�, 	70�̻�,	60�̻�,	60�̸�
 * 	100-~90 89~80	79~70	69~60	59~0
 */
public class Exam_02 {
	public static void main(String[] args) {
		int var = 77;
		String str=""; // !=String str=null => ""=����, null=���� �ٸ�!
		
		switch(var/10) { // ()�ȿ��� ���� �Ǵ� ����(����, ����, ���ڿ�)
			case 10: // ��(����, ����, ���ڿ�)
				str="A";
				break;
			case 9:
				str="A";
				break;
			case 8:
				str="B";
				break;
			case 7:
				str="C";
				break;
			case 6:
				str="D";
				break;
			default:
				str="F";
		}
		System.out.println("���� = "+str);
		System.out.println(var+"\t"+var/10);
		
		
	}
}
