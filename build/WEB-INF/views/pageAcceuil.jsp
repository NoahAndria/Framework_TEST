<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.time.*" %>
<%@ page import="java.util.*" %>

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
        List<String> cnames = (ArrayList<String>) request.getAttribute("liste");
        if (cnames != null && !cnames.isEmpty()) {
            for (String s : cnames) {
    %>
            
                <div class="card" style="margin-top:20px;text-align:center;">
                    <p><%= s %></p>
                </div>
    <%
    
            }
        }
    %>
