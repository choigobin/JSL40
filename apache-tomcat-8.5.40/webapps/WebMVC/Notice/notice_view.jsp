<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title>공지사항 관리 - 관리자페이지</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style type="text/css"> 
<!-- 
body,td,tr,table{font-size:9pt; font-family:tahoma;color:#666666;line-height:160%;} 

A:link {font-family:tahoma;font-size:9pt;color:#666666;text-decoration:none;} 
A:visited {font-family:tahoma;font-size:9pt;color:#666666;text-decoration:none;} 
A:active {font-family:tahoma;font-size:9pt;color:#666666;text-decoration:none;} 
A:hover {font-family:tahoma;font-size:9pt;color:#009900;text-decoration:underline;} 
--> 
</style> 
<script language="JavaScript" type="text/JavaScript">

function okDel() {
	flag = confirm("정말로 삭제하시겠습니까?");
	return (flag);
}

</script>

</head>

<body>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
	<tr><td><jsp:include page="/include/top_menu.jsp" flush="true" /></td></tr>
	<tr>
		<td align="center" height="100%" valign=middle><br>
			<table width="30%" border="1" cellspacing="0" cellpadding="3" bgcolor="#FFCC66" bordercolor="#FFFFFF" bordercolorlight="#000000">
				<tr> 
					<td height=40 align="center" style="font-size: 15px;"><b>공지사항</b></a>
					</b></td>
				</tr>
			</table><br>
			<table width="60%" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td><table width="100%" border="0" cellpadding="6" cellspacing="1" bgcolor="DDDDDD">
							<tr>
								<td align="center" bgcolor="EcECEC"><strong>제목</strong></td>
								<td colspan=3 bgcolor="ffffff">${vo.subject}</td>
							</tr>
							<tr>
								<td width="20%" align="center" bgcolor="EcECEC"><strong>등록일</strong></td>
								<td width="40%" bgcolor="ffffff">${vo.regdate}</td>
								<td width="20%" align="center" bgcolor="EcECEC"><strong>조회수</strong></td>
								<td align="center" bgcolor="ffffff">${vo.readcnt}</td>
							</tr>
							<tr bgcolor="EcECEC">
								<td align="center" bgcolor="EcECEC"><strong>내용</strong></td>
								<td colspan=3 bgcolor="ffffff">${contents}</td>
							</tr>
						</table>
					</td>
				</tr>
			</form>
			</table><br>
			<table width="60%" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td align=center>
						<a href="NoticeServlet?cmd=notice_edit&idx=${vo.idx}&page=${nowpage}"><b>[수정]</b></a>&nbsp; 
						<a onclick="return okDel()"  href="NoticeServlet?cmd=notice_delete_pro&idx=${vo.idx}&page=${nowpage}"><b>[삭제]</b></a>&nbsp; 
						<a href="NoticeServlet?cmd=notice_list&page=${nowpage}"><b>[목록]</b></a>
					</td>
				</tr>
			</table>
</body>
</html>
