/*	if(���ǽ�){
 * 		����1;
 * 	}else if(���ǽ�2){
 * 		����2;
 * 	}else if(���ǽ�3){
 * 		����3;
 * 	}else if(���ǽ�n){
 * 		����n;
 * 	}else{
 * 		����n+1;
 * 	}
 * 
 */
public class Exam_08 {
	public static void main(String[] args) {
		int a=70;
		String rank="";
		if(a>=90) {
			rank="A+";
		}else if(a>=80) {
			rank="A";
		}else if(a>=70) {
			rank="B+";
		}else if(a>=60) {
			rank="B";
		}else {
			rank="C";
		}
		System.out.println("���  : "+rank);
	}

}
