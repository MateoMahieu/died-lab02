package problema01_Sobrecarga;


public class Coordenadas {
	
	private double latitud, longitud;

	public Coordenadas(double latitud, double longitud) {
		this.latitud = latitud;
		this.longitud = longitud;
	}

	public Coordenadas() {
	}
	
	
	public double getLatitud() {
		return latitud;
	}


	public double getLongitud() {
		return longitud;
	}


	public boolean equals(Object c) {
		double lat1,long1,lat2,long2;
		lat1 = this.getLatitud();
		lat2 = ((Coordenadas)c).getLatitud();
		long1 = this.getLongitud();
		long2 = ((Coordenadas)c).getLongitud();
		
		if(this.getClass() == null || c.getClass() != this.getClass()) return false;
		else {
			if((lat1 == lat2) & (long1 == long2)) return true;
		}
		return false;
	}

	public String toString() {
		return "Coordenadas: Latitud=" + latitud + ", Longitud=" + longitud;
	}
	

}
