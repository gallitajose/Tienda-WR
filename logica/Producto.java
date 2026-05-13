package logica;

public class Producto {
	private int codigo;
	private String nombre;
	private float existencias;
	private float precioP; 
	//este  precioP no esta en el diagrama pero haciendo el codigo me doy cuenta que me hizo falta
	
	public Producto(int codigo, String nombre, float existencias, float precioP) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.existencias = existencias;
		this.precioP = precioP;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public float getExistencias() {
		return existencias;
	}
	public float getPrecioP() {
		return precioP;
	}
	
	
}
