<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fn" uri="jakarta.tags.functions" %>

<%-- 관리자 상단 공통페이지 --%>
<jsp:include page="../include/admin_header.jsp" />

<%-- 관리자 메인 본문 --%>
<div id="aMain_cont">
    <form method="get" action="admin_member_list.do"> <div id="bList_wrap">
            <h2 class="bList_title">관리자 회원목록</h2>
            <div class="bLIst_count">회원수: ${listcount} 명</div>

            <table id="bList_t">
                <tr>
                    <th width="20%" height="26">아이디</th>
                    <th width="16%">회원이름</th>
                    <th width="20%">폰번호</th>
                    <th width="14%">가입/탈퇴</th>
                    <th width="16%">가입날짜</th>
                    <th width="26%">수정/삭제</th>
                </tr>

                <c:if test="${!empty mlist}"> <%-- 회원목록이 있는 경우 --%>
                    <c:forEach var="m" items="${mlist}">
                        <tr>
                            <td align="center">${m.mem_id}</td>
                            <td>
                                <a href="admin_member_info.do?mem_id=${m.mem_id}&page=${page}&state=info">
                                    ${m.mem_name}
                                </a>
                            </td>
                            <td align="center">${m.mem_phone01}-${m.mem_phone02}-${m.mem_phone03}</td>
                            <td align="center">
                                <c:if test="${m.mem_state == 1}">가입회원</c:if>
                                <c:if test="${m.mem_state == 2}">탈퇴회원</c:if>
                            </td>
                            <td align="center">${fn:substring(m.mem_date,0,10)}</td>
                            <td align="center">
                                <input type="button" value="수정" onclick="location='admin_member_info.do?mem_id=${m.mem_id}&page=${page}&state=edit';"/>
                                <input type="button" value="삭제" onclick="if(confirm('정말로 회원 삭제할까요?') == true){
                                    location='admin_member_del.do?mem_id=${m.mem_id}&page=${page}';}else{return;}"/>
                            </td>
                        </tr>
                    </c:forEach>
                </c:if>
                <c:if test="${empty mlist}">
                    <tr><th colspan="6">회원목록이 없습니다!</th></tr>
                </c:if>
            </table>

            <div id="bList_paging">
                <%-- 검색 전 페이징 --%>
                <c:if test="${empty find_field && empty find_name}">
                    <c:if test="${page <= 1}">[이전]&nbsp;</c:if>
                    <c:if test="${page > 1}">
                        <a href="admin_member_list.do?page=${page-1}">[이전]</a>&nbsp;
                    </c:if>

                    <c:forEach var="a" begin="${startpage}" end="${endpage}" step="1">
                        <c:if test="${a == page}">[${a}]</c:if>
                        <c:if test="${a != page}">
                            <a href="admin_member_list.do?page=${a}">[${a}]</a>&nbsp;
                        </c:if>
                    </c:forEach>

                    <c:if test="${page >= maxpage}">[다음]</c:if>
                    <c:if test="${page < maxpage}">
                        <a href="admin_member_list.do?page=${page+1}">[다음]</a>
                    </c:if>
                </c:if>

                <%-- 검색 후 페이징 --%>
                <c:if test="${!empty find_field || !empty find_name}">
                    <c:if test="${page <= 1}">[이전]&nbsp;</c:if>
                    <c:if test="${page > 1}">
                        <a href="admin_member_list.do?page=${page-1}&find_field=${find_field}&find_name=${find_name}">[이전]</a>&nbsp;
                    </c:if>

                    <c:forEach var="a" begin="${startpage}" end="${endpage}" step="1">
                        <c:if test="${a == page}">[${a}]</c:if>
                        <c:if test="${a != page}">
                            <a href="admin_member_list.do?page=${a}&find_field=${find_field}&find_name=${find_name}">[${a}]</a>&nbsp;
                        </c:if>
                    </c:forEach>

                    <c:if test="${page >= maxpage}">[다음]</c:if>
                    <c:if test="${page < maxpage}">
                        <a href="admin_member_list.do?page=${page+1}&find_field=${find_field}&find_name=${find_name}">[다음]</a>
                    </c:if>
                </c:if>
            </div>

            <div id="bList_menu">
                <c:if test="${!empty find_field && !empty find_name}">
                    <input type="button" value="전체회원" onclick="location='admin_member_list.do?page=${page}';">
                </c:if>
            </div>

            <div id="bFind_menu">
                <select name="find_field">
                    <option value="mem_id" <c:if test="${find_field == 'mem_id'}">selected</c:if>>아이디</option>
                    <option value="mem_name" <c:if test="${find_field == 'mem_name'}">selected</c:if>>회원이름</option>
                </select>
                <input type="search" name="find_name" id="find_name" size="14" value="${find_name}">
                <button type="submit">검색</button>
            </div>
        </div>
    </form>
</div>

<%-- 관리자 하단 공통페이지 --%>
<%@ include file="../include/admin_footer.jsp" %>