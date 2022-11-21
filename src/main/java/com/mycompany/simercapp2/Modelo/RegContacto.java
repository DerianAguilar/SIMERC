package com.mycompany.simercapp2.Modelo;

public class RegContacto {

    private int id;
    private String medio;
    private String Descripcion;
    private String fecha;
    private int id_contacto;

    public RegContacto() {
    }

    public RegContacto(int id, String medio, String Descripcion, String fecha, int id_contacto) {
        this.id = id;
        this.medio = medio;
        this.Descripcion = Descripcion;
        this.fecha = fecha;
        this.id_contacto = id_contacto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMedio() {
        return medio;
    }

    public void setMedio(String medio) {
        this.medio = medio;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getId_contacto() {
        return id_contacto;
    }

    public void setId_contacto(int id_contacto) {
        this.id_contacto = id_contacto;
    }

}
