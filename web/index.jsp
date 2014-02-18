<%@page import="bancoWeb3.datos.HibernateUtil"%>
<%@page import="bancoWeb3.datos.EntidadBancariaDAOImplHibernate"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="bancoWeb3.negocio.TipoEntidadBancaria"%>
<%@page import="bancoWeb3.negocio.EntidadBancaria"%>
<%@page import="bancoWeb3.datos.EntidadBancariaDAO"%>
<%

    EntidadBancariaDAO entidadBancariaDAO = new EntidadBancariaDAOImplHibernate();

    //Mostrar muchas entidades bancarias    

    List<EntidadBancaria> entidadesBancarias;
    entidadesBancarias = entidadBancariaDAO.findAll();

    String nombreBuscado = request.getParameter("nombre");
    List<EntidadBancaria> entidadBancariaBuscadaGet;
    entidadBancariaBuscadaGet = entidadBancariaDAO.findByNombre(nombreBuscado);

%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>BancoWeb</h1>

        <div>
            <table>
                <% for (EntidadBancaria entidadBancaria : entidadBancariaBuscadaGet) {
                %><tr>  
                    <td><%= entidadBancaria.getIdEntidadBancaria()%></td>
                    <td><%= entidadBancaria.getCodigoEntidadBancaria()%></td>
                    <td><%= entidadBancaria.getNombre()%></td>
                    <td><%= entidadBancaria.getCif()%></td>    
                    <td><%= entidadBancaria.getTipoEntidadBancaria()%></td>
                    <td><a href="delete.jsp?idEntidadBancaria=<%= entidadBancaria.getIdEntidadBancaria()%>" class="btn" >Borrar</a></td>
                    <td><a href="newForUpdate.jsp?idEntidadBancaria=<%= entidadBancaria.getIdEntidadBancaria()%>" class="btn" >Editar</a></td>
                </tr>
                <%}%>
            </table>
        </div>
    </body>
</html>