<%@page import="com.fasterxml.jackson.databind.ObjectMapper"%>
<%@page import="bancoWeb3.datos.EntidadBancariaDAOImplHibernate"%>
<%@page import="bancoWeb3.datos.EntidadBancariaDAO"%>
<%@page import="bancoWeb3.negocio.EntidadBancaria"%>
<%
    EntidadBancaria entidadBancaria = new EntidadBancaria();
    EntidadBancariaDAO entidadBancariaDAO = new EntidadBancariaDAOImplHibernate();
    entidadBancaria = entidadBancariaDAO.read(Integer.parseInt(request.getParameter("idEntidadBancaria")));
    ObjectMapper objectMapper = new ObjectMapper();
    String json = objectMapper.writeValueAsString(entidadBancaria);
    response.setContentType("application/json; charset=UTF-8");
    out.print(json);
%>