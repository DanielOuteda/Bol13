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
public class Bol13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Xogador xog = new Xogador(9, "Delantero", 123, "Karim", "Benzema", 31 );
        System.out.println(xog);
        Adestrador ads = new Adestrador();
        Masaxista mas = new Masaxista();
        Seleccion xogad = new Xogador(9, "Delantero", 123, "Karim", "Benzema", 31 );
        System.out.println(xogad);
        xog.concentrarse();
        ads.concentrarse();
        mas.concentrarse();
        xogad.concentrarse();
        xog.viaxar();
        ads.viaxar();
        mas.viaxar();
        xogad.viaxar();
    }

}
