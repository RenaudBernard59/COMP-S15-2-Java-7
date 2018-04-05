<%-- 
    Document   : SaisieNombres02
    Created on : 5 avr. 2018, 11:43:32
    Author     : renob
--%>
<%@page language="java"%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulaire Dynamique de Saisie</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
          int inbvaleur = 0;  
          if(session.getAttribute("NbValeur")!=null) {
              inbvaleur = (int) session.getAttribute("NbValeur");
          }//END if
          %>
        <form method="post" action="Traitement02">
        <%
          for(int i=0; i<inbvaleur;i++) {
        %>
        <label>Saisie du nombre <%=i%> : </label>
        <input type="text" name="sval<%=i%>" required=""/>
        <%
          }//END for
        %>
        <input type="submit" title="Envoyer"/>
    </body>
</html>
