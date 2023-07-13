package Main;
import Entity.Cliente;
import Service.ServicioCliente;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        ServicioCliente servicioCliente = new ServicioCliente();
        List<Cliente> listaClientes = new ArrayList<>();
        System.out.println("Cantidad de clientes: ");
        int cantidadDeClientes = leer.nextInt();
        for (int i = 0; i < cantidadDeClientes; i++) {
            listaClientes.add(i, servicioCliente.registrarCliente());
        }
        servicioCliente.obtenerClientes(listaClientes);
        servicioCliente.actualizarCliente(listaClientes, "Juan", 35, 180, 67, "No morir");
        servicioCliente.obtenerClientes(listaClientes);
        servicioCliente.eliminarCliente(listaClientes);
        servicioCliente.obtenerClientes(listaClientes);

    }
}
