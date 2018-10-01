<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="mt" tagdir="/WEB-INF/tags" %>

<% response.addHeader("Refresh","35"); %>

<mt:cssgrid_template title="List Data">
	<jsp:attribute name="content">
		<content class="container">
		
			<div class="item item1"></div>
			<div class="item item2"></div>
			<div class="item item3">
				<!-- <div id="wrapper"> -->
					<div id="header">
						<h2>YFWS - Yahoo Finance Watchlist Scraper - A CareerDevs Student Project</h2>
					</div>
 				<!-- </div> -->
			</div>

			<div class="item item4">	
				<div id="wrapper">
					<!-- <div id="header"> -->
					<div class="form-group form">
						<!--  add our html table here -->
						<form action="login" method="POST">
							<h1>Please login. <span style="color: red">${loginError}</span></h1>
							NOTE: This login is just a bot stopper.  Humans can input any username and password.<br>
							I did not implement a registration process in this demo app.  My main objective for this app<br>
							is to demonstrate my web scraper and database programming abilities.<br>
							I want this demo app to be as easy as possible for you the visitor. Welcome.<br><br>
							<div>
								<label for="username">Username:</label>
								<input type="text" id="userId" name="userId" placeholder="user name" class="form-control"/>
							
								<label for="password">Password:</label>
								<input type="password" id="password" name="password" placeholder="password" class="form-control"/>
							
							<button id="loginButton" class="form-control">Login</button>
							</div>
						</form>
					</div>
					<!-- </div> -->
				</div>
			</div>
			<div class="item item5"></div>
			<div class="item item6"></div>
			<div class="item item7"></div>	
			<div class="item item8"></div>
			<div class="item item9"></div>				
		</content>
		<style>
			.container {
			    display: grid;
			    grid-template-columns: repeat(9, 1fr);
			    grid-template-rows: 3;
			    grid-gap: 1em;
			    align-items: center;
			    text-align: left;
			    border-bottom: 1px solid black;
			}
			
			content {
			    display: grid;
			    grid-template-columns: repeat(9, 1fr);
			    /* grid-template-rows: 3; */
			    grid-gap: 1em;
			    align-items: center;
			    text-align: center;
			    border-bottom: 1px solid black;
			}
			
			.item1 {
			    grid-column: 1 / -1;
			}
			
			.item2 {
			    grid-column: 2;
			}
			
			.item3 {
			    grid-column: 2 / 9;
			    grid-row: 2;
			}
			
			.item4 {
			    grid-column: 2 / 9;
			}
			    
			.item5 {
			    grid-column: 5;
			}
			
			.item9 {
			    grid-column: 9;
			}
			
			table {   
				border-collapse:collapse;
				border-bottom:1px solid gray;
				font-family: Tahoma,Verdana,Segoe,sans-serif;
				width:99%;
			}
			 
			th {
				border-bottom:1px solid gray;
				background:none repeat scroll 0 0 #410093;
				/* padding:10px; */
				color: #FFFFFF;
			}
			
			tr {
				border-top:1px solid gray;
				text-align:center;
				marketCap:10px;
			}
			
			#marketCap {
				marketCap:10px;
			}
			 
			tr:nth-child(odd) {background: #FFFFFF}
			tr:nth-child(even) {background: #BBBBBB}	
			 
			#wrapper {width: 100%; margin-top: 2px; }
			#header {width: 100%; background: #410093; margin-top: 0px; padding:5px 5px 5px 15px;}
			#header h2 {width: 100%; margin:auto; color: #FFFFFF;}
			#container {width: 100%; margin:auto}
			#container h3 {color: #000;}
			#container #content {margin-top: 2px;}
			
			.add-stock-button {
				border: 1px solid #666; 
				border-radius: 5px; 
				padding: 4px; 
				font-size: 12px;
				font-weight: bold;
				width: 120px; 
				padding: 5px 10px; 
				
				margin-bottom: 15px;
				background: #cccccc;
			}
			
			.yahoo_color{
				background: #410093;
			}
	
		</style>

	</jsp:attribute>
</mt:cssgrid_template> 
