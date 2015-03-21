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
public class AsignaturaDTO {
   
    private int idAsignatura=0;
    private String nombre="";
    private boolean estado=false;

    /**
     * @return the idAsignatura
     */
    public int getIdAsignatura() {
        return idAsignatura;
    }

    /**
     * @param idAsignatura the idAsignatura to set
     */
    public void setIdAsignatura(int idAsignatura) {
        this.idAsignatura = idAsignatura;
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
     * @return the estado
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public AsignaturaDTO() {
    }

    @Override
    public String toString() {
        return "AsignaturaDTO{" + "idAsignatura=" + idAsignatura + ", nombre=" + nombre + ", estado=" + estado + '}';
    }
    
    
    
    
    
}
