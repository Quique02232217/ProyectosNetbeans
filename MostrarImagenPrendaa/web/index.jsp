<%-- 
    Document   : index
    Created on : Sep 29, 2023, 5:09:48 PM
    Author     : User
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <div>
            <form action="Controler" method="POST">
                <input type="submit" name="accion" value="Listar">
                <input type="submit" name="accion" value="Nuevo">

            </form>
            <hr>
            <table border="1">
                <thead>

                </thead>
                <tbody>
                <c:forEach var="dato" items="${lista}">
                    <tr>
                        <td>${dato.getId()}</td>
                        <td>${dato.getNombre()}</td>
                        <td><img src="ControlerIMG?id=${dato.getId()}" width="250" height="230"></td>
                        <td>
                            <form action="Controler" method="POST">
                                <input type="submit" name="accion" value="Listar">
                                <input type="submit" name="accion" value="Nuevo">

                            </form>


                        </td>
                    </tr>

                </c:forEach>
                <tr> 
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>

                </tbody>

            </table>

        </div>

    </center>
</body>
</html>
