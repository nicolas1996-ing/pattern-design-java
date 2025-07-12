package servicelocator.locator;

import servicelocator.cache.CacheServicios;
import servicelocator.context.InitialContext;
import servicelocator.service.Servicio;

public class LocalizadorServicios {
	private CacheServicios cache;
    private InitialContext context;

    public LocalizadorServicios() {
        cache = new CacheServicios();
        context = new InitialContext();
    }

    public Servicio getServicio(String nombre) {
        Servicio servicio = cache.getServicio(nombre);
        if (servicio != null) {
            return servicio;
        }

        try {
            servicio = (Servicio) context.lookup(nombre);
            cache.addServicio(servicio);
        } catch (Exception e) {
            System.out.println("Servicio no encontrado: " + nombre);
        }

        return servicio;
    }
}
