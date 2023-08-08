<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>
        admin dashboard
    </title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css" integrity="sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link href='https://fonts.googleapis.com/css?family=Poppins' rel='stylesheet'>
    <style>
        *{
            font-family: 'Poppins';
        }
    </style>
    <link rel="stylesheet" href="admin.css">
</head>

<body>
    <section id="menu">
        <div class="logo">
            <img src="images/logo3.png" alt="">
            <p>HUMOPEDIA</p>
        </div>
        <div class="items">
            <li><i class="fa fa-user"></i><a href="#">Admin Login</a></li>
            <li><i class="fa fa-home"></i><a href="addHome.jsp">Add Homestays</a></li>
            <li><i class="fa fa-home"></i><a href="#">View Homestays</a></li>
            <li><i class="fa fa-hotel"></i><a href="addHotel.jsp">Add Hotels</a></li>
            <li><i class="fa fa-hotel"></i><a href="#">View Hotels</a></li>
            <li><i class="fa fa-location-dot"></i><a href="addPlace.jsp">Add Places</a></li>
            <li><i class="fa fa-location-dot"></i><a href="viewPlace">View Places</a></li>
            <li><i class="fa fa-id-card"></i><a href="#">Booking Details</a></li>
            <li><i class="fa fa-id-card"></i><a href="ContactCtrl">Enquiries</a></li>
        </div>
    </section>

    <section id="interface">
        <div class="navigation">
            <div class="n1">
                <div class="search">
                    <p>The Travel Encyclopedia !</p>
                </div>
            </div>
        </div>

    </section>
</body>

</html>



