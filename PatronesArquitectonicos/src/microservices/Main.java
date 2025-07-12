package microservices;

import microservices.gateway.ApiGateway;

public class Main {
    public static void main(String[] args) {
        ApiGateway gateway = new ApiGateway();
        gateway.procesarSolicitud("usuario", 1); 
        gateway.procesarSolicitud("pedido", 101);
    }
}
