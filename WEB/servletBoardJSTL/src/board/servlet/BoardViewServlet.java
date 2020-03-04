package board.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.BoardDAO;
import board.model.BoardVO;

/**
 * Servlet implementation class BoardViewServlet
 */
@WebServlet("/board_view")
public class BoardViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idx = Integer.parseInt(request.getParameter("idx"));
		BoardDAO dao = new BoardDAO();
		
		// 쿠키검사
		boolean bool = false;
		Cookie info = null;
		Cookie[] cookies = request.getCookies();
		for(int x=0; x<cookies.length;x++){
			info = cookies[x];
			if(info.getName().equals("board"+idx)){
				bool=true;
				break;
			}
		}

		String newValue=""+System.currentTimeMillis();
		if(!bool){ // 쿠키가 존재하지 않으면
			dao.boardCntUp(idx);// 조회수 증가
			info = new Cookie("board"+idx, newValue);
			info.setMaxAge(60*60);//1시간 /(24*60*60)-1일
			response.addCookie(info);
		}
		
		BoardVO vo = dao.boardSelect(idx);
		
		request.setAttribute("vo", vo);
		RequestDispatcher dispater = 
				request.getRequestDispatcher("Board/board_view.jsp");
		dispater.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
