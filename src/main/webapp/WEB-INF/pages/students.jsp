<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <title>Student Details</title>
  <link href="https://fonts.googleapis.com/css2?family=Poppins&display=swap" rel="stylesheet" />
  <style>
    * {
      box-sizing: border-box;
      font-family: 'Poppins', sans-serif;
    }

    body {
      margin: 0;
      padding: 0;
      background: linear-gradient(135deg, #a8e063, #56ab2f);
      height: 100vh;
      display: flex;
      justify-content: center;
      align-items: center;
    }

    .message-box {
      background-color: white;
      padding: 50px 40px;
      border-radius: 20px;
      box-shadow: 0 15px 30px rgba(0, 0, 0, 0.2);
      text-align: center;
      max-width: 800px;
      width: 100%;
      overflow-x: auto;
    }

    .message-box h1 {
      color: #4CAF50;
      font-size: 32px;
      margin-bottom: 20px;
    }

    table {
      width: 100%;
      border-collapse: collapse;
      margin-bottom: 20px;
    }

    table, th, td {
      border: 1px solid #ddd;
    }

    th, td {
      padding: 12px;
      text-align: center;
    }

    th {
      background-color: #4CAF50;
      color: white;
    }

    tr:nth-child(even) {
      background-color: #f2f2f2;
    }

    .message-box a {
      text-decoration: none;
      padding: 12px 30px;
      background-color: #4CAF50;
      color: white;
      border-radius: 8px;
      font-size: 16px;
      margin: 5px;
      display: inline-block;
      transition: background-color 0.3s ease;
    }

    .message-box a:hover {
      background-color: #45a049;
    }
  </style>
</head>
<body>
  <div class="message-box">
    <h1>Student Details</h1>
    <table>
      <thead>
        <tr>
          <th>Stud ID</th>
          <th>Stud Name</th>
          <th>Email</th>
          <th>Phone Number</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td>101</td>
          <td>John Doe</td>
          <td>john.doe@example.com</td>
          <td>+91-9876543210</td>
        </tr>
        <tr>
          <td>102</td>
          <td>Jane Smith</td>
          <td>jane.smith@example.com</td>
          <td>+91-9123456780</td>
        </tr>
        <tr>
          <td>103</td>
          <td>Michael Brown</td>
          <td>michael.brown@example.com</td>
          <td>+91-9988776655</td>
        </tr>
        <tr>
            <td>${studId}</td>
            <td>${studName}</td>
            <td>${email}</td>
            <td>+91-${phoneNumber}</td>
          </tr>

          <c:forEach var="student" items="${students}">
            <tr>
              <td>${student.studId}</td>
              <td>${student.studName}</td>
              <td>${student.email}</td>
              <td>+91-${student.phoneNumber}</td>
            </tr>
          </c:forEach>

      </tbody>
    </table>
    <a href="/home/home">Go to Home</a>
    <a href="/user/logout">Logout</a>
  </div>
</body>
</html>
