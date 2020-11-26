<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>
 
<!DOCTYPE html>
<html>
<head>
 <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Popper JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script> 

<meta charset="ISO-8859-1">
<title>Registrazione avvenuta</title>
</head>
<body>

	
	
		<div class='card'>
		    <div class='card-header'>
		    	<s:property value="successMessage"/> <br>
		        <s:text name="Scheda del"/> <s:property value="ruolo"/> 
		    </div>
		    <div class='card-body'>
					
		    
		        <div class='table-responsive'>
		            <table class='table table-striped ' >
		                <thead>
		                    <tr>
		                        <th>Campo</th>
		                        <th>Valore</th>
		                    </tr>
		                </thead>
		                <tbody>
	                      
		                  <tr>
		                    <td>Nome</td>
		                    <td><s:property value="nome"/></td>
		                  </tr>
		                      
		                  <tr>
		                    <td>Cognome</td>
		                    <td><s:property value="cognome"/></td>
		                  </tr>
		                  
	
		              </tbody>
		            </table>
		        </div>
		   
			<!-- end card-body -->			   
		    </div>
		</div>	
	
	
</body>
</html>