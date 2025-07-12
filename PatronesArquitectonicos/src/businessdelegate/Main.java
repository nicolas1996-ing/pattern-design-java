package businessdelegate;

import businessdelegate.delegate.BusinessDelegate;
import businessdelegate.service.ServicioEJB;
import businessdelegate.service.ServicioLocal;

public class Main {
	public static void main(String[] args) {
        BusinessDelegate delegado = new BusinessDelegate();

        // 
        String tipoServicio = "LOCAL"; 

        if (tipoServicio.equals("EJB")) {
            delegado.setServicio(new ServicioEJB());
        } else {
            delegado.setServicio(new ServicioLocal());
        }

        delegado.realizarSolicitud(); 
    }
}
