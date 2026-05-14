package logica;

import java.util.ArrayList;

public class Cliente {
	private String id;
	private String nombre;
	private String email;
	private ArrayList<OrdenCompra> ordenes;
	
	public Cliente(String id, String nombre, String email) {
		this.id = id;
		this.nombre = nombre;
		this.email = email;
		this.ordenes = new ArrayList<>(); 
	}
	
	public void agregarOrden(OrdenCompra orden) {
		ordenes.add(orden);
	}
	
	public void editarOrden(OrdenCompra orden, int pos) {
		ordenes.set(pos, orden);
	}
	
	public void borarOrden(int pos) {
		ordenes.remove(pos);
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public ArrayList<OrdenCompra> getOrdenes() {
	    return ordenes;
	}
	
}
