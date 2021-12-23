<%-- 
    Document   : alumnos
    Created on : 23 nov 2021, 10:56:56
    Author     : Antony
--%>

<%@page import="modelo.AlumnosDao"%>
<%@page import="java.util.List"%>
<%@page import="modelo.Alumnos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado de Alumnos</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    </head>
    <body>
        <h1 class="text-center">Listado de Alumnos</h1>
        <div class="container"> 
            <div class="row">
                <a class="btn btn-primary col-md-4 m-4" href="AlumnosController?accion=nuevo">Agregar Alumno</a>
                <table class="table table-primary">
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Nombre</th>
                            <th>Apellidos</th>
                            <th>Email</th>
                            <th>Telefono</th>
                            <th>Modificar</th>
                            <th>Eliminar</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            List<Alumnos> resultado = null;
                            AlumnosDao alumno = new AlumnosDao();
                            resultado = alumno.listarAlumnos();
                            for (int i=0;i < resultado.size();i++){
                            String ruta = "AlumnosController?accion=modificar&id="+resultado.get(i).getId();
                            String rutaE = "AlumnosController?accion=eliminar&id="+resultado.get(i).getId();
                            %>
                            <tr>
                                <td><%=resultado.get(i).getId()%></td>
                                <td><%=resultado.get(i).getNombres()%></td>
                                <td><%=resultado.get(i).getApellidos()%></td>
                                <td><%=resultado.get(i).getEmail()%></td>
                                <td><%=resultado.get(i).getTelefono()%></td>
                                <td><a class="btn btn-success" href=<%=ruta%>>Mod</a></td>
                                <td><a class="btn btn-danger" href=<%=rutaE%>>Sup</a></td>
                            </tr>
                            <%
                            }
                        %>
                    </tbody>
                </table>
            </div>
        </div>
    </body>
</html>
