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
	
	public void agregar(int mtsLt, int mtsLn) {
		
		double earth = 6378.137,  //radius of the earth in kilometer
			    pi = Math.PI,
			    m = (1 / ((2 * pi / 360) * earth)) / 1000;  //1 meter in degree

			double new_latitude = latitude + (mtsLt * m);
			
			
			double earth = 6378.137,  //radius of the earth in kilometer
				    pi = Math.PI,cos = Math.cos(latitude * (pi / 180)),
				    m = (1 / ((2 * pi / 360) * earth)) / 1000;  //1 meter in degree

				double new_longitude = longitude + (mtsLn * m) / cos;
	}
}
