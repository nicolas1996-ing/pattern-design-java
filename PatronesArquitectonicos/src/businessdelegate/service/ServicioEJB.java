package businessdelegate.service;

public class ServicioEJB implements BusinessService {
    @Override
    public void ejecutar() {
        System.out.println("Ejecutando Servicio EJB");
    }
}
