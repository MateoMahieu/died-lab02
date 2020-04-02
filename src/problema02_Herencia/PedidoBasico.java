package problema02_Herencia;


public class PedidoBasico extends Pedido {
	
	private boolean express;
	private int maxCantidadProductos;
	
	
	public PedidoBasico() {
		super();
		this.express = false;
		this.maxCantidadProductos = 5;
	}
	
	
	//setea que el pedido debe ser express
	public void setExpress() {
		this.express = true;
	}
	
	
	//agrega productos a un pedido
	public boolean agregarProducto(Producto p) {
		
		if(productos.size() < maxCantidadProductos) {
			productos.add(p);
			return true;
		}
		else {
			return false;
		}
	}
	

	//precio del pedido
	public double precio() {
		
		double suma = (double) 0;
		
		for(Producto p: productos) {      
			suma += p.costo() + 
					(p.costo() * (double)0.05); //suma el precio de cada producto mas el 5% del precio del producto
		}
		if(this.express == true) suma += (suma * (double) 0.2); //le cobra el 20% soble el total del envio
		
		return suma;
			
	}
	
	
	//calcula la comision que debe cobrar el cadete por el pedido,si el pedido no fue entregado devuelve 0.
	public double comision() {
		
		if(this.fechaQueSeEntrego != null) {
		double comisionCadete = (double) 0;
		
		comisionCadete += this.precio() * (double) 0.10; //le suma el 10%
		
		return comisionCadete;
		}
		else return (double) 0;
	}
	
	
	
}
