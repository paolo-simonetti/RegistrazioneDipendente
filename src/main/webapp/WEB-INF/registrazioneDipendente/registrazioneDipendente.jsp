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

<script>
$(document).ready(function(){
  $("#nome").keydown(function(){
	
    $(this).css("border-color","green");
  });
  
  $("#cognome").keydown(function(){
	    $(this).css("border-color","green");
  });

  $("#email").keydown(function(){
	    $(this).css("border-color","green");
  });
 
});
</script>

<!-- Popper JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script> 



<meta charset="ISO-8859-1">
<title>Registrazione dipendente</title>
</head>
<body>
<div class="container">
<div class='card'>
   <div class='card-header'>
     <s:text name="Compila il seguente modulo per completare la registrazione"/>
   </div>

   <div class='card-body'>
     <s:text name="I campi con * sono obbligatori"/>
  
     <s:form action="/action/RegistraDipendente">
       <div class="row">
       <div class="col">
         <s:textfield key="Nome*" name="nome" id="nome"/>
       </div>
       <div class="col">
         <s:textfield key="Cognome*" name="cognome" id="cognome"/>
       </div>
     </div>

     <br>
  

     <div class="form-row">
       <div class="col">
         <s:textfield name="eta" key="Eta"/>
       </div>
       <div class="col">
         <s:textfield name="dataNascita" key="Data di nascita" id="dataNascita"/>
       </div>
     </div>
 
 
     <div class="form-row">
       <div class="col">
         <s:select name="ruolo" label="Ruolo" list="{'magazziniere', 'impiegato','manager'}"/>
       </div>
       <div class="col">
         <s:textfield name="email" key="Indirizzo e-mail*" id="email"/>
       </div>
     </div>
   
   
    <button type="submit" name="submit" value="submit" id="submit" class="btn btn-primary">Conferma</button>
  </s:form> 
    
  </div>

  </div>
</div>

</body>
</html>


