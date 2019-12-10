/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol13;

/**
 *
 * @author doutedasolla
 */
public class Masaxista extends Seleccion {

    private String titulacion;
    private int anosExperencia;

    public void darMAsaxes() {
        System.out.println("O adestrador da masaxes");
    }

    public Masaxista() {
    }

    public Masaxista(String titulacion, int anosExperencia, int id, String nome, String apellido, int edade) {
        super(id, nome, apellido, edade);
        this.titulacion = titulacion;
        this.anosExperencia = anosExperencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnosExperencia() {
        return anosExperencia;
    }

    public void setAnosExperencia(int anosExperencia) {
        this.anosExperencia = anosExperencia;
    }

    @Override
    public String toString() {
        return "titulacion=" + titulacion + ", anosExperencia=" + anosExperencia;
    }

    @Override
    public void viaxar() {
        System.out.println("Viaxa o masaxista");
    }
}
