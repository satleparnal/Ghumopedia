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
    <link rel="stylesheet" href="addHome.css">
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
            <li><i class="fa fa-id-card"></i><a href="bookingdetails.html">Booking Details</a></li>
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
        <div class="kick">
            <div class="container">
            <%
			String m = (String) request.getAttribute("msg");
			if (m != null) {
				out.println("<h4 style='color:green;'>" + m + "</h4>");
			}
			%>
                <form class="form" id="login" action="AddHomeCtrl" method="post"
				enctype="multipart/form-data">
            <span class="title">Add Homestay</span>
           

            <div class="form__input-group">
                <input type="text" class="form__input" name="homestayName" autofocus placeholder="Enter Homestay Name">
                <i class="fa-solid fa-house"></i>
            </div>

         
            <div class="form__input-group">
                <input type="" class="form__input" name="homestayDescription" autofocus placeholder="About Homestay">
                <i class="fa-solid fa-house-circle-check"></i>
            </div>

            <div class="form__input-group">
                <textarea class="form__input" name="homestayHost" rows="4" cols="50" autofocus placeholder="About Host and contact no"></textarea>
                <i class="fa-solid fa-font"></i>
            </div>
			
            <div class="form__input-group">
                <textarea class="form__input" name="homestayFood" rows="4" cols="50" autofocus placeholder="Food facility include breakfast, lunch and dinner"></textarea>
                <i class="fa-solid fa-font"></i>
            </div>
            <div class="form__input-group">
                <textarea class="form__input" name="homestayFacility" rows="4" cols="50" autofocus placeholder="Facilities ex: parking | Internet | Pool"></textarea>
                <i class="fa-solid fa-font"></i>
            </div>

            <div class="form__input-group">
                <textarea class="form__input" name="homestayAttraction" rows="4" cols="50" autofocus placeholder="Local Attractions: something(3km) | something(3km) | something(3km)"></textarea>
                <i class="fa-solid fa-font"></i>
            </div>
			
            <div class="form__input-group">
                <textarea class="form__input" name="homestayExcursion" rows="4" cols="50" autofocus placeholder="Attractions: DayTrip(20km) | DayTrip(20km) | DayTrip(20km)"></textarea>
                <i class="fa-solid fa-font"></i>
            </div>

            <div class="form__input-group">
                <input type="text" class="form__input" name="homestayNoOfRooms" autofocus placeholder="No. of Rooms">
                <i class="fa-solid fa-people-roof"></i>
            </div>

            <div class="form__input-group">
                <input type="text" class="form__input" name="homestayPrice" autofocus placeholder="Homestay Price">
                <i class="fa-solid fa-indian-rupee-sign"></i>
            </div>

            <div class="form__input-group">
                <input class="form__input" name="homestayPhoto1"  type="file" multiple>
                <i class="fa-regular fa-images"></i>
            </div>

           

                <button class="form__button" type="submit">Add Homestay</button>
        </form>
            </div>
        </div>
    </section>
</body>

</html>