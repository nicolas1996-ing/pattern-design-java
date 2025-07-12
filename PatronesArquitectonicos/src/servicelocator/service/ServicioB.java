package servicelocator.service;

public class ServicioB implements Servicio {
    @Override
    public String getNombre() {
        return "Servicio B";
    }

    @Override
    public void ejecutar() {
        System.out.println("Ejecutando Servicio B");
    }

}
