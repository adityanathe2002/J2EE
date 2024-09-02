<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register </title>
<style>
        body{
           <!-- background-image: url("https://image.shutterstock.com/image-vector/flowing-dot-particles-light-wave-260nw-2449606511.jpg");-->
            background-repeat: no-repeat;
            background-size: cover;
        }
        section{
            /* border: 10px solid; */
            width: 500px;
            height: 550px;
            margin-left: 320px;
            border-radius: 20px;
            background-color: rgb(255, 114, 63);
            box-shadow: 5px 5px 5px  5px rgb(71, 71, 71);
        }
        form{
            padding-left: 80px;
            
        }
        h1{
            text-align: center;
            font-size: 30px;
        }
        #name,#email,#phone{
            margin-left: 40px;
        }
        #course{
            margin-left: 35px;
        }
        #edu{
            margin-left: 14px;
        }
        #str{
            margin-left: 35px;
        }
        #yop{
            margin-left: 50px;
        }
        #gender{
            margin-left: 33px;
        }
        #fees{
            margin-left: 22px;
        }
        input{
            height: 25px;
            width: 250px;
            border-radius: 6px;
            border: none;
        }
        #btn{
            margin-left: 100px;
            height: 30px;
            width: 150px;
            border-radius: 8px;
            border: none;
            font-weight: 700;
            background-color: rgb(13, 160, 219);
        }
        #btn:hover{
            transform: scale(1.1);
            color: whitesmoke;
        }
        input:hover{
            border: none;
            border-radius: 6px;
            box-shadow: 0px 2px 0px 1px whitesmoke;
        }
    </style>
  </head>
  <body>
    <section>
        <h1><i>Register</i></h1>
        <form action="reg">
           <b> Email:</b> <input id="email" type="email" name="m" /><br /><br>
            <b>Name:</b> <input id="name" type="text" name="n" /><br /><br>
            <b>Phone:</b> <input id="phone" type="telephone" name="p" /><br /><br>
            <b>Course:</b> <input id="course" type="text" name="c" /><br /><br>
            <b>Education:</b> <input id="edu" type="text" name="e" /><br /><br>
            <b>Stream:</b> <input id="str" type="text" name="s" /><br /><br>
            <b>YOP:</b> <input id="yop" type="number" name="y" /><br /><br>
            <b>Gender:</b> <input id="gender" type="text" name="g" /><br /><br>
            <b>FeesPaid: </b><input id="fees" type="text" name="fp" /><br /><br>
            <input id="btn" type="submit" value="REGISTER" /><br>
        </form>
    </section>
  </body>
</html>