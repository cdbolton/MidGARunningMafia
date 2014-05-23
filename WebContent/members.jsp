<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="shortcut icon" href="assets/ico/favicon.ico">

    <title>MidGA Running Mafia</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    
    <!-- Custom styles for this template -->
    <link href="css/cover.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    
    <link href="css/social-buttons.css" rel="stylesheet">
	<link href="css/font-awesome.min.css" rel="stylesheet">
  </head>
  		
  <body>
    <div class="site-wrapper">

      <div class="site-wrapper-inner">

        <div class="cover-container">
       
	       <div class="masthead clearfix">
		         <div class="inner">
			         <h3 class="masthead-brand">MidGA Running Mafia</h3>
	        	     <ul class="nav masthead-nav">
		      	          <li><a href="index.jsp">Home</a></li>
		                  <li><a href="about.jsp">About</a></li>
		            	  <li class="active"><a href="members.jsp">Members</a></li>
		            	  <li class="dropdown">
				              <a href="#" class="dropdown-toggle" data-toggle="dropdown">Races<b class="caret"></b></a>
				              <ul class="dropdown-menu">
				                <li><a href="raceCalendar.jsp">Race Calendar</a></li>
				                <li><a href="raceResults.jsp">Race Results</a></li>
				                <li><a href="qualifyingTimes.jsp">Qualifying Times</a></li>
				              </ul>
				          </li>
		             </ul>
	             </div>
	      </div>
	      
	
	      <div class="inner cover">
	            <h1 class="cover-heading">Members</h1>
	            <%
	            	String[] nameList = (String[]) request.getAttribute("nameList");
	            	String[] dateList = (String[]) request.getAttribute("dateList");
	            	String[] accompList = (String[]) request.getAttribute("accompList");	
				%>
	            <p class="lead">
	            	<table class="table">
	            			<tr>
	            				<td><c:out value="Name"/></td>
	            				<td><c:out value="Birthdate"/></td>
	            				<td><c:out value="Accomplishments"/></td>
	            				<td><c:out value="Picture"/></td>
	            			</tr>
		            		<c:forEach items="${nameList}" varStatus="loop">	
							    <tr>
							    	<td><c:out value="${nameList[loop.index]}" /></td>
							    	<td><c:out value="${dateList[loop.index]}"/></td>
							    	<td><c:out value="${accompList[loop.index]}"/></td>
							    </tr>
				
							</c:forEach>
	            		
	            	</table>			
	            </p>
	            
	           
	      </div>
	         
          <div class="mastfoot">
            <div class="inner">
              <form action="https://www.facebook.com/MidGaElite">
              	<button type="submit" class="btn btn-facebook"><i class="fa fa-facebook"></i> | Connect with Facebook</button>
              </form>
            </div>
          </div>

        </div>

      </div>

    </div>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/docs.min.js"></script>
  </body>
</html>
