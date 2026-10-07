<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="entities.Jouet" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Accueil - BankWebsite</title>
    <link rel="stylesheet" href="/BankWebsite/assets/chequeList.css">
</head>
<body>

</body>
<%
    Jouet j = (Jouet) request.getAttribute("jouet");
    String name = j.getNomJouet();
    double prix = j.getPrixJouet();
    String description = j.getDescriptionJouet();
    String randomInput = (String) request.getAttribute("randomInput");
%>
<%= name %>
<%= prix %>
<%= description %>
<%= randomInput %>
</body>