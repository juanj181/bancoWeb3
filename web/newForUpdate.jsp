<%@page import="bancoWeb3.negocio.TipoEntidadBancaria"%>
<%@page import="bancoWeb3.datos.EntidadBancariaDAOImplHibernate"%>
<%@page import="bancoWeb3.datos.EntidadBancariaDAO"%>
<%@page import="bancoWeb3.negocio.EntidadBancaria"%>
<%
  int idEntidadBancaria = Integer.parseInt(request.getParameter("idEntidadBancaria"));
  EntidadBancaria entidadBancaria = new EntidadBancaria();
  EntidadBancariaDAO entidadBancariaDAO = new EntidadBancariaDAOImplHibernate();
  entidadBancaria = entidadBancariaDAO.read(idEntidadBancaria);
  
  String codigo = entidadBancaria.getCodigoEntidadBancaria();
  String nombre = entidadBancaria.getNombre();
  String cif = entidadBancaria.getCif();
  TipoEntidadBancaria tipoEntidadBancari = entidadBancaria.getTipoEntidadBancaria();
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
    </body>
</html>
