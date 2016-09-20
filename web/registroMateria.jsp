<%-- 
    Document   : registroMateria
    Created on : 13-sep-2016, 20:55:19
    Author     : fabricio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post" action="./RegistroMateria">
            <h2>Registrar materia</h2><br/>
            <label>Nombre:</label>
            <input type="text" placeholder="biologia" name="materia" id="materia"/>
            <label>Nivel</label>
            <input type="text" placeholder="1" name="nivel" id="nivel"/>
            <button type="submit">Crear materia</button>
        </form>
    </body>
</html>
