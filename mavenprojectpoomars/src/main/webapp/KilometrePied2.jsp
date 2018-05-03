<%-- 
    Document   : KilometrePied2
    Created on : 3 mai 2018, 14:11:40
    Author     : renob
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Kilomètre à Pied</title>
    </head>
    <body>
        <h1>Kilomètre à Pied Résultat</h1>
        <%
        String kilom = " kilomètre à pied, ça use";
        String kiloms = " kilomètres à pied, ça use";
        String caUse = ", ça use, ";
        String souliers = " les souliers.\n";
        int i = 3;
        for(int j=1; j<=i;j++) { 
            if (j == 1) {
        %>        
            <p><% i + kilom + caUse + i + kilom + souliers %></p>
        <%
            } else {
        %>
           <p><% i + kiloms + caUse + i + kiloms + souliers %></p>
        <%
                    }//END For}
        %>

    </body>
</html>
