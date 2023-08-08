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
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css"
        integrity="sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A=="
        crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link href='https://fonts.googleapis.com/css?family=Poppins' rel='stylesheet'>
    <style>
        * {
            font-family: 'Poppins';
        }
    </style>
    <link rel="stylesheet" href="addHotel.css">
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
        <div class="container">
            <form class="form" id="login">
                <span class="title">Add Hotel</span>
                <div class="form__input-error-message"></div>
                
                <div class="form__input-group">
                    <input type="text" class="form__input" autofocus placeholder="Enter Hotel Name" >
                    <i class="fa-solid fa-building"></i>
                    <div class="form__input-error-message"></div>
                </div>
                
                <div class="form__input-group">
                    <input type="text" class="form__input" autofocus placeholder="Enter Hotel ID">
                    <i class="fa-solid fa-building-circle-check"></i>
                    <div class="form__input-error-message"></div>
                </div>

                <div class="form__input-group">
                    <input type="text" class="form__input" autofocus placeholder="Enter Description">
                    <i class="fa-solid fa-font"></i>
                    <div class="form__input-error-message"></div>
                </div>
                
                <div class="form__input-group">
                    <input class="form__input" type="file" multiple>
                    <i class="fa-regular fa-images"></i>
                    <div class="form__input-error-message"></div>
                </div>
                
                <div class="form__input-group">
                    <input type="text" class="form__input" autofocus placeholder="Hotel Price">
                    <i class="fa-solid fa-indian-rupee-sign"></i>
                    <div class="form__input-error-message"></div>
                </div>

                <div class="form__input-group">
                    <input type="rating" class="form__input" autofocus placeholder="Hotel Rating">
                    <i class="fa-solid fa-star"></i>
                    <div class="form__input-error-message"></div>
                </div>
                
                <button class="form__button" type="submit">Add Hotel</button>
            </form>
        </div>
    </section>
</body>

</html>