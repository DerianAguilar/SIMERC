
package com.mycompany.simercapp2.Modelo;


public class AsignarTarea {
    
    private int id;
    private String titulo;
    private String descripcion;
    private String fecha;
    private int estado;
    private int asesorE;
    private int asesorR;

    public AsignarTarea() {
    }

    public AsignarTarea(int id, String titulo, String descripcion, String fecha, int estado, int asesorE, int asesorR) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.estado = estado;
        this.asesorE = asesorE;
        this.asesorR = asesorR;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getAsesorE() {
        return asesorE;
    }

    public void setAsesorE(int asesorE) {
        this.asesorE = asesorE;
    }

    public int getAsesorR() {
        return asesorR;
    }

    public void setAsesorR(int asesorR) {
        this.asesorR = asesorR;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
    
    
}
