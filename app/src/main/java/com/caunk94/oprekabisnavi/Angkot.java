package com.caunk94.oprekabisnavi;

/**
 * Created by syamms on 9/7/16.
 */
public class Angkot {
    private int imagen;
    private String nomor;
    private String rute;

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public String getRute() {
        return rute;
    }

    public void setRute(String rute) {
        this.rute = rute;
    }

    public Angkot(int imagen, String nomor, String rute) {

        this.imagen = imagen;
        this.nomor = nomor;
        this.rute = rute;
    }
}
