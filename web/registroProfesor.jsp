<%-- 
    Document   : registroProfesor
    Created on : 13-sep-2016, 20:22:15
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
        <form method="post" action="./RegistroProfesor">
            <h2>Registrar profesor</h2><br/>
            <label>Nombre:</label>
            <input type="text" placeholder="juan" name="nombre_profesor" id="nombre_profesor"/>
            <label>Documento:</label>
            <input type="text" placeholder="1298423894" name="documento_profesor" id="documento_profesor"/>
            <label>Area</label>
            <input type="text" placeholder="Matematicas" name="area_profesor" id="area_profesor"/>
            <button type="submit">Crear profesor</button>
        </form>
    </body>
</html>
