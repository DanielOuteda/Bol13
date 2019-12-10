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
public class Seleccion {

    private int id;
    private String nome;
    private String apellido;
    private int edade;

    public void viaxar() {
        System.out.println("Viaxa a selección");
    }

    public void concentrarse() {
        System.out.println("Concentrase a selección");
    }

    public Seleccion() {
    }

    public Seleccion(int id, String nome, String apellido, int edade) {
        this.id = id;
        this.nome = nome;
        this.apellido = apellido;
        this.edade = edade;
    }

    @Override
    public String toString() {
        return "id=" + id + ", nome=" + nome + ", apellido=" + apellido + ", edade=" + edade;
    }

}
