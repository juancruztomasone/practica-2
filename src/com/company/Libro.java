package com.company;

public class Libro {
    String titulo;
    String autor;
    boolean enUso;
    String nombreUsuario;

    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.enUso = false;
        this.nombreUsuario = "";
    }

    public Libro(String titulo, String autor, boolean enUso, String nombreUsuario) {
        this.titulo = titulo;
        this.autor = autor;
        this.enUso = enUso;
        this.nombreUsuario = nombreUsuario;
    }

    public void prestamo(String nombreUsuario){
        this.enUso = true;
        this.nombreUsuario = nombreUsuario;
    }

    public void devolucion(){
        this.enUso = false;
        this.nombreUsuario = "";
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", enUso=" + enUso +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                '}';
    }
}
