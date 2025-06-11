<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <title>Success</title>
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
      max-width: 600px; /* Increased from 500px to 600px */
      width: 100%;
    }

    .message-box h1 {
      color: #4CAF50;
      font-size: 32px;
      margin-bottom: 20px;
    }

    .message-box p {
      font-size: 16px;
      color: #333;
      margin-bottom: 30px;
    }

    .link-container {
      display: flex;
      flex-wrap: wrap;
      justify-content: center;
      gap: 10px; /* Space between buttons */
    }

    .link-container a {
      text-decoration: none;
      padding: 12px 30px;
      background-color: #4CAF50;
      color: white;
      border-radius: 8px;
      font-size: 16px;
      transition: background-color 0.3s ease;
      margin: 5px 0; /* Additional vertical margin */
    }

    .link-container a:hover {
      background-color: #45a049;
    }
  </style>
</head>
<body>
  <div class="message-box">
    <h1>Success!</h1>
    <p>Your action was completed successfully.</p>
    <p>Welcome To Mr/Mrs ${userName}</p>
    <div class="link-container">
      <a href="/user/userDetails">User Details</a>
      <a href="/home/home">Go to Home</a>    
      <a href="/user/students">Students</a>
      <a href="/user/logout">Logout</a>
    </div>
  </div>
</body>
</html>
