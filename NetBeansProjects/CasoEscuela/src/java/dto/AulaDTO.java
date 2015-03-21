/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author Sergio
 */
public class AulaDTO {
    
    private int idAula=0;
    private String nombre="";
    private int cupo=0;

    /**
     * @return the idAula
     */
    public int getIdAula() {
        return idAula;
    }

    /**
     * @param idAula the idAula to set
     */
    public void setIdAula(int idAula) {
        this.idAula = idAula;
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

    @Override
    public String toString() {
        return "AulaDTO{" + "idAula=" + idAula + ", nombre=" + nombre + '}';
    }

    public AulaDTO() {
    }

    /**
     * @return the cupo
     */
    public int getCupo() {
        return cupo;
    }

    /**
     * @param cupo the cupo to set
     */
    public void setCupo(int cupo) {
        this.cupo = cupo;
    }
    
    
    
}
