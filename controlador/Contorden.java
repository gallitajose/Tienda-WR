package controlador;
 
import logica.Cliente;
import logica.DetalleOrden;
import logica.OrdenCompra;
 
import java.util.ArrayList;
 
public class Contorden {
 
    private ArrayList<OrdenCompra> ordenes;
 
    public Contorden() {
        this.ordenes = new ArrayList<>();
    }
 

    public ArrayList<OrdenCompra> listarOrdenes() {
        return ordenes;
    }
 
    public ArrayList<OrdenCompra> listarCliente(int cod) {
        return ordenes;
    }
 
    public void crearOrden(Cliente cliente, int pos) {
 
        if (!ordenes.isEmpty()) {
            OrdenCompra nueva = ordenes.get(ordenes.size() - 1);
            cliente.agregarOrden(nueva);
        }
    }
 

    public void agregarOrden(OrdenCompra orden) {
        ordenes.add(orden);
    }
 
    public OrdenCompra verOrden(int numero) {
        for (OrdenCompra o : ordenes) {
            if (o.getNumero() == numero) {
                return o;
            }
        }
        return null;
    }

    public void borrarOrden(int numero) {
        ordenes.removeIf(o -> o.getNumero() == numero);
    }
 
    public void agregarDetalle(OrdenCompra orden, DetalleOrden detalle) {
        orden.agregarDetalle(detalle);
    }
 
    public void editarDetalle(OrdenCompra orden, DetalleOrden detalle, int pos) {
        orden.editarDetalle(detalle, pos);
    }
 
 
    public void borrarDetalle(OrdenCompra orden, int pos) {
        orden.borarDetalle(pos);
    }
 
    public boolean verificarBorrado(int numero) {
        OrdenCompra o = verOrden(numero);
        if (o != null) {
            return true;
        }
        return false;
    }
}