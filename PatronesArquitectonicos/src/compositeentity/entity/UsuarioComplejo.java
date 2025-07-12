package compositeentity.entity;

import compositeentity.component.Coordenada;
import compositeentity.component.Direccion;

public class UsuarioComplejo {
	 private String nombre;
	    private Coordenada ubicacion;
	    private Direccion direccion;

	    public UsuarioComplejo(String nombre, Coordenada ubicacion, Direccion direccion) {
	        this.nombre = nombre;
	        this.ubicacion = ubicacion;
	        this.direccion = direccion;
	    }

	    public String toString() {
	        return "Usuario [nombre=" + nombre + ", ubicación=" + ubicacion + ", dirección=" + direccion + "]";
	    }
}
