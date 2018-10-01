<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="mt" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">  
<mt:cssgrid_template title="Home page">
	<jsp:attribute name="content">
		<content class="container">
            <div class="item item1"><br></div>
	        <div class="item item2"></div>
	        <div class="item item3"></div>
	        <div class="item item4"></div>
	        <div class="item item5"></div>
            <c:choose>
           		<c:when test = "${empty loggedInUser }">
			        <div class="item item6">
			        	<a href="${pageContext.request.contextPath}/login">
				        	<img id="Image1" src="${pageContext.request.contextPath}/resources/images/YahooFinanceWatchlist201806220910.png" alt="home page image">
			        	</a>
			        </div>
           		</c:when>
           		<c:otherwise>
		            <div class="item item6">
			        	<a href="${pageContext.request.contextPath}/listData">
				        	<img id="Image1" src="${pageContext.request.contextPath}/resources/images/YahooFinanceWatchlist201806220910.png" alt="home page image">
			        	</a>
			        </div>
           		</c:otherwise>
           	</c:choose> 
	        <div class="item item7">
		        <c:choose>
	           		<c:when test = "${empty loggedInUser }">
			        	<h1>
			        		<a href="${pageContext.request.contextPath}/login">
			        		Yahoo Finance<br>Watchlist Scraper</a>
			        	</h1>
	            	</c:when>
	           		<c:otherwise>
			        	<h1>
			        		<a href="${pageContext.request.contextPath}/listData">
			        		Yahoo Finance<br>Watchlist Scraper</a>
			        	</h1>
	           		</c:otherwise>
	           	</c:choose>
				<article class="my-article">
					<p>The server time is: ${serverTime}</p>
					<p>
					<em>A CareerDevs web scraper project demonstrating basic principles of web scraping.&nbsp;&nbsp;</em>  
					With a made up Yahoo Finance portfolio of 10 stocks, I implement several web technologies, 
					frameworks and libraries including Java, Selenium and Spring MVC 
					to scrape data from Yahoo Finance and display it to the user.
					Design Patterns guided my development process, 
					including Factory Pattern and State Pattern adapted from the book  
					Design Patterns - Elements of Reusable Object-oriented Software, by Gang of Four, 1994.
					</p>
					<p>
					The homepage design started as a JSTL single page application, then I added a CSS Grid nav bar and 
					the other elements on this page.  
					Stock data is accessible by clicking on the stock symbol in the scraper results pane. 
					</p>
					<p>
					<strong>Coming soon --> D3.js charts!</strong>   
					</p>
				</article>  
	        
	        </div>
	        <div class="item item8"></div>
	        <div class="item item9"></div>
	        <div class="item item10"></div>
	        <div class="item item11"></div>
	        <div class="item item12"></div>
	        <div class="item item13"></div>
        </content>
		<style>

/* 			.container {
			    display: grid;
			    grid-template-columns: repeat(9, 1fr);
			    grid-gap: 10px;
			    align-items: center;
			    text-align: left;
			    border-bottom: 1px solid black;
			} */
			
/*  			content {
			    display: grid;
			    align-items: center;
			} */
			
			img {
				height: repeat(4, 1fr);
				width: repeat(4, 1fr);
				align-items: center;
			}
			
			.item {
				align-items: center;
			}
			
			.item1 {
			    grid-column: 1;
			    grid-row: 1;
			}
			
			.item2 {
			    grid-column: 2;
			}
			
			.item3 {
			    grid-column: 3;
			}
			
			.item4 {
 			    grid-column: 4;
			}
			
			.item5 {
			    grid-column: 1;
			}
			
			.item6 {
			    grid-column: 5 / 9;
			    grid-row: 2 / 4;
			}
			
			.item7 {
	            /* background: #bada55; */
	           	grid-column: 2 / 5;
	            grid-row: 2 / 4;
	        }

			.item8 {
			    grid-column: 1;
			}
						
/* 			.item9 {
			    grid-column: 4;
			}
			
			
			.item10 {
			    grid-column: 1;
			}
						
			.item11 {
			    grid-column: 2;
			}
			
			
			.item12 {
			    grid-column: 3;
			}
						
			.item13 {
			    grid-column: 4;
			} */
			
			.launcher {
				display: inline-block;
			    font-family: 'Ubuntu', sans-serif;
			    font-size: 1.6em;
			    font-weight: 400;
			    text-transform: uppercase;
			    text-decoration: none;
			    color: #e3deee;
			    background-color: #400098;
			}
			
			.launcher:hover {
			    color: #0df400;
			    font-weight: 400;
			}
			
			@keyframes blink {
			    0% {
			        opacity: 1;
			    }
			    42% {
			        opacity: 1;
			    }
			    50% {
			        opacity: 0;
			    }
			    100% {
			        opacity: 1;
			    }
			}
			
			#Image2 {
			    animation: blink 3s;
			    animation-iteration-count: 2;
			}
						
	</style>
	

	</jsp:attribute>
</mt:cssgrid_template>    
