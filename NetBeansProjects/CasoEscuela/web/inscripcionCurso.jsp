<%-- 
    Document   : inscripcionCurso
    Created on : 21/03/2015, 01:06:40 PM
    Author     : Sergio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form name="form2" action="registro" method="post" > 
            <div class="tabla">
                <center>
                    <table>
                        <h1><strong>Inscripcion Curso</strong></h1></td>   
                        <label for="asignatura" class="labele">Asignatura<font color="#FF0000">*</label></font>
                        <input name="asignatura" type="text" id="asignatura" placeholder="Asignatura" required class="form-control inputtext">
                        <br>
                         <label for="horario" class="labele">Curso<font color="#FF0000">*</label></font>
                        <input name="horario" type="text" id="documento" placeholder="Horario" required class="form-control inputtext">
                                                <br>
                        <br>
                        <input name="registrar" class="btn btn-success"  type="submit" id="registrar" value="Registrar">
                        <br>
                        <br>
                        <%
                            if (request.getParameter("no") != null) {
                        %>
                        <div>
                            <b div clas="valido"> sus datos no son validos. <a href="registro.jsp"> Registrese</a></b>
                        </div>
                        <%
                            }
                        %>  
                    </table>
                </center>
            </div>
        </form>
    </body>
</html>
