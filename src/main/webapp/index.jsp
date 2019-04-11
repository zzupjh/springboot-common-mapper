<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>Hello World!0222222222222</h2>
<c:forEach items="${requestScope.users}" var="user">
    ${user.stuId}<br>
    ${user.stuName}<br>
    ${user.stuAge}<br>
    ${user.stuGender}<br>
</c:forEach>
</body>
</html>
