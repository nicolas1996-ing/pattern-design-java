package servicelocator.service;

public class ServicioA implements Servicio {
    @Override
    public String getNombre() {
        return "Servicio A";
    }

    @Override
    public void ejecutar() {
        System.out.println("Ejecutando Servicio A");
    }
}
