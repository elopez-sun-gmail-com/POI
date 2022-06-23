package mx.org.dto;

/**
 *
 * @author elopez
 */
public class RepEstadisticasxTipoVisitante {

    private Long total_nacional = null;
    private Long trabajadores_inah = null;
    private Long profesores = null;
    private Long est_niv_bas = null;
    private Long est_niv_med = null;
    private Long adultos_mayores_pens_jub = null;
    private Long discapacitados = null;
    private Long visitante_boleto_pagado = null;
    private Long entrada_dominical = null;
    private Long ext_profesores = null;
    private Long ext_est_niv_bas = null;
    private Long ext_est_niv_med = null;
    private Long ext_adultos_mayores_pens_jub = null;
    private Long ext_discapacitados = null;
    private Long ext_visitante_boleto_pagado = null;
    private Long total_extranjero = null;

    /**
     *
     * @param total_nacional
     * @param trabajadores_inah
     * @param profesores
     * @param est_niv_bas
     * @param est_niv_med
     * @param adultos_mayores_pens_jub
     * @param discapacitados
     * @param visitante_boleto_pagado
     * @param entrada_dominical
     * @param ext_profesores
     * @param ext_est_niv_bas
     * @param ext_est_niv_med
     * @param ext_adultos_mayores_pens_jub
     * @param ext_discapacitados
     * @param ext_visitante_boleto_pagado
     * @param total_extranjero
     */
    public RepEstadisticasxTipoVisitante(Long total_nacional,
            Long trabajadores_inah, Long profesores, Long est_niv_bas,
            Long est_niv_med, Long adultos_mayores_pens_jub,
            Long discapacitados, Long visitante_boleto_pagado,
            Long entrada_dominical, Long ext_profesores, Long ext_est_niv_bas,
            Long ext_est_niv_med, Long ext_adultos_mayores_pens_jub,
            Long ext_discapacitados, Long ext_visitante_boleto_pagado,
            Long total_extranjero) {

        this.total_nacional = total_nacional;
        this.trabajadores_inah = trabajadores_inah;
        this.profesores = profesores;
        this.est_niv_bas = est_niv_bas;
        this.est_niv_med = est_niv_med;
        this.adultos_mayores_pens_jub = adultos_mayores_pens_jub;
        this.discapacitados = discapacitados;
        this.visitante_boleto_pagado = visitante_boleto_pagado;
        this.entrada_dominical = entrada_dominical;
        this.ext_profesores = ext_profesores;
        this.ext_est_niv_bas = ext_est_niv_bas;
        this.ext_est_niv_med = ext_est_niv_med;
        this.ext_adultos_mayores_pens_jub = ext_adultos_mayores_pens_jub;
        this.ext_discapacitados = ext_discapacitados;
        this.ext_visitante_boleto_pagado = ext_visitante_boleto_pagado;
        this.total_extranjero = total_extranjero;
    }

    public Long getTotal_nacional() {
        return total_nacional;
    }

    public void setTotal_nacional(Long total_nacional) {
        this.total_nacional = total_nacional;
    }

    public Long getTrabajadores_inah() {
        return trabajadores_inah;
    }

    public void setTrabajadores_inah(Long trabajadores_inah) {
        this.trabajadores_inah = trabajadores_inah;
    }

    public Long getProfesores() {
        return profesores;
    }

    public void setProfesores(Long profesores) {
        this.profesores = profesores;
    }

    public Long getEst_niv_bas() {
        return est_niv_bas;
    }

    public void setEst_niv_bas(Long est_niv_bas) {
        this.est_niv_bas = est_niv_bas;
    }

    public Long getEst_niv_med() {
        return est_niv_med;
    }

    public void setEst_niv_med(Long est_niv_med) {
        this.est_niv_med = est_niv_med;
    }

    public Long getAdultos_mayores_pens_jub() {
        return adultos_mayores_pens_jub;
    }

    public void setAdultos_mayores_pens_jub(Long adultos_mayores_pens_jub) {
        this.adultos_mayores_pens_jub = adultos_mayores_pens_jub;
    }

    public Long getDiscapacitados() {
        return discapacitados;
    }

    public void setDiscapacitados(Long discapacitados) {
        this.discapacitados = discapacitados;
    }

    public Long getVisitante_boleto_pagado() {
        return visitante_boleto_pagado;
    }

    public void setVisitante_boleto_pagado(Long visitante_boleto_pagado) {
        this.visitante_boleto_pagado = visitante_boleto_pagado;
    }

    public Long getEntrada_dominical() {
        return entrada_dominical;
    }

    public void setEntrada_dominical(Long entrada_dominical) {
        this.entrada_dominical = entrada_dominical;
    }

    public Long getExt_profesores() {
        return ext_profesores;
    }

    public void setExt_profesores(Long ext_profesores) {
        this.ext_profesores = ext_profesores;
    }

    public Long getExt_est_niv_bas() {
        return ext_est_niv_bas;
    }

    public void setExt_est_niv_bas(Long ext_est_niv_bas) {
        this.ext_est_niv_bas = ext_est_niv_bas;
    }

    public Long getExt_est_niv_med() {
        return ext_est_niv_med;
    }

    public void setExt_est_niv_med(Long ext_est_niv_med) {
        this.ext_est_niv_med = ext_est_niv_med;
    }

    public Long getExt_adultos_mayores_pens_jub() {
        return ext_adultos_mayores_pens_jub;
    }

    public void setExt_adultos_mayores_pens_jub(Long ext_adultos_mayores_pens_jub) {
        this.ext_adultos_mayores_pens_jub = ext_adultos_mayores_pens_jub;
    }

    public Long getExt_discapacitados() {
        return ext_discapacitados;
    }

    public void setExt_discapacitados(Long ext_discapacitados) {
        this.ext_discapacitados = ext_discapacitados;
    }

    public Long getExt_visitante_boleto_pagado() {
        return ext_visitante_boleto_pagado;
    }

    public void setExt_visitante_boleto_pagado(Long ext_visitante_boleto_pagado) {
        this.ext_visitante_boleto_pagado = ext_visitante_boleto_pagado;
    }

    public Long getTotal_extranjero() {
        return total_extranjero;
    }

    public void setTotal_extranjero(Long total_extranjero) {
        this.total_extranjero = total_extranjero;
    }

}
