package controlador;

import logica.Cliente;
import logica.OrdenCompra;

import java.util.ArrayList;

public class Contcliente {

   private ArrayList<Cliente> clientes;

   public Contcliente() {
       this.clientes = new ArrayList<>();
   }

   public ArrayList<Cliente> listarClientes() {
       return clientes;
   }

   public void crearCliente(Cliente c) {
       clientes.add(c);
   }

   public void editarCliente(Cliente c) {
       for (int i = 0; i < clientes.size(); i++) {
           if (clientes.get(i).getId().equals(c.getId())) {
               clientes.set(i, c);
               break;
           }
       }
   }


   public Cliente verCliente(Cliente c) {
       for (Cliente cliente : clientes) {
           if (cliente.getId().equals(c.getId())) {
               return cliente;
           }
       }
       return null;
   }

   public void borrarCliente(int id) {
       clientes.remove(id);
   }


   public boolean verificarBorrado(Cliente cli, int id) {
       Cliente c = clientes.get(id);
       if (c != null && c.getOrdenes().isEmpty()) {
           return true;
       }
       return false;
   }

   public ArrayList<OrdenCompra> listaOrdenes(Cliente c, int pos) {
       return clientes.get(pos).getOrdenes();
   }

   public ArrayList<Cliente> filtrarEstados(String estado) {
       ArrayList<Cliente> resultado = new ArrayList<>();
       for (Cliente c : clientes) {
           for (OrdenCompra o : c.getOrdenes()) {
               if (o.getEstado() != null && o.getEstado().equalsIgnoreCase(estado)) {
                   resultado.add(c);
                   break;
               }
           }
       }
       return resultado;
   }

   public void pendiente(int id) {
       if (id >= 0 && id < clientes.size()) {
           for (OrdenCompra o : clientes.get(id).getOrdenes()) {
               o.marcarPendiente();
           }
       }
   }
}
