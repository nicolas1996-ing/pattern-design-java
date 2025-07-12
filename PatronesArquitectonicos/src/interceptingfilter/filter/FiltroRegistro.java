package interceptingfilter.filter;

public class FiltroRegistro implements Filtro {
    @Override
    public void ejecutar(String solicitud) {
        System.out.println("Registrando solicitud: " + solicitud);
    }
}
