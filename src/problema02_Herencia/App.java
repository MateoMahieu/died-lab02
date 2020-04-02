package problema02_Herencia;

import java.text.DecimalFormat;

public class App {
	
	public static void main(String[] args) {
		
		DecimalFormat formato = new DecimalFormat("#.00");
		
		PedidoBasico pb1 =  new PedidoBasico();
		PedidoPremium pp1 = new PedidoPremium();
		PedidoPremium pp2 = new PedidoPremium();
		Cadete c1 = new Cadete("hola","Mundo",1);
		
		Producto p1 = new Producto("yerba",100);
		Producto p2 = new Producto("azucar",60);
		Producto p3 = new Producto("galletitas",100.99);
		Producto p4 = new Producto("sal",40);
		Producto p5 = new Producto("fideos",50.60);
		Producto p6 = new Producto("arroz",29.99);
		Producto p7 = new Producto("pan",70.50);
		Producto p8 = new Producto("CocaCola",119.99);
		Producto p9 = new Producto("rollo de papel",99.99);
		Producto p10 = new Producto("agua mineral",55.99);
		
		System.out.println("pedido basico: ");
		System.out.println("Producto agregrado al pedido? "+ pb1.agregarProducto(p1));
		System.out.println("Producto agregrado al pedido? "+ pb1.agregarProducto(p5));
		System.out.println("Producto agregrado al pedido? "+ pb1.agregarProducto(p6));
		System.out.println("Producto agregrado al pedido? "+ pb1.agregarProducto(p9));
		System.out.println("Producto agregrado al pedido? "+ pb1.agregarProducto(p7));
		System.out.println("Producto agregrado al pedido? "+ pb1.agregarProducto(p4));
		
		pb1.setExpress();
		
		System.out.println("Costo del pedido: "+ formato.format(pb1.precio()));
		
		c1.agregarPedido(pb1);
		
		System.out.println("Comision del cadete: "+formato.format(c1.comisiones()));
		
		System.out.println("pedido premium: ");
		System.out.println("Producto agregrado al pedido? "+ pp1.agregarProducto(p1));
		System.out.println("Producto agregrado al pedido? "+ pp1.agregarProducto(p1));
		System.out.println("Producto agregrado al pedido? "+ pp1.agregarProducto(p2));
		System.out.println("Producto agregrado al pedido? "+ pp1.agregarProducto(p3));
		System.out.println("Producto agregrado al pedido? "+ pp1.agregarProducto(p4));
		System.out.println("Producto agregrado al pedido? "+ pp1.agregarProducto(p5));
		System.out.println("Producto agregrado al pedido? "+ pp1.agregarProducto(p6));
		System.out.println("Producto agregrado al pedido? "+ pp1.agregarProducto(p7));
		System.out.println("Producto agregrado al pedido? "+ pp1.agregarProducto(p8));
		System.out.println("Producto agregrado al pedido? "+ pp1.agregarProducto(p9));
		System.out.println("Producto agregrado al pedido? "+ pp1.agregarProducto(p10));
		
		System.out.println("Costo del pedido: "+ formato.format(pp1.precio()));
		
		c1.agregarPedido(pp1);
		
		System.out.println("Comision del cadete: "+formato.format(c1.comisiones()));
		
		System.out.println("pedido premium: ");
		System.out.println("Producto agregrado al pedido? "+ pp2.agregarProducto(p1));
		System.out.println("Producto agregrado al pedido? "+ pp2.agregarProducto(p1));
		System.out.println("Producto agregrado al pedido? "+ pp2.agregarProducto(p2));
		
		System.out.println("Costo del pedido: "+ formato.format(pp2.precio()));
		
		c1.agregarPedido(pp2);
		
		System.out.println("Comision del cadete: "+formato.format(c1.comisiones()));
		
		
	}
}
