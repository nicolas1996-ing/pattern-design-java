package compositeentity.component;

public class Direccion {
	private String calle;
    private String ciudad;

    public Direccion(String calle, String ciudad) {
        this.calle = calle;
        this.ciudad = ciudad;
    }

    public String toString() {
        return "Dirección [calle=" + calle + ", ciudad=" + ciudad + "]";
    }
}
