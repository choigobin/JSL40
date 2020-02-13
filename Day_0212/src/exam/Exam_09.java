package exam;

import java.util.*;

import model.*;

public class Exam_09 {
	public static void main(String[] args) {
		DataDAO dao = new DataDAO();
		List<EmpVO> list = dao.exam_09();
		if(list.isEmpty()) {
			System.out.println("검색결과가 없습니다");
		}else {
			System.out.println("ENAME\tHIREDATE");
			for(EmpVO vo : list) {
				System.out.print(vo.getEname()+"\t");
				System.out.print(vo.getHiredate()+"\n");
			}
		}
		
	}
}