<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

 <style>  
      section {
        /* border: 2px solid;    */
        height: 500px;
        width: 600px;
        align-items: center;
        justify-content: center;
        display: flex;
        margin-left:25%;
        margin-top: auto;
      }

      form {
        align-items: center;
        justify-content: center;
        border: 2px solid;
        border-radius: 20px;
        margin-top: 40px;
        margin-left: 30px;
        padding-top: 40px;
        padding-left: 20px;
        width: 250px;
        height: 300px;
        background: linear-gradient(90deg, rgba(238,174,202,1) 0%, rgba(148,187,233,1) 100%);

      }
      img {
        height: 400px;
        width: 300px;
      }
      #btn {
        align-items: center;
        justify-content: center;
        margin-left: 60px;
        height: 25px;
        width: 80px;
        border-radius: 20px;
        border: none;
        background-color: rgb(225, 225, 234);
      }
      .login-logo{
        height: 60px;
        width: 60px;
        display: flex;
        padding-left: 70px;
      }
      .input-area{
        padding-top: 40px;
      }
      input{
        height: 30px;
        border-radius: 5px;
        border: none;
      }
      input:hover{
        border: 2px solid;
      }
      #btn:hover{
        transform: scale(1.1);
      }
    </style>

</head>
<body>
	<section>
      <img
        alt=""src="https://img.freepik.com/free-vector/login-concept-illustration_114360-757.jpg?size=626&ext=jpg&ga=GA1.1.1557645315.1724575942&semt=ais_hybrid"/>
      <form action="login">
        <div><img src="https://cdn-icons-png.flaticon.com/128/9386/9386837.png"class="login-logo"></div>
        <div class="input-area">
        <svg
          xmlns="http://www.w3.org/2000/svg"
          width="20"
          height="20"
          fill="currentColor"
          class="bi bi-person-bounding-box"
          viewBox="0 0 16 16"
        >
          <path
            d="M1.5 1a.5.5 0 0 0-.5.5v3a.5.5 0 0 1-1 0v-3A1.5 1.5 0 0 1 1.5 0h3a.5.5 0 0 1 0 1zM11 .5a.5.5 0 0 1 .5-.5h3A1.5 1.5 0 0 1 16 
                   1.5v3a.5.5 0 0 1-1 0v-3a.5.5 0 0 0-.5-.5h-3a.5.5 0 0 1-.5-.5M.5 11a.5.5 0 0 1 .5.5v3a.5.5 0 0 0 .5.5h3a.5.5 0 0 1 0 1h-3A1.5 1.5 0
                   0 1 0 14.5v-3a.5.5 0 0 1 .5-.5m15 0a.5.5 0 0 1 .5.5v3a1.5 1.5 0 0 1-1.5 1.5h-3a.5.5 0 0 1 0-1h3a.5.5 0 0 0 .5-.5v-3a.5.5 0 0 1 .5-.5"
          />
          <path
            d="M3 14s-1 0-1-1 1-4 6-4 6 3 6 4-1 1-1 1zm8-9a3 3 0 1 1-6 0 3 3 0 0 1 6 0"
          />
        </svg>
         <input type="email" name="email" /> <br /><br />
        <svg
          xmlns="http://www.w3.org/2000/svg"
          width="20"
          height="20"
          fill="currentColor"
          class="bi bi-file-lock"
          viewBox="0 0 16 16"
        >
          <path
            d="M8 5a1 1 0 0 1 1 1v1H7V6a1 1 0 0 1 1-1m2 2.076V6a2 2 0 1 0-4 0v1.076c-.54.166-1 .597-1 1.224v2.4c0 .816.781 1.3 1.5 1.3h3c.719 0 1.5-.484 1.5-1.3V8.3c0-.627-.46-1.058-1-1.224M6.105 8.125A.64.64 0 0 1 6.5 8h3a.64.64 0 0 1 .395.125c.085.068.105.133.105.175v2.4c0 .042-.02.107-.105.175A.64.64 0 0 1 9.5 11h-3a.64.64 0 0 1-.395-.125C6.02 10.807 6 10.742 6 10.7V8.3c0-.042.02-.107.105-.175"
          />
          <path
            d="M4 0a2 2 0 0 0-2 2v12a2 2 0 0 0 2 2h8a2 2 0 0 0 2-2V2a2 2 0 0 0-2-2zm0 1h8a1 1 0 0 1 1 1v12a1 1 0 0 1-1 1H4a1 1 0 0 1-1-1V2a1 1 0 0 1 1-1"
          />
        </svg>
         <input type="telephone" name="phone" /><br /><br />
        <input id="btn" type="submit" value="Login" />
    </div>
      </form>
    </section>

</body>
</html>