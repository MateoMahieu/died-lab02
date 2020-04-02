package problema02_Herencia;

public class Producto {
	
	private String descripcion;
	private double costo;
	
	public Producto() {
	}

	public Producto(String nombreProducto, double costoProducto) {
		this.descripcion = nombreProducto;
		this.costo = (double) costoProducto;
	}
	
	public double costo() {
		return costo;
	}

	

}
