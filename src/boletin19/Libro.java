
package boletin19;

import java.util.logging.Logger;

public class Libro implements Comparable <Libro>{
    public String titulo;
    private String autor;
    private String ISBN;
    private float precio;
    public int numuni;

    public Libro() {
    }

    public Libro(String titulo, String autor, String ISBN, float precio, int numuni) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.precio = precio;
        this.numuni = numuni;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public float getPrecio() {
        return precio;
    }

    public int getNumuni() {
        return numuni;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setNumuni(int numuni) {
        this.numuni = numuni;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", ISBN=" + ISBN + ", precio=" + precio + ", numuni=" + numuni + '}';
    }

    @Override
    public int compareTo(Libro comparar) {
        return this.titulo.compareToIgnoreCase(comparar.getTitulo());
    }
    
    
    
}
