package problema02_Herencia;

import java.time.LocalDate;
import java.util.ArrayList;

public  abstract class Pedido {
	
	ArrayList<Producto> productos;
	LocalDate fechaQueSeEntrego;
	
	
	
	public Pedido() {
		this.productos = new ArrayList<Producto>();
		this.fechaQueSeEntrego = null;
	}


	public abstract double precio();
	
	
	public abstract double comision();
	
	
	
}
