/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.lineales.dobles;

/**
 *
 * @author casa
 */
public class ListaLinealesDobles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         doublelnklist Lista = new doublelnklist();
        Lista.insertFirst("Hola Mundo");
        Lista.insertFirst(29);
        Lista.insertFirst(3.4);
        Lista.showlist();
        Lista.showlistreversa();
        Lista.searchNode("Mundo");
    }
    
}
