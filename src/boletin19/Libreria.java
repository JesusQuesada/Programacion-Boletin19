package boletin19;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import Validacions.PedirDatos;
import static Validacions.PedirDatos.pedirFloat;
import static Validacions.PedirDatos.pedirInt;
import static Validacions.PedirDatos.pedirString;
import java.util.Collections;
import java.util.Iterator;

public class Libreria {

    private ArrayList<Libro> library = new ArrayList<Libro>();
    PedirDatos book = new PedirDatos();

    public void añadirLibro() {
        library.add(new Libro(pedirString(), pedirString(), pedirString(), pedirFloat(), pedirInt()));
    }

    public void venderLibro() {
        String vender = JOptionPane.showInputDialog("Título: ");
        for (int i = 0; i < library.size(); i++) {
            if (library.get(i).getTitulo().equals(vender)) {
                library.get(i).setNumuni(library.get(i).getNumuni() - 1);
            }
        }
    }

    public void visualizarOrdenado() {
        Collections.sort(library);
        Iterator<Libro> it = library.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public void darDeBaja() {
        for (int i = 0; i < library.size(); i++) {
            if (library.get(i).numuni == 0) {
                library.remove(i);
            }

        }
    }

    public void buscar() {
        boolean stock = false;
        String buscar = JOptionPane.showInputDialog("Título: ");
        for (int i = 0; i < library.size(); i++) {
            if (buscar.equals(library.get(i).titulo)) {
                stock = true;
                System.out.println("SÍ ESTÁ");
            } else {
                System.out.println("NO ESTÁ");
            }
        }
    }
}
