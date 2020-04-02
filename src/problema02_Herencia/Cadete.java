package problema02_Herencia;

import java.util.ArrayList;

public class Cadete{
	
	private ArrayList<Comisionable> listaDePedidos;
	private String nombre,apellido; //no es necesario en este ejercicio
	private int dni; //este tampoco
	
	
	public Cadete( String nombre, String apellido, int dni) {
		
		this.listaDePedidos = new ArrayList<Comisionable>();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}
	
	public void agregarPedido(Comisionable c) {
		this.listaDePedidos.add(c);
	}
	
	public void mostrarListaPedidos() {
		for(Comisionable c: listaDePedidos) {
			if((c.getClass()) == Tramite.class)
			System.out.println("tramite");
			else System.out.println("pedido");
		}
	}
	
	public double comisiones() {
		
		double total = (double) 0;
		
		for(Comisionable c: listaDePedidos) {
			
			total += c.comision();
		}
		return total;
	}
	
		
	
	
}
