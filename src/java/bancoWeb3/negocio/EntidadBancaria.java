/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoWeb3.negocio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jj
 */
public class EntidadBancaria {

    private int idEntidadBancaria;
    private List<SucursalBancaria> sucursalesBancarias = new ArrayList<>();
    private String codigoEntidadBancaria;
    private String nombre;
    private String cif;
    private TipoEntidadBancaria tipoEntidadBancaria;
    
    
    public EntidadBancaria(){}

    //Constructor Sobrecargado
    public EntidadBancaria(int idEntidad, String codigoEntidad, String nombre, String cif, TipoEntidadBancaria tipoEntidadBancaria) {
        this.idEntidadBancaria = idEntidad;
        this.codigoEntidadBancaria = codigoEntidad;
        this.nombre = nombre;
        this.cif = cif;
        this.tipoEntidadBancaria = tipoEntidadBancaria;
    }

    /**
     * @return the idEntidadBancaria
     */
    public int getIdEntidadBancaria() {
        return idEntidadBancaria;
    }

    /**
     * @param idEntidadBancaria the idEntidadBancaria to set
     */
    public void setIdEntidadBancaria(int idEntidadBancaria) {
        this.idEntidadBancaria = idEntidadBancaria;
    }

    /**
     * @return the sucursalesBancarias
     */
    public List<SucursalBancaria> getSucursalesBancarias() {
        return sucursalesBancarias;
    }

    /**
     * @param sucursalesBancarias the sucursalesBancarias to set
     */
    public void setSucursalesBancarias(List<SucursalBancaria> sucursalesBancarias) {
        this.sucursalesBancarias = sucursalesBancarias;
    }

    /**
     * @return the codigoEntidadBancaria
     */
    public String getCodigoEntidadBancaria() {
        return codigoEntidadBancaria;
    }

    /**
     * @param codigoEntidadBancaria the codigoEntidadBancaria to set
     */
    public void setCodigoEntidadBancaria(String codigoEntidadBancaria) {
        this.codigoEntidadBancaria = codigoEntidadBancaria;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cif
     */
    public String getCif() {
        return cif;
    }

    /**
     * @param cif the cif to set
     */
    public void setCif(String cif) {
        this.cif = cif;
    }

    /**
     * @return the tipoEntidadBancaria
     */
    public TipoEntidadBancaria getTipoEntidadBancaria() {
        return tipoEntidadBancaria;
    }

    /**
     * @param tipoEntidadBancaria the tipoEntidadBancaria to set
     */
    public void setTipoEntidadBancaria(TipoEntidadBancaria tipoEntidadBancaria) {
        this.tipoEntidadBancaria = tipoEntidadBancaria;
    }
}
