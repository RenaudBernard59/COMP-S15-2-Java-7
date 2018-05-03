<%-- 
    Document   : Saisie Nombre
    Created on : 5 avr. 2018, 10:24:32
    Author     : renob
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Saisie de nombre</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <form method="post" action="Traitement01"> 
            <label>Saisie du nombre : </label> 
            <input type="text" name="NbValeur" required/> 
            <br/> 
            <input type="submit" title="Envoyer"/> 
        </form> 
    </body>
</html>
