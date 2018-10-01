<%@ tag language="java" pageEncoding="ISO-8859-1" %>
<%@ attribute name="title" required="true" rtexprvalue="true" %>
<%@ attribute name="content" fragment="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; ISO-8859-1">
    <!-- <link type="text/css" rel="stylesheet" href="css/style.css"> -->
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
    
    <script
	  src="https://code.jquery.com/jquery-3.3.1.min.js"
	  integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
	  crossorigin="anonymous">
    </script>
     <script src="https://cdnjs.cloudflare.com/ajax/libs/core-js/2.5.6/core.min.js"></script>
     <script src="${pageContext.request.contextPath}/resources/scripts/script.js"></script>
    
    <title>${title}</title>
</head>

<body>

    <header>
        <nav>
            <div class="logo">
<!--             		
			<div class=" tooltip">
                <span class="tooltiptext">
                Disclaimer: this web application is for demonstration purposes only, and not intended to be used for commercial purposes.  
			    No portion of this application may be relied upon for actual market data.  
			    	Portions of this web application may contain proprietary information and artifacts.  
			    	No permission has been sought or granted to use such artifacts, and as such, may be in violation of copyright law.  
			    	It is up to the owners of proprietary artifacts, if any, to pursue protection of their intellectual property.    
				</span>
			</div> 
-->
            </div>
            <div class="nav2">
                <a href="${pageContext.request.contextPath}/" class="navLinks">Home</a>
            </div>
            <div class="nav3">
          		<a href="${pageContext.request.contextPath}/about" class="navLinks">About</a>
            </div>
             <c:choose>
           		<c:when test = "${empty loggedInUser }">
		            <div class="nav4">
		            	<a href="${pageContext.request.contextPath}/login" class="navLinks">Watchlist</a>
		            </div>
            	</c:when>
           		<c:otherwise>
				    <div class="nav4">
		            	<a href="${pageContext.request.contextPath}/listData" class="navLinks">Watchlist</a>
		            </div> 
           		</c:otherwise>
           	</c:choose>   
            <div class="nav5">
            </div>
            <div class="nav6">
            </div>
           	<c:choose>
           		<c:when test = "${empty loggedInUser }">
            		<div class="nav7">
	            		<span></span>
	            	</div>	
	            	<div class="nav8">
           				<a href="login" class="navLinks">Login</a>
           			</div>
           		</c:when>
           		<c:otherwise>
            		<div class="nav7">
            			<span >Hello ${ loggedInUser }! </span>
           			</div>
           			<div class="nav8">
           				<a href="${pageContext.request.contextPath}/logout"  class="navLinks">Logout</a>
           			</div>
           		</c:otherwise>
           	</c:choose>
            <div class="nav9">
            </div>
        </nav>
    </header>

    <main>
    		<jsp:invoke fragment="content"></jsp:invoke>
    </main>


    <footer>
    <p id="disclaimer">Disclaimer: this web application is for demonstration purposes only, and not intended to be used for commercial purposes.  
    No portion of this application may be relied upon for actual market data.  
    	Portions of this web application may contain proprietary information and artifacts.  
    	No permission has been sought or granted to use such artifacts, and as such, may be in violation of copyright law.  
    	It is up to the owners of proprietary artifacts, if any, to pursue protection of their intellectual property.    
	</p>    	  
    	 
        <p id="footer">&copy; 2018 Edward Dupre &middot; <a href="http://www.edwarddupre.com.s3-website.us-east-2.amazonaws.com/">My Portfolio</a> &middot; <a href="#">Back to top</a></p>
    </footer>
</body>
</html>