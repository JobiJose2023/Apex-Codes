<!DOCTYPE html>
<html>
<head>
    <title>Thank You</title>
</head>
<body>
    <h2>Thank you for submitting the form!</h2>

    <%-- Retrieve form data from the request --%>
    <%
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String gender = request.getParameter("gender");
    %>

    <%-- Display form data on the page --%>
    <p>Form Submission Result:</p>
    <p>Name: <%= name %></p>
    <p>Phone Number: <%= phone %></p>
    <p>Gender: <%= gender %></p>
</body>
</html>
