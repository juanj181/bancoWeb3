/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoWeb3.datos;

import bancoWeb3.negocio.EntidadBancaria;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author alumno
 */
public class EntidadBancariaDAOImplHibernate extends GenericDAOImplHibernate<EntidadBancaria, Integer> implements EntidadBancariaDAO {

    @Override
    public List<EntidadBancaria> findByCodigo(String codigo) {
        Session session = sessionFactory.getCurrentSession(); //Con esta linea ABRIMOS la session, creamos la conexion a la BD

        Query query = session.createQuery("SELECT entidadBancaria FROM EntidadBancaria entidadBancaria WHERE codigoEntidadBancaria=?");
        query.setString(0, codigo);
        List<EntidadBancaria> entidadesBancarias = query.list();
        return entidadesBancarias;
    }

    @Override
    public List<EntidadBancaria> findByNombre(String nombre) {

        if (nombre == null) {
            Session session = sessionFactory.getCurrentSession();
            Query query = session.createQuery("SELECT entidadBancaria FROM EntidadBancaria entidadBancaria");
            List<EntidadBancaria> entidadesBancarias = query.list();
            return entidadesBancarias;

        } else {
            Session session = sessionFactory.getCurrentSession();
            Query query = session.createQuery("SELECT entidadBancaria FROM EntidadBancaria entidadBancaria WHERE nombre LIKE ?");
            query.setString(0, "%" + nombre + "%");
            List<EntidadBancaria> entidadesBancarias = query.list();
            return entidadesBancarias;

        }
    }
}
