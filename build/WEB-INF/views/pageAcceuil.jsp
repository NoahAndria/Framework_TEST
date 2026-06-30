<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.time.*" %>
<%@ page import="java.util.*" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="myframework.utils.Mapping" %>
<%@ page import="myframework.utils.UrlMethod" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Accueil - BankWebsite</title>
    <link rel="stylesheet" href="/BankWebsite/assets/chequeList.css">
</head>
<body>

    <div class="page-wrapper" style="max-width:540px;">
        <div class="card" style="margin-top:60px;text-align:center;">
            <h1>Bienvenue</h1>
            <p style="color:#777;margin-bottom:28px;">ETU003915</p>

        </div>
    </div>


    
    <%
    Map<UrlMethod, Mapping> mappings = (Map<UrlMethod , Mapping>) request.getAttribute("mappings");
    if (mappings != null && !mappings.isEmpty()) {
        for (Map.Entry<UrlMethod, Mapping> m : mappings.entrySet()) {
            %>
                <div class="card" style="margin-top:20px;text-align:center;">
                    <p><%= m.getKey().getUrl() %></p>
                    <p><%= m.getKey().getMethod() %></p>
                    <p><%= m.getValue().getPackageName() %></p>
                    <p><%= m.getValue().getMethodeName() %></p>
                </div>
            <%
        }

    }
    %>

    <%
        Mapping mapping = (Mapping) request.getAttribute("mapping");
        if(mapping != null) {
    %>
            <div class="card" style="margin-top:20px;text-align:center;">
                <p><%= request.getAttribute("url") %></p>
                <p><%= request.getAttribute("method") %></p>
                <p><%= mapping.getPackageName() %></p>
                <p><%= mapping.getMethodeName() %></p>
            </div>
    <%
        } else {
    %>
            <div class="card" style="margin-top:20px;text-align:center;">
                <p>Aucune correspondance trouve pour l'URL </p>
            </div>
    <%
        }
    %>