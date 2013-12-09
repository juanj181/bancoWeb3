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
public class SucursalBancaria {

    private int idSucursalBancaria;
    private List<CuentaBancaria> cuentasBancarias = new ArrayList<>();
    private EntidadBancaria entidadBancaria;
    private String codigoSucursal;
    private String nombre;
    
    public SucursalBancaria(){}
    

    public SucursalBancaria(int idSucursalBancaria, EntidadBancaria entidadBancaria, String codigoSucursal, String nombre) {
        this.idSucursalBancaria = idSucursalBancaria;
        this.entidadBancaria = entidadBancaria;
        this.codigoSucursal = codigoSucursal;
        this.nombre = nombre;
    }

    /**
     * @return the idSucursalBancaria
     */
    public int getIdSucursalBancaria() {
        return idSucursalBancaria;
    }

    /**
     * @param idSucursalBancaria the idSucursalBancaria to set
     */
    public void setIdSucursalBancaria(int idSucursalBancaria) {
        this.idSucursalBancaria = idSucursalBancaria;
    }

    /**
     * @return the cuentasBancarias
     */
    public List<CuentaBancaria> getCuentasBancarias() {
        return cuentasBancarias;
    }

    /**
     * @param cuentasBancarias the cuentasBancarias to set
     */
    public void setCuentasBancarias(List<CuentaBancaria> cuentasBancarias) {
        this.cuentasBancarias = cuentasBancarias;
    }

    /**
     * @return the entidadBancaria
     */
    public EntidadBancaria getEntidadBancaria() {
        return entidadBancaria;
    }

    /**
     * @param entidadBancaria the entidadBancaria to set
     */
    public void setEntidadBancaria(EntidadBancaria entidadBancaria) {
        this.entidadBancaria = entidadBancaria;
    }

    /**
     * @return the codigoSucursal
     */
    public String getCodigoSucursal() {
        return codigoSucursal;
    }

    /**
     * @param codigoSucursal the codigoSucursal to set
     */
    public void setCodigoSucursal(String codigoSucursal) {
        this.codigoSucursal = codigoSucursal;
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
}
