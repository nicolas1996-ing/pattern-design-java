package businessdelegate.service;

public class ServicioLocal implements BusinessService {
    @Override
    public void ejecutar() {
        System.out.println("Ejecutando Servicio Local");
    }
}
