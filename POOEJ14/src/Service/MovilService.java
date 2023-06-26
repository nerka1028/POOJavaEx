package Service;
import java.util.Random;

import Entity.Movil;
public class MovilService {
    Movil movil;
    Random random = new Random();
    public Movil cargarCelular() {
        String marca = "Samsung";
        double precio = 500;
        String modelo = "Z Flip 4";
        double ram = 8;
        double almacenamiento = 128;
        int[] codigo = ingresarCodigo();
        return movil = new Movil(marca, precio, modelo, ram, almacenamiento, codigo);
        
    }
    public int[] ingresarCodigo() {
        int[] codigo = new int[7];
        for (int i = 0; i < codigo.length; i++) {
            codigo[i] = random.nextInt(10);
        }
        return codigo;
    }
    public void mostrarCelular(Movil movil) {
        System.out.println("Marca: " + movil.getMarca());
        System.out.println("Precio: " + movil.getPrecio());
        System.out.println("Modelo: " + movil.getModelo());
        System.out.println("Ram: " + movil.getRam());
        System.out.println("Almacenamiento: " + movil.getAlmacenamiento());
        System.out.println("Código: ");
        for (int i : movil.getCodigo()) {
            System.out.print(i + " ");
        }
    }
}
