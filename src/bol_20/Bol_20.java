/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol_20;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import libros.*;

/**
 *
 * @author Josemolamazo
 */
public class Bol_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        Libreria libreria = new Libreria();
        ArrayList<Libro> lista = new ArrayList();
        
        int opcion;
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(" *** MENU *** "));
            
            switch(opcion){
                case 1: libreria.crearLista(lista);
                break;
                case 2: libreria.engadir(lista);
                break;
                case 3: libreria.verLibros(lista);
                break;
                case 4: libreria.vender(lista);
                break;
                case 5: libreria.amosarOrdeado(lista);
                break;
                case 6: libreria.darBaixa(lista);
                break;
                case 7: libreria.verLibro(lista);
                break;
                case 8: libreria.sair();
            }
        }while(opcion !=9);
    }
    
    
}
