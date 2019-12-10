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
public class Adestrador extends Seleccion {

    private String idFederacion;

    public void dirixirPartido() {
        System.out.println("O entrenador dirixe o partido");
    }

    public void dirixirAdestramento() {
        System.out.println("O entrenador dirixe o adestramento");
    }

    public Adestrador() {
    }

    public Adestrador(String idFederacion, int id, String nome, String apellido, int edade) {
        super(id, nome, apellido, edade);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public String toString() {
        return "idFederacion=" + idFederacion;
    }

    @Override
    public void viaxar() {
        System.out.println("Viaxa o adestrador");
    }
}
