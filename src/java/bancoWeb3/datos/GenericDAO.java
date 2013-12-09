/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoWeb3.datos;


import java.util.List;

/**
 *
 * @author Jj
 */
 public interface GenericDAO<T,ID> {
    void update(T t);
    T read(ID id);
    void insert(T t);
    void delete(ID id); 
    List<T> findAll();
 }
