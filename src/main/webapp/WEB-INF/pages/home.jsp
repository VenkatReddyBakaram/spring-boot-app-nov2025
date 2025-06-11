<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <title>Green Themed Home</title>
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

    .home-container {
      background-color: white;
      padding: 50px 40px;
      border-radius: 20px;
      box-shadow: 0 15px 30px rgba(0, 0, 0, 0.2);
      text-align: center;
      max-width: 500px;
      width: 100%;
    }

    .home-container h1 {
      margin-bottom: 20px;
      color: #4CAF50;
      font-size: 32px;
    }

    .home-container p {
      font-size: 16px;
      color: #555;
      margin-bottom: 40px;
    }

    .button-group {
      display: flex;
      justify-content: center;
      gap: 20px;
    }

    .button-group a {
      text-decoration: none;
      padding: 12px 30px;
      background-color: #4CAF50;
      color: white;
      border-radius: 8px;
      font-size: 16px;
      transition: background-color 0.3s ease;
    }

    .button-group a:hover {
      background-color: #45a049;
    }

    @media (max-width: 480px) {
      .button-group {
        flex-direction: column;
        gap: 15px;
      }
    }
  </style>
</head>
<body>
  <div class="home-container">
    <h1>Welcome to Green Portal</h1>
    <p>Login to your account or create a new one to get started.</p>
    <div class="button-group">
      <a href="login">Login</a>
      <a href="signup">Sign Up</a>
    </div>
  </div>
</body>
</html>
