package Service;
import Entity.Cliente;
import Entity.Rutina;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class ServicioCliente {
    Scanner leer = new Scanner(System.in);
    public Cliente registrarCliente() {
        System.out.println("Registro de clientes: ");
        boolean tipoRegistro = leer.nextBoolean(); //manual = true
        if(tipoRegistro){
            System.out.println("id: ");
            int id = leer.nextInt();
            System.out.println("Edad: ");
            int edad = leer.nextInt();
            System.out.println("Altura: ");
            double altura = leer.nextDouble();
            System.out.println("Peso: ");
            double peso = leer.nextDouble();
            System.out.println("nombre: ");
            String nombre = leer.next();
            System.out.println("Objetivo: ");
            String objetivo = leer.nextLine();
            Cliente cliente = new Cliente(id, nombre, edad, altura, peso, objetivo);
            return cliente;
            
        } else{
            System.out.println("id: ");
            int id = 1;
            System.out.println("nombre: ");
            String nombre = "Carlos";
            System.out.println("Edad: ");
            int edad = 15;
            System.out.println("Altura: ");
            double altura = 170;
            System.out.println("Peso: ");
            double peso = 70;
            System.out.println("Objetivo: ");
            String objetivo = "Hacer algo en la vida";
            Cliente cliente = new Cliente(id, nombre, edad, altura, peso, objetivo);
            return cliente;
        }
    }
    public void obtenerClientes(List<Cliente> listaClientes) {
        System.out.println("Obteniendo clientes: ");
        for (int i = 0; i < listaClientes.size(); i++) {
            System.out.println(((Cliente) listaClientes.get(i)).getNombre());
        }
    }
    public void actualizarCliente(List<Cliente> listaClientes, String nombre, int edad, double altura, double peso, String objetivo) {
        System.out.println("Actualizando cliente: ");
        Cliente clienteEncontrado = null;
        System.out.println("Id cliente: ");
        int idCliente = leer.nextInt();
        // Buscar el Cliente por su ID
        for (Cliente cliente : listaClientes) {
            if (cliente.getId() == idCliente) {
                clienteEncontrado = cliente;
                break;
            }
        }
        if (clienteEncontrado != null) {
            clienteEncontrado.setNombre(nombre);
            clienteEncontrado.setAltura(altura);
            clienteEncontrado.setEdad(edad);
            clienteEncontrado.setPeso(peso);
            clienteEncontrado.setObjetivo(objetivo);
            System.out.println("Datos del Cliente actualizados: " + clienteEncontrado.getNombre());
        } else {
            System.out.println("Cliente no encontrado con ID: " + idCliente);
        }
    }
    public void eliminarCliente(List<Cliente> listaClientes) {
        System.out.println("Eliminando cliente: ");
        Cliente clienteEncontrado = null;
        System.out.println("Id cliente: ");
        int idCliente = leer.nextInt();
        // Buscar el Cliente por su ID
        for (Cliente cliente : listaClientes) {
            if (cliente.getId() == idCliente) {
                clienteEncontrado = cliente;
                break;
            }
        }
        if(clienteEncontrado != null) listaClientes.remove(clienteEncontrado);
        else System.out.println("ID no encontrado.");
    }
}
