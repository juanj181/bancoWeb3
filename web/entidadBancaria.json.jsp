<%@page import="bancoWeb3.datos.EntidadBancariaDAOImplHibernate"%>
<%@page import="bancoWeb3.datos.EntidadBancariaDAO"%>
<%@page import="bancoWeb3.negocio.EntidadBancaria"%>
<%
EntidadBancaria entidadBancaria = new EntidadBancaria();
EntidadBancariaDAO entidadBancariaDAO = new EntidadBancariaDAOImplHibernate();
%>