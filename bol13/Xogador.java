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
public class Xogador extends Seleccion {

    private int dorsal;
    private String demarcacion;

    public void xogarPartido() {
        System.out.println("O xogador xoga o partido");
    }

    public void entrenar() {
        System.out.println("O xogador entrena");
    }

    public Xogador() {
    }

    public Xogador(int dorsal, String demarcacion, int id, String nome, String apellido, int edade) {
        super(id, nome, apellido, edade);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    @Override
    public String toString() {
        return "dorsal=" + dorsal + ", demarcacion=" + demarcacion;
    }

    @Override
    public void viaxar() {
        System.out.println("Viaxa o xogador");
    }
}
