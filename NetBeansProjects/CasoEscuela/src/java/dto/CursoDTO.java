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
public class CursoDTO {
    
    private int idCurso=0;
    private String nombre="";
    private int idAsignatura=0;
    private int idAula=0;
    private int idHorario=0;
   

    public CursoDTO() {
    }
    
    

    /**
     * @return the idCurso
     */
    public int getIdCurso() {
        return idCurso;
    }

    /**
     * @param idCurso the idCurso to set
     */
    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
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
     * @return the idHorario
     */
    public int getIdHorario() {
        return idHorario;
    }

    /**
     * @param idHorario the idHorario to set
     */
    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    @Override
    public String toString() {
        return "CursoDTO{" + "idCurso=" + idCurso + ", nombre=" + nombre + ", idAsignatura=" + idAsignatura + ", idAula=" + idAula + ", idHorario=" + idHorario + '}';
    }
    
    
    
}
