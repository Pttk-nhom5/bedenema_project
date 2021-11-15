<%--
  Created by IntelliJ IDEA.
  User: thanhlongtld
  Date: 14/11/2021
  Time: 14:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <title>Client Home Page</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css' rel='stylesheet'>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container px-4 px-lg-5">
        <a class="navbar-brand" href="https://lh3.googleusercontent.com/iG7NASYBD1p_d2K_Ikr5IrypZDVFMKvF5I9dlEqfzLjLTo_l87pEbLl0Q_eutE1S7ap7qAr3SrR4M1mESQVCmCXDUq7AiTTKoSDArdx7EcPLR38xUUp36GOMNFSTHsSoeTbxY7udWw=w2400">
            <img src="../assets/logoBEDENEMA.png" alt="logo-BEDENEMA" border="0" width="200">
        </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
                aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"><span
                class="navbar-toggler-icon"></span></button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0 ms-lg-4">
                <li class="nav-item"><a class="nav-link" href="ListFilmFrm.jsp">Phim</a></li>
                <li class="nav-item"><a class="nav-link" href="ShowtimeFrm.jsp">Đặt Vé</a></li>
                <li class="nav-item"><a class="nav-link" href="RegisterMemberCardFrm.jsp">Đăng ký thẻ thành viên</a></li>
            </ul>
            <!-- Navbar Search-->
            <form class="d-none d-md-inline-block form-inline ms-auto me-0 me-md-3 my-2 my-md-0">
                <div class="input-group">
                    <input class="form-control" type="text" placeholder="Search for..." aria-label="Search for..."
                           aria-describedby="btnNavbarSearch" />
                    <a href="list_film.html">
                        <button class="btn btn-primary" id="btnNavbarSearch" type="button"><i class="fas fa-search"></i></button>
                    </a>

                </div>
            </form>
            <a href="LoginFrm.jsp">
                <button class="btn btn-outline-dark" type="submit" >
                    Đăng Nhập
                </button>
            </a>
        </div>
    </div>
</nav>
<!-- Optional JavaScript; choose one of the two! -->

<!-- Option 1: Bootstrap Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

</body>
</html>
