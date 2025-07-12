package interceptingfilter;

import interceptingfilter.chain.FiltroChain;
import interceptingfilter.filter.FiltroAutenticacion;
import interceptingfilter.filter.FiltroRegistro;
import interceptingfilter.target.Target;

public class Main {
	public static void main(String[] args) {
        Target target = new Target();
        FiltroChain chain = new FiltroChain(target);

        chain.addFiltro(new FiltroAutenticacion());
        chain.addFiltro(new FiltroRegistro());

        chain.manejarSolicitud("Home");
    }
}
