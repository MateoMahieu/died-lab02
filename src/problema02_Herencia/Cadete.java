package problema02_Herencia;

import java.util.ArrayList;

public class Cadete {
	
	private ArrayList<Pedido> listaDePedidos;
	private String nombre,apellido; //no es necesario en este ejercicio
	private int dni; //este tampoco
	
	
	public Cadete( String nombre, String apellido, int dni) {
		
		this.listaDePedidos = new ArrayList<Pedido>();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}
	
	public void agregarPedido(Pedido p) {
		this.listaDePedidos.add(p);
	}
	
	
	public double comisiones() {
		
		double total =(double) 0;
		
		for(Pedido p: listaDePedidos) {
			total += p.comision();
		}
		return total;
	}
	
		
	
	
}
