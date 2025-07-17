/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superchinop3;

/**
 *
 * @author moisescascante
 */
public class Super {
    private String nombreSuper;
    private String codigoSuper;

    public Super(String nombreSuper, String codigoSuper) {
        this.nombreSuper = nombreSuper;
        this.codigoSuper = codigoSuper;
    }

    public String getNombreSuper() {
        return nombreSuper;
    }

    public void setNombreSuper(String nombreSuper) {
        this.nombreSuper = nombreSuper;
    }

    public String getCodigoSuper() {
        return codigoSuper;
    }
    
    public void setCodigoSuper(String codigoSuper) {
        this.codigoSuper = codigoSuper;
    }

    @Override
    public String toString() {
        return "Super: " + nombreSuper + " (Código: " + codigoSuper + ")";
    }
}
    
