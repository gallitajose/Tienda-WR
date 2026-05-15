package controlador;
 
import logica.Producto;
import java.util.ArrayList;
 
public class Contproducto {
 
    private ArrayList<Producto> productos;
 
    public Contproducto() {
        this.productos = new ArrayList<>();
    }
 
    public ArrayList<Producto> listarProductos() {
        return productos;
    }
 
    public void crearProducto(Producto p) {
        productos.add(p);
    }
 

    public void cambiarProducto(Producto p) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getCodigo() == p.getCodigo()) {
                productos.set(i, p);
                break;
            }
        }
    }
 
    public Producto verProducto(int cod) {
        for (Producto p : productos) {
            if (p.getCodigo() == cod) {
                return p;
            }
        }
        return null;
    }
 
    
    public void borrarProducto(int cod) {
        productos.remove(cod);
    }
 
    public boolean verificarBorrado(int cod) {
        Producto p = verProducto(cod);
        if (p != null && p.getExistencias() == 0) {
            return true;
        }
        return false;
    }
 
    public void actualizarExistencia(int cod, float cantidad) {
        for (Producto p : productos) {
            if (p.getCodigo() == cod) {
                Producto actualizado = new Producto(
                    p.getCodigo(),
                    p.getNombre(),
                    p.getExistencias() + cantidad,
                    p.getPrecioP()
                );
                cambiarProducto(actualizado);
                break;
            }
        }
    }
}