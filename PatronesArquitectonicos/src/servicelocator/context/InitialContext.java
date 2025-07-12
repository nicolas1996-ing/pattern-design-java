package servicelocator.context;

import servicelocator.service.ServicioA;
import servicelocator.service.ServicioB;

public class InitialContext {
	 public Object lookup(String nombre) {
	        if (nombre.equalsIgnoreCase("ServicioA")) {
	            return new ServicioA();
	        } else if (nombre.equalsIgnoreCase("ServicioB")) {
	            return new ServicioB();
	        }
	        return null;
	    }
}
