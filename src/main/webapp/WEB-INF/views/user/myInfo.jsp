<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="kopo.poly.util.CmmUtil" %>
<%@ page import="kopo.poly.dto.UserInfoDTO" %>
<%
    String ssUserId = CmmUtil.nvl((String) session.getAttribute("SS_USER_ID"));
    String ssUserName = CmmUtil.nvl((String) session.getAttribute("SS_USER_NAME"));
    String ssUserEmail = CmmUtil.nvl((String) session.getAttribute("SS_USER_EMAIL"));
    String ssUserAddr1 = CmmUtil.nvl((String) session.getAttribute("SS_USER_ADDR1"));
    String ssUserAddr2 = CmmUtil.nvl((String) session.getAttribute("SS_USER_ADDR2"));
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>내 정보</title>
    <link rel="stylesheet" href="/css/table.css"/>
</head>
<body>
<h2>내 정보</h2>
<hr/>
<br/>
<div class="divTable minimalistBlack">
    <div class="divTableBody">
        <div class="divTableRow">
            <div class="divTableCell">아이디
            </div>
            <div class="divTableCell"><%=ssUserId%>
            </div>
        </div>
        <div class="divTableRow">
            <div class="divTableCell">이름
            </div>
            <div class="divTableCell"><%=ssUserName%>
            </div>
        </div>
        <div class="divTableRow">
            <div class="divTableCell">이메일
            </div>
            <div class="divTableCell"><%=ssUserEmail%>
            </div>
        </div>
        <div class="divTableRow">
            <div class="divTableCell">주소
            </div>
            <div class="divTableCell"><%=ssUserAddr1%>
            </div>
        </div>
        <div class="divTableRow">
            <div class="divTableCell">상세 주소
            </div>
            <div class="divTableCell"><%=ssUserAddr2%>
            </div>
        </div>
    </div>
</div>
</body>
</html>