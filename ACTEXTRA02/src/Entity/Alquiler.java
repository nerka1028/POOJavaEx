package Entity;

import java.util.Date;

public class Alquiler {
    private String peliculaAlquilada;
    private Date fechaInicio;
    private Date fechaFin;
    private double precio;
    public Alquiler(String peliculaAlquilada, Date fechaInicio, Date fechaFin, double precio) {
        this.peliculaAlquilada = peliculaAlquilada;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precio = precio;
    }
    public Alquiler() {
    }
    public String getPeliculaAlquilada() {
        return peliculaAlquilada;
    }
    public void setPeliculaAlquilada(String peliculaAlquilada) {
        this.peliculaAlquilada = peliculaAlquilada;
    }
    public Date getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public Date getFechaFin() {
        return fechaFin;
    }
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
