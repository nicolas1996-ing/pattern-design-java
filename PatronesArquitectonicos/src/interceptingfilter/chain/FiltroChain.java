package interceptingfilter.chain;


import java.util.ArrayList;
import java.util.List;

import interceptingfilter.filter.Filtro;
import interceptingfilter.target.Target;

public class FiltroChain {
	private List<Filtro> filtros = new ArrayList<>();
    private Target target;

    public FiltroChain(Target target) {
        this.target = target;
    }

    public void addFiltro(Filtro filtro) {
        filtros.add(filtro);
    }

    public void manejarSolicitud(String solicitud) {
        for (Filtro filtro : filtros) {
            filtro.ejecutar(solicitud);
        }
        target.ejecutar(solicitud);
    }
}
