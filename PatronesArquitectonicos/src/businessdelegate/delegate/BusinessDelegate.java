package businessdelegate.delegate;

import businessdelegate.service.BusinessService;

public class BusinessDelegate {
	private BusinessService servicio;

    public void setServicio(BusinessService servicio) {
        this.servicio = servicio;
    }

    public void realizarSolicitud() {
        servicio.ejecutar();
    }
}
