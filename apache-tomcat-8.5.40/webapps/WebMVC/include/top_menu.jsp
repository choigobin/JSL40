<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<title>관리자</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<style type="text/css"> 
<!-- 
body,td,tr,table{font-size:9pt; font-family:tahoma;color:#000000;line-height:160%;} 

A:link {font-family:tahoma;font-size:9pt;color:#000000;text-decoration:none;} 
A:visited {font-family:tahoma;font-size:9pt;color:#000000;text-decoration:none;} 
A:active {font-family:tahoma;font-size:9pt;color:#000000;text-decoration:none;} 
A:hover {font-family:tahoma;font-size:9pt;color:#000000;text-decoration:underline;} 
--> 
</style> 
</HEAD>
<BODY topmargin=0 leftmargin="0" marginwidth="0" marginheight="0">
  <TABLE WIDTH=100% height=30 border=0 bgcolor="#FFCC66">
    <TR> 
		<TD width="20"></TD>
		<TD width="100"> 
			<p><a href="NoticeServlet?cmd=notice_list">[공지사항 관리]</a></p>
		</TD>
		<TD width="100"> 
			<P><a href="BoardServlet?cmd=board_list">[게시판 관리]</a></P>
		</TD>
		<TD width="100"> 
			<P><a href="PdsServlet?cmd=pds_list">[자료실 관리]</a></P>
        </TD>
		<TD width="100"> 
			<P><a href="JoinServlet?cmd=logout">[로그아웃]</a></P>
		</TD>
    </TR>
  </TABLE>
</body>
</html>
