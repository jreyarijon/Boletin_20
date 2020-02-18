/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libros;

import java.util.ArrayList;
import validar.pedirDato;

/**
 *
 * @author Josemolamazo
 */
public class Libreria {
    
    Libro libro = new Libro();
    
    ArrayList<Libro> lista = new ArrayList();
    
    public ArrayList<Libro> crearLista(ArrayList<Libro> lista){
        for(int i = 0; i <= 1; i++){
        lista.add(new Libro(pedirDato.pedirString(), pedirDato.pedirString(), pedirDato.pedirString(), pedirDato.pedirFloat(), pedirDato.pedirInt()));
        }
        return lista;
    }
    
    public ArrayList<Libro> engadir(ArrayList<Libro> lista) {
        lista.add(new Libro(pedirDato.pedirString(), pedirDato.pedirString(), pedirDato.pedirString(), pedirDato.pedirFloat(), pedirDato.pedirInt()));
        return lista;
    }
    
    public void verLibros(ArrayList<Libro> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista);
        }
    }
    
    public String vender(ArrayList<Libro> lista) {
        
        System.out.println("Vender libro por ISBN");
        String ISBN2 = pedirDato.pedirString();
        System.out.println("Unidades para vender");
        int unidadesVender = pedirDato.pedirInt();
        int unidades = libro.getUnidades();
        int unidadesFinal = unidades - unidadesVender;
        for (int i = 0; i < lista.size(); i++) {
            if (ISBN2 == libro.getISBN()) {
                lista.remove(libro);
                libro.setUnidades(unidadesFinal);
            }
            
        }
        return null;
        
    }
    
    public void amosarOrdeado(ArrayList<Libro> lista) {
        
        for (Libro libro : lista) {
            for (int j = 65; j == libro.getTitulo().charAt(0); j++) {
                System.out.println(libro);
            }
            
        }
    }
    
    public void darBaixa(ArrayList<Libro> lista) {
        for (Libro libro : lista) {
            if (libro.getUnidades() == 0) {
                System.out.println("De baixa");
            }
            System.out.println(libro);
        }
    }
    
    public void verLibro(ArrayList<Libro> lista) {
        int num = pedirDato.pedirInt();
        System.out.println("Libro buscado: " + lista.get(num));
    }
    
    public void sair() {
        System.exit(0);
    }
}
