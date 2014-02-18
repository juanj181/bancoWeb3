<%@page import="bancoWeb3.negocio.EntidadBancaria"%>
<%@page import="bancoWeb3.datos.EntidadBancariaDAOImplHibernate"%>
<%@page import="bancoWeb3.datos.EntidadBancariaDAO"%>
<% 
    String idEntidadBancariaString = request.getParameter("idEntidadBancaria");
    int idEntidadBancaria = Integer.parseInt(idEntidadBancariaString);
    EntidadBancariaDAO entidadBancariaDAO = new EntidadBancariaDAOImplHibernate();
    EntidadBancaria entidadBancariaBuscada = new EntidadBancaria();
    entidadBancariaBuscada = entidadBancariaDAO.read(idEntidadBancaria);
    
    entidadBancariaDAO.delete(idEntidadBancaria);
    
 %>   

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
                    <table class="table">
                <th>IDENTIFICADOR</th>
                <th>CODIGO</th>
                <th>NOMBRE</th>
                <th>TIPO</th>
                <th>CIF</th>

                <tr>
                    <td><%= entidadBancariaBuscada.getIdEntidadBancaria()%></td>
                    <td><%= entidadBancariaBuscada.getCodigoEntidadBancaria()%></td>
                    <td><%= entidadBancariaBuscada.getNombre()%></td>
                    <td><%= entidadBancariaBuscada.getTipoEntidadBancaria()%></td>      
                    <td><%= entidadBancariaBuscada.getCif()%></td>

                </tr>

            </table>
    </body>
</html>
