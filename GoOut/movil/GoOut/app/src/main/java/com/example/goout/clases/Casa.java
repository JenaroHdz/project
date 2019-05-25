package com.example.goout.clases;

public class Casa {
    private String ubicacion;
    private int imagen;
    private String precio_tiempo;

    public Casa(String ubica, int img_casa, String pre_time){

        this.ubicacion = ubica;
        this.imagen = img_casa;
        this.precio_tiempo = pre_time;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public int getImagen() {
        return imagen;
    }

    public String getPrecio_tiempo() {
        return precio_tiempo;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public void setPrecio_tiempo(String precio_tiempo) {
        this.precio_tiempo = precio_tiempo;
    }

}
