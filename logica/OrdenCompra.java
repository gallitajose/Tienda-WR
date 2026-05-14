package logica;

import java.util.ArrayList;
import java.util.Date;

public class OrdenCompra {
	private int numero;
	private Date fecha;
	private String estado;
	private ArrayList<DetalleOrden> detalle;
	private final static Double IVA = 0.13;
	
	public OrdenCompra(int numero, Date fecha, String estado) {
		this.numero = numero;
		this.fecha = fecha;
		this.estado = estado;
		this.detalle = new ArrayList<>(); 
		
	}

	public int getNumero() {
		return numero;
	}
	
	public void agregarDetalle(DetalleOrden detalles) {
		detalle.add(detalles);
	}
	
	public void editarDetalle(DetalleOrden detalles, int pos) {
		detalle.set(pos, detalles);
	}
	
	public void borarDetalle(int pos) {
		detalle.remove(pos);
	}
	
	public void marcarPendiente() {
		estado = "Pendiente. ";
	}
	
	public void terminar() {
		estado = "Terminada";
	}
	
	public Double calcularTotal() {
		double result = 0;
		for (int i = 0; i < detalle.size(); i++) {
			result += detalle.get(i).getCosto() + calcularImp(detalle.get(i).getCosto());
		}
		return result;
	}
	
	public Double calcularImp(double i) {
		double resultF = i * IVA;
		return resultF;
	}
}
