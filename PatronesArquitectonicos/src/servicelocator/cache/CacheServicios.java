package servicelocator.cache;

import java.util.HashMap;
import java.util.Map;

import servicelocator.service.Servicio;

public class CacheServicios {
	private Map<String, Servicio> cache = new HashMap<>();

    public void addServicio(Servicio servicio) {
        cache.put(servicio.getNombre(), servicio);
    }

    public Servicio getServicio(String nombre) {
        return cache.get(nombre);
    }
}
