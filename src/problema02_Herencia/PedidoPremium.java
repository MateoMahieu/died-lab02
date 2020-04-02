package problema02_Herencia;

public class PedidoPremium extends Pedido {
	
	private int maxCantidadProductos;
	

	
	public PedidoPremium() {
		super();
		this.maxCantidadProductos = 20;
	}


	public boolean agregarProducto(Producto p) {
		if(productos.size() < maxCantidadProductos) {
			productos.add(p);
			return true;
		}
		else return false;
			
	}
	
	//precio del pedido
	public double precio() {
		
		int contador = 0;
		double precioTotalPedido = (double) 0;
		
		for(Producto p: productos) {
			contador++;
			if(contador <= 5) {
				precioTotalPedido += p.costo() + (p.costo() * (double) 0.2);
			}
			if(contador>5) precioTotalPedido += p.costo() + (p.costo() * (double) 0.3);		
		}
		return precioTotalPedido;
	}
	
	
	//calcula la comision que debe cobrar el cadete por el pedido,si el pedido no fue entregado devuelve 0.
	public double comision() {
		
		if(this.fechaQueSeEntrego != null) {
		double comisionCadete = (double) 0;
		
		comisionCadete += this.precio() * (double) 0.15;
		
		if(this.productos.size() > 10) comisionCadete += (double) 50;
		
		return comisionCadete;
		}
		else return (double) 0;
	}


}
