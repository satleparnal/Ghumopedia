<%@page import="com.final_Project.DTO.ContactUs"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.final_Project.DTO.AddPlace"%>
<%@page import="java.util.ArrayList"%>

<html lang="en">

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
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
        integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
    <style>
        * {
            font-family: 'Poppins';
        }
    </style>
    <link rel="stylesheet" href="admin.css">
</head>

<body>
    <section id="menu">
        <div class="logo">
            <img src="logo3.png" alt="">
            <p>HUMOPEDIA</p>
        </div>
        <div class="items">
            <li><i class="fa fa-user"></i><a href="L.html">Admin Login</a></li>
            <li><i class="fa fa-home"></i><a href="addhome.jsp">Add Homestays</a></li>
            <li><i class="fa fa-home"></i><a href="#">View Homestays</a></li>
            <li><i class="fa fa-hotel"></i><a href="addhotel.jsp">Add Hotels</a></li>
            <li><i class="fa fa-hotel"></i><a href="#">View Hotels</a></li>
            <li><i class="fa fa-location-dot"></i><a href="addplace.jsp">Add Places</a></li>
            <li><i class="fa fa-location-dot"></i><a href="viewPlace">View Places</a></li>
            <li><i class="fa fa-id-card"></i><a href="bookingdetails.jsp">Booking Details</a></li>
            <li><i class="fa fa-id-card"></i><a href="ContactCtrl">Enquiries</a></li>
        </div>
    </section>

<%
	ArrayList<ContactUs> list = (ArrayList<ContactUs>)request.getAttribute("LIST");


%>

    <section id="interface">
        <div class="navigation">
            <div class="n1">
                <div class="search">
                    <p>The Travel Encyclopedia !</p>
                </div>
            </div>
        </div>
        
        <h2 style="text-align: center;">Enquiries</h2> 
	<table border="2" class="table m-3">
		<thead class="thead-dark"> 
	<th>Name</th>
	<th>Email</th>
	<th>Phone Number</th>
	<th>Subject</th>
	<th>Message</th>
	<th>Deletion</th>
	
	</thead>
	<%
	for(ContactUs a : list){
	%>
	<tr>
	<td><%= a.getName()%></td>
	<td><%= a.getEmail()%></td>
	<td><%= a.getPhoneNumber()%></td>
	<td><%= a.getSubject1()%></td>
	<td><%= a.getMessage()%></td>
	<td><a href="#"class="btn btn-danger">Delete</a></td>
	
	
	</tr>
	<%
	}
	%>
	</table>
        
    </section>
</body>

</html>