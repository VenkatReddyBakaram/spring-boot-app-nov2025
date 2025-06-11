<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Green Login Page</title>
  <link href="https://fonts.googleapis.com/css2?family=Poppins&display=swap" rel="stylesheet">
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
      align-items: center;
      justify-content: center;
    }

    .login-box {
      background-color: white;
      padding: 40px;
      border-radius: 15px;
      box-shadow: 0 15px 25px rgba(0, 0, 0, 0.2);
      width: 100%;
      max-width: 400px;
    }

    .login-box h2 {
      text-align: center;
      color: #4CAF50;
      margin-bottom: 30px;
    }

    .login-box input[type="text"],
    .login-box input[type="password"] {
      width: 100%;
      padding: 12px;
      margin: 10px 0 20px;
      border: 1px solid #ccc;
      border-radius: 8px;
      outline: none;
      transition: 0.3s;
    }

    .login-box input[type="text"]:focus,
    .login-box input[type="password"]:focus {
      border-color: #4CAF50;
    }

    .login-box button {
      width: 100%;
      padding: 12px;
      background-color: #4CAF50;
      color: white;
      border: none;
      border-radius: 8px;
      font-size: 16px;
      cursor: pointer;
      transition: 0.3s;
    }

    .login-box button:hover {
      background-color: #45a049;
    }

    .login-box p {
      text-align: center;
      margin-top: 15px;
    }

    .login-box a {
      color: #4CAF50;
      text-decoration: none;
    }
  </style>
</head>
<body>
  <div class="login-box">
    <h2>Welcome Back</h2>
    <form action="/user/doLogin" modelAttribute="user" method="POST">
      <input type="text" placeholder="Username" name="userName" required>
      <input type="password" placeholder="Password" name="password" required>
      <button type="submit">Login</button>
      <p>Don't have an account? <a href="signup">Sign Up</a></p>
    </form>
  </div>
</body>
</html>
