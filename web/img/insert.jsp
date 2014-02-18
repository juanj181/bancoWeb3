<%-- 
    Document   : insert
    Created on : 18-feb-2014, 1:22:11
    Author     : Jj
--%>

<%@page import="bancoWeb3.datos.EntidadBancariaDAOImplHibernate"%>
<%@page import="bancoWeb3.negocio.EntidadBancaria"%>
<%@page import="bancoWeb3.datos.EntidadBancariaDAO"%>
<%@page import="bancoWeb3.negocio.TipoEntidadBancaria"%>
<%
    String codigo = request.getParameter("codigo");
    String nombre = request.getParameter("nombre");
    String cif = request.getParameter("cif");
    
    TipoEntidadBancaria tipoEntidadBancaria = TipoEntidadBancaria.valueOf(request.getParameter("tipoEntidadBancaria"));
    
    EntidadBancariaDAO entidadBancariaDAO = new EntidadBancariaDAOImplHibernate();
    
    EntidadBancaria entidadBancaria = new EntidadBancaria();
    
    entidadBancaria.setCif(cif);
    entidadBancaria.setNombre(nombre);
    entidadBancaria.setCodigoEntidadBancaria(codigo);
    entidadBancaria.setTipoEntidadBancaria(tipoEntidadBancaria);
    
    entidadBancariaDAO.insert(entidadBancaria);
    
    
    %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Se ha insertado con exito</h1>
        
        <table>
            <th>Entidad</th>
            <th>Codigo</th>
            <th>Nombre</th>
            <th>tipo</th>
            <th>cif</th>
            <tr>
              <%=entidadBancaria.getIdEntidadBancaria()%>  
              <%=entidadBancaria.getCodigoEntidadBancaria()%>
              <%=entidadBancaria.getCodigoEntidadBancaria()%>
              <%=entidadBancaria.getTipoEntidadBancaria()%>
              <%=entidadBancaria.getCif()%>
              
                
            </tr>
            
            
        </table>
    </body>
</html>
