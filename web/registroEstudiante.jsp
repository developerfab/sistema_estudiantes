<%-- 
    Document   : RegistroEstudiante
    Created on : 13-sep-2016, 19:46:47
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
        <form method="post" action="./RegistroEstudiante">
            <h2>Registrar estudiante</h2><br/>
            <label>Nombre:</label>
            <input type="text" placeholder="juan" name="nombre_estudiante" id="nombre_estudiante"/>
            <label>Documento:</label>
            <input type="text" placeholder="1298423894" name="documento_estudiante" id="documento_estudiante"/>
            <label>Carrera</label>
            <input type="text" placeholder="Ingenieria de sistemas" name="carrera_estudiante" id="carrera_estudiante"/>
            <button type="submit">Crear Estudiante</button>
        </form>
    </body>
</html>
