package problema02_Herencia;

import java.time.LocalDate;
import java.util.Date;

public class Tramite implements Comisionable{

	private String descripcionTramite;
	private String domicilio;
	private LocalDate fechaQueFueRealizado;
	private String hora;
	private int costo;
	
	
	public Tramite(String descripcionTramite, String domicilio, String hora) {
		super();
		this.descripcionTramite = descripcionTramite;
		this.domicilio = domicilio;
		this.fechaQueFueRealizado = null;
		this.hora = hora;
		this.costo = 50;
	}
	
	public LocalDate getFechaQueFueRealizado() {
		return fechaQueFueRealizado;
	}

	public void setFechaQueFueRealizado(LocalDate fechaQueFueRealizado) {
		this.fechaQueFueRealizado = fechaQueFueRealizado;
	}

	public double comision() {
		if(fechaQueFueRealizado != null)
		return (double)20;
		else return 0;
	}
	
	
}
