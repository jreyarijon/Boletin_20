/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libros;

import java.util.ArrayList;
import java.util.Collections;
import validar.pedirDato;

/**
 *
 * @author Josemolamazo
 */
public class Libreria {

    ArrayList<Libro> lista = new ArrayList();

    public ArrayList<Libro> engadir(ArrayList<Libro> lista) {
        lista.add(new Libro(pedirDato.pedirMensaxe("Titulo: "), pedirDato.pedirMensaxe("Autor: "), pedirDato.pedirMensaxe("ISBN: "), pedirDato.pedirFloatSMS("Prezo: "), pedirDato.pedirIntSMS("Unidades: ")));
        return lista;
    }

    public void verLibros(ArrayList<Libro> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }

    public void vender(ArrayList<Libro> lista, String isbn, int unidades) {
        for (Libro lib : lista) {
            if (isbn.equalsIgnoreCase(lib.getISBN())) {
                lib.setUnidades(lib.getUnidades() - unidades);
            }
        }

    }

    public void amosarOrdeado(ArrayList<Libro> lista) {
        Collections.sort(lista);
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

    }

    public void darBaixa(ArrayList<Libro> lista) {
        for (Libro lib : lista) {
            if (lib.getUnidades() == 0) {
                lista.remove(lib);
                System.out.println("De baixa");
            }

        }
    }

    public void verLibro(ArrayList<Libro> lista) {
        String titulo = pedirDato.pedirMensaxe("Que titulo busca? ");
        String autor = pedirDato.pedirMensaxe("Que autor busca? ");
        for (Libro lib : lista) {
            if (titulo.equals(lib.getTitulo()) && autor.equals(lib.getAutor())) {
                System.out.println("Libro buscado: " + lib);
            }
        }

    }

    public void sair() {
        System.exit(0);
    }
}
