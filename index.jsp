<%@page import="models.Poruka"%>
<%@page import="java.util.ArrayList"%>
<%@page import="models.Model"%>
<%@page import="models.Korisnik"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% Korisnik korisnik = (Korisnik)request.getAttribute("korisnik"); %>
<% ArrayList<Model> poruke = (ArrayList<Model>)request.getAttribute("poruke"); %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Prijavljen</title>
    </head>
    <body>
        <h1>Dobro dosao <%= korisnik.getIme_prezime() %></h1>
        
        <% for (Model poruka: poruke) { %>
            <h2><%= ((Poruka)poruka).getKorisnik().getIme_prezime() %> /
                <%= ((Poruka)poruka).getVreme() %></h2>
            <p><%= ((Poruka)poruka).getPoruka() %></p>
            <hr> 
        <% } %>
    </body>
</html>
