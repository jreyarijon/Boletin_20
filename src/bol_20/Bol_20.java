/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol_20;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import libros.*;
import validar.pedirDato;
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
            opcion = Integer.parseInt(JOptionPane.showInputDialog(" *** MENU *** \n 1---> Engadir libro \n 2---> Mostrar libros \n"
                    + " 3---> Vender libro(s) \n 4---> Mostrar por orde alfabético \n 5---> Dar de baixa \n 6---> Buscar por titulo \n "
                    + "7---> Sair"));
            
            switch(opcion){
                
                case 1: libreria.engadir(lista);
                break;
                case 2: libreria.verLibros(lista);
                break;
                case 3: libreria.vender(lista, pedirDato.pedirMensaxe("isbn: "), pedirDato.pedirIntSMS("Cantas unidades? "));
                break;
                case 4: libreria.amosarOrdeado(lista);
                break;
                case 5: libreria.darBaixa(lista);
                break;
                case 6: libreria.verLibro(lista);
                break;
                case 7: libreria.sair();
            }
        }while(opcion !=8);
    }
    
    
    
    
}
