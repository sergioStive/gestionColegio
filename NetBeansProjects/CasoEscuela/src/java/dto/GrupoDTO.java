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
public class GrupoDTO {

    private int idGrupo = 0;
    private int idCurso = 0;
    private int idAlumno = 0;
    private int idasignatura;
    private int idhorario;
    private int idaula;
    private AulaDTO idAula;
    private HorarioDTO idHorario;
    private AsignaturaDTO idAsignatura;

    public GrupoDTO(AulaDTO idaula, HorarioDTO idhorario, AsignaturaDTO idasignatura) {

        this.idAula = idaula;
        this.idHorario = idhorario;
        this.idAsignatura = idasignatura;
    }

    /**
     * @return the idGrupo
     */
    public int getIdGrupo() {
        return idGrupo;
    }

    /**
     * @param idGrupo the idGrupo to set
     */
    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
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
     * @return the idAlumno
     */
    public int getIdAlumno() {
        return idAlumno;
    }

    /**
     * @param idAlumno the idAlumno to set
     */
    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    @Override
    public String toString() {
        return "GrupoDTO{" + "idGrupo=" + idGrupo + ", idCurso=" + idCurso + ", idAlumno=" + idAlumno + '}';
    }

    /**
     * @return the idasignatura
     */
    public int getIdasignatura() {
        return idasignatura;
    }

    /**
     * @param idasignatura the idasignatura to set
     */
    public void setIdasignatura(int idasignatura) {
        this.idasignatura = idasignatura;
    }

    /**
     * @return the idhorario
     */
    public int getIdhorario() {
        return idhorario;
    }

    /**
     * @param idhorario the idhorario to set
     */
    public void setIdhorario(int idhorario) {
        this.idhorario = idhorario;
    }

    /**
     * @return the idaula
     */
    public int getIdaula() {
        return idaula;
    }

    /**
     * @param idaula the idaula to set
     */
    public void setIdaula(int idaula) {
        this.idaula = idaula;
    }

    /**
     * @return the idAula
     */
    public AulaDTO getIdAula() {
        return idAula;
    }

    /**
     * @param idAula the idAula to set
     */
    public void setIdAula(AulaDTO idAula) {
        this.idAula = idAula;
    }

    /**
     * @return the idHorario
     */
    public HorarioDTO getIdHorario() {
        return idHorario;
    }

    /**
     * @param idHorario the idHorario to set
     */
    public void setIdHorario(HorarioDTO idHorario) {
        this.idHorario = idHorario;
    }

    /**
     * @return the idAsignatura
     */
    public AsignaturaDTO getIdAsignatura() {
        return idAsignatura;
    }

    /**
     * @param idAsignatura the idAsignatura to set
     */
    public void setIdAsignatura(AsignaturaDTO idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

}
