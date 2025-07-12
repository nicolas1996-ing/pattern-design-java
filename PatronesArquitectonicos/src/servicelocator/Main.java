package servicelocator;

import servicelocator.locator.LocalizadorServicios;
import servicelocator.service.Servicio;

public class Main {
	 public static void main(String[] args) {
	        LocalizadorServicios locator = new LocalizadorServicios();

	        Servicio servicioA = locator.getServicio("ServicioA");
	        servicioA.ejecutar();

	        Servicio servicioB = locator.getServicio("ServicioB");
	        servicioB.ejecutar();
	    }
}
