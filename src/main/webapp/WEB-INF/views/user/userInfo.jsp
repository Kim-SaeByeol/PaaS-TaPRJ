<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="kopo.poly.util.CmmUtil" %>
<%@ page import="kopo.poly.dto.UserInfoDTO" %>
<%
    // UserInfoController 함수에서 model 객체에 저장된 값 불러오기
//    List<UserInfoDTO> rList = (List<UserInfoDTO>) request.getAttribute("rList");
    // 상세보기는 값이 하나니깐 List로 받지않음
    UserInfoDTO rDTO = (UserInfoDTO) request.getAttribute("rDTO");
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>회원 상세정보</title>
    <link rel="stylesheet" href="/css/table.css"/>
</head>
<body>
<h2>회원 상세정보</h2>
<hr/>
<br/>
<div class="divTable minimalistBlack">
    <div class="divTableBody">
        <div class="divTableRow">
            <div class="divTableCell">회원 아이디
            </div>
            <div class="divTableCell"><%=CmmUtil.nvl(rDTO.getUserId())%>
            </div>
        </div>
        <div class="divTableRow">
            <div class="divTableCell">회원 이름
            </div>
            <div class="divTableCell"><%=CmmUtil.nvl(rDTO.getUserName())%>
            </div>
        </div>
        <div class="divTableRow">
            <div class="divTableCell">이메일
            </div>
            <div class="divTableCell"><%=CmmUtil.nvl(rDTO.getEmail())%>
            </div>
        </div>
        <div class="divTableRow">
            <div class="divTableCell">주소
            </div>
            <div class="divTableCell"><%=CmmUtil.nvl(rDTO.getAddr1())%>
            </div>
        </div>
        <div class="divTableRow">
            <div class="divTableCell">상세 주소
            </div>
            <div class="divTableCell"><%=CmmUtil.nvl(rDTO.getAddr2())%>
            </div>
        </div>
    </div>
</div>
</body>
</html>