package interceptingfilter.filter;

public class FiltroAutenticacion implements Filtro {
    @Override
    public void ejecutar(String solicitud) {
        System.out.println("Verificando autenticación para: " + solicitud);
    }

}
