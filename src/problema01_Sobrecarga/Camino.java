package problema01_Sobrecarga;

import java.util.ArrayList;

public class Camino {
	
	ArrayList<Coordenadas> caminos = new ArrayList<Coordenadas>();
	
	public void agregar(Coordenadas x) {
		caminos.add(x);
	}
	
	public void agregar(double lat, double lng) {
		caminos.add(new Coordenadas(lat,lng));
	}
	
}
