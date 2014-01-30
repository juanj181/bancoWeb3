/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoWeb3.datos;

import bancoWeb3.negocio.EntidadBancaria;
import java.util.List;

/**
 *
 * @author Jj
 */
public interface EntidadBancariaDAO extends GenericDAO<EntidadBancaria,Integer>{
    
  public List<EntidadBancaria> findByCodigo(String codigo);  
  public List<EntidadBancaria> findByNombre (String nombre);  
}
