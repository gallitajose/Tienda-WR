package logica;

import java.util.ArrayList;
import java.util.Date;

public class OrdenCompra {
	private int numero;
	private Date fecha;
	private String estado;
	private ArrayList<DetalleOrden> detalle;
	private final static Double IVA = 0.13;
	
	public OrdenCompra(int numero, Date fecha, String estado, ArrayList<DetalleOrden> detalle ) {
		this.numero = numero;
		this.fecha = fecha;
		this.estado = estado;
		this.detalle = new ArrayList<>(); 
		
	}

	public int getNumero() {
		return numero;
	}
	
	public void agregarDetalle( detalle) {
		detalle.add(DetalleOrden);
	}
	
	public void editarDetalle(ArrayList<DetalleOrden> detalle) {
		//esto tampoco se
	}
	
	public void borarDetalle(ArrayList<DetalleOrden> detalle) {
		//xd
	}
	public void marcarPendiente() {
		
	}
	
	public void terminar() {
		
	}
	
	public Double calcularTotal() {
		//esto deberia recorrer todo el array e ir sumando?
	}
	
	public Double calcularImp() {
		//aqui uso IVA
	}
}
