package Entity;

public class Movil {
    private String marca;
    private double precio;
    private String modelo;
    private double ram;
    private double almacenamiento;
    private int[] codigo = new int[7];
    public Movil(String marca, double precio, String modelo, double ram, double almacenamiento, int[] codigo) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.codigo = codigo;
    }
    public Movil() {
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public double getRam() {
        return ram;
    }
    public void setRam(double ram) {
        this.ram = ram;
    }
    public double getAlmacenamiento() {
        return almacenamiento;
    }
    public void setAlmacenamiento(double almacenamiento) {
        this.almacenamiento = almacenamiento;
    }
    public int[] getCodigo() {
        return codigo;
    }
    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }
}
