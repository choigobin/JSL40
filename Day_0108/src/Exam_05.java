
public class Exam_05 {
	public static void main(String[] args) {
		int[] score= {50,70,60,90,80,77,45,78};
		System.out.print("Data : ");
		for(int x=0; x<score.length; x++) {
			System.out.print(score[x]+" ");
		}
		System.out.println();
		for(int x=0; x<score.length-1;x++) {//����
			for(int y=x+1;y<score.length;y++) {
				if(score[x]>score[y]) {//��������
					int temp=score[x];
					score[x]=score[y];
					score[y]=temp;
				}
				
			}
		}
		System.out.print("sort : ");
		for(int x=0; x<score.length; x++) {
			System.out.print(score[x]+" ");
		}
		
	}
}
