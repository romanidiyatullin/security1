<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
    <body>
        <h2>
            ALL INFO PAGE
        </h2>
        <br><br>
        <security:authorize access="hasRole('HR')">
        <input type="button" value="SALARY" onclick="window.location.href='hr'">
        HR ONLY
        </security:authorize>
        <br><br>
        <security:authorize access="hasRole('MANAGER')">
        <input type="button" value="PERFORMANCE" onclick="window.location.href='manager'">
        MANAGERS ONLY
        </security:authorize>
    </body>
</html>