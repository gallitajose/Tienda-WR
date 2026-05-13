package logica;

public class DetalleOrden {
	private int cantidad;
	private double costo;
	private Producto producto;
	
	public DetalleOrden(int cantidad, double costo, Producto producto) {
		this.cantidad = cantidad;
		this.costo = costo;
		this.producto = producto;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	public double getCosto() {
		return costo;
	}
	
	public Producto getProducto() {
		return producto;
	}
	
}
