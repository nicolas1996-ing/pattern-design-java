package compositeentity;

import compositeentity.component.Coordenada;
import compositeentity.component.Direccion;
import compositeentity.entity.UsuarioComplejo;

public class Main {
	 public static void main(String[] args) {
	        Coordenada coord = new Coordenada(40.7128, -74.0060);
	        Direccion dir = new Direccion("Calle 5", "Nueva York");

	        UsuarioComplejo user = new UsuarioComplejo("Carlos", coord, dir);
	        System.out.println(user);
	    }
}
